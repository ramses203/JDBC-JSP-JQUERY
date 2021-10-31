package lol.mvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lol.mvc.dao.AdminInter;
import lol.mvc.dto.GameVO;
import lol.mvc.dto.PlayVO;

@Controller
public class adminController {
	@Autowired
	private AdminInter adminInter;

	@RequestMapping("gameInsertForm")
	public String gameInsertPage() {
		return "main/gameInsertForm";
	}

	@RequestMapping("gameInsert")
	public String gameInsert(HttpSession session, String count) {
		String[] mapary = { "lsy", "pjh", "hjw", "yoj" }; // 4��
		
		List<String> uidary = adminInter.userList();
		List<String> champary = adminInter.champList();
		List<String> skillary = adminInter.skillList();
		List<String> itemary = adminInter.itemList();
		
		Random r = new Random();
		// map ����
		int cnt = Integer.parseInt(count);
		for (int c = 1; c <= cnt; c++) {
			String map = mapary[r.nextInt(4)];
			// win ����
			int win = r.nextInt(2) + 1;

			// user ����� 10���� ���� �迭(�ߺ�X)
			int randten[] = new int[10];
			for (int i = 0; i < 10; i++) {
				randten[i] = r.nextInt(uidary.size());
				for (int j = 0; j < i; j++) {
					if (randten[i] == randten[j]) {
						i--;
					}
				}
			}
			// user 10�� ����
			String[] userlist = new String[10];
			for (int i = 1; i < 10; i++) {
				String id = (String) session.getAttribute("sessionID");
				userlist[0] = id;
				if(id != uidary.get(randten[i])) {
					userlist[i] = uidary.get(randten[i]);
				}
			}

			// champ ����� ���� �迭(�ߺ�X)
			for (int i = 0; i < 10; i++) {
				randten[i] = r.nextInt(champary.size());// 0~24
				for (int j = 0; j < i; j++) {
					if (randten[i] == randten[j]) {
						i--;
					}
				}
			}
			// champ 10�� ����
			String[] champlist = new String[10];
			for (int i = 0; i < 10; i++) {
				champlist[i] = champary.get(randten[i]);
			}

			// item ����� ���� �迭(�ߺ�X)
			for (int i = 0; i < 10; i++) {
				randten[i] = r.nextInt(itemary.size());// 0~29
				for (int j = 0; j < i; j++) {
					if (randten[i] == randten[j]) {
						i--;
					}
				}
			}
			// item 10�� ����
			String[] itemlist = new String[10];
			for (int i = 0; i < 10; i++) {
				itemlist[i] = itemary.get(randten[i]);
			}

			// skill ����� ���� �迭(�ߺ�X)
			for (int i = 0; i < 10; i++) {
				randten[i] = r.nextInt(skillary.size());// 0~24
				for (int j = 0; j < i; j++) {
					if (randten[i] == randten[j]) {
						i--;
					}
				}
			}
			// skill 10�� ����
			String[] skilllist = new String[10];
			for (int i = 0; i < 10; i++) {
				skilllist[i] = skillary.get(randten[i]);
			}

			// K/D ����� ���� �迭(�ߺ�X)
			int killlist[] = new int[10];
			for (int i = 0; i < 10; i++) {
				killlist[i] = r.nextInt(11);// 0~10
				for (int j = 0; j < i; j++) {
					if (killlist[i] == killlist[j]) {
						i--;
					}
				}
			}
			int deathlist[] = new int[10];
			for (int i = 0; i < 10; i++) {
				deathlist[i] = r.nextInt(11);// 0~10
				for (int j = 0; j < i; j++) {
					if (deathlist[i] == deathlist[j]) {
						i--;
					}
				}
			}

			int room = adminInter.lastroomno() + 1;

			// GameVo ���� �� �� �Է�
			GameVO gvo = new GameVO();
			gvo.setRoomno(room);
			gvo.setMap(map);

			adminInter.insertGame(gvo);

			// PlayVo ���� �� �� �Է�
			for (int i = 0; i < 10; i++) {
				PlayVO pvo = new PlayVO();
				pvo.setProomno(room);
				pvo.setPuid(userlist[i]);
				pvo.setPcname(champlist[i]);
				pvo.setPsname(skilllist[i]);
				pvo.setPiname(itemlist[i]);
				if (i < 5) {
					pvo.setTeam("r");
					if (win == 1) {
						pvo.setWin("w");
					} else {
						pvo.setWin("l");
					}
				} else {
					pvo.setTeam("b");
					if (win == 1) {
						pvo.setWin("l");
					} else {
						pvo.setWin("w");
					}
				}
				pvo.setKill(killlist[i]);
				pvo.setDeath(deathlist[i]);
				adminInter.insertPlay(pvo);
				adminInter.updateScore(pvo);
				adminInter.updateZero();
				adminInter.updateTier(pvo);
			}
		}
		return "redirect:/gameInsertForm";
	}
}
