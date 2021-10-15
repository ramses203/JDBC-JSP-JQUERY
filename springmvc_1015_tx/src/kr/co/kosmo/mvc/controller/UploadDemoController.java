package kr.co.kosmo.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import kr.co.kosmo.mvc.dao.UpDemoDaoInter;
import kr.co.kosmo.mvc.dto.UpdemoSubVo;
import kr.co.kosmo.mvc.dto.UploadDemoVo;
import kr.co.kosmo.mvc.service.UpDemoServiceInter;

@Controller
public class UploadDemoController {
	@Autowired
	private UpDemoDaoInter upDemoDaoInter;
	@Autowired
	private UpDemoServiceInter upDemoServiceInter;
	
	
	@GetMapping("/upform")
	public String upform() {
		return "updemo/upform";
	}
	
	
	@PostMapping("/upload2")
	public String uploadFile(Model m, UploadDemoVo vo,HttpServletRequest request) {
		String img_path ="resources\\imgfile";
		String r_path = request.getRealPath("/");
		System.out.println("r_path:"+r_path);
		String oriFn = vo.getMfile().getOriginalFilename();
		System.out.println("oriFn:"+oriFn);
		// ������ ��ο� ���� �̸��� ����
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path).append("\\");
		path.append(oriFn);
		System.out.println("FullPath :"+path);
		// �ΰ� ���� Ȯ��
		long size = vo.getMfile().getSize();
		String contentType = vo.getMfile().getContentType();
		System.out.println("����ũ��:"+size);
		System.out.println("������ Type:"+contentType);
		// ������ ���� ��ο� ���� ��ü�� �����ؼ� ����
		File f = new File(path.toString());
		try {
			vo.getMfile().transferTo(f);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		// DB �Է�ó��
		vo.setOrifile(oriFn);
		upDemoDaoInter.addUp(vo);
		return "redirect:updemoList";
	}
	@RequestMapping(value="/updemoList")
	public String demoList(Model m) {
		List<UploadDemoVo> list = upDemoDaoInter.getlist();
		m.addAttribute("list", list);
		return "updemo/uplist";
	}
	@GetMapping("/updemoDetail")
	public String updetailList(Model m,int no) {
		List<Map<String, String>> vo = upDemoDaoInter.getDetail(no);
		m.addAttribute("vo", vo);
		return "updemo/updetail";
	}
	
	@GetMapping("/upform2")
	public String upform2() {
		return "updemo/upform2";
	}
	
	@PostMapping("/upload3")
	public String uploadFile2(Model m, UploadDemoVo vo, HttpServletRequest request) {
		String img_path = "resources\\imgfile";
		String r_path = request.getRealPath("/");
		System.out.println("r_path:"+ r_path);
		List<UpdemoSubVo> imglist  = new ArrayList<>();
		for(MultipartFile mf : vo.getMfile2()) {
			String oriFn = mf.getOriginalFilename();
			StringBuffer path = new StringBuffer();
			path.append(r_path).append(img_path).append("\\");
			path.append(oriFn);
			System.out.println("FullPath :"+ path);
			//-------------------------------------------------------
			File f = new File(path.toString());
			try {
				mf.transferTo(f);
				UpdemoSubVo subVO = new UpdemoSubVo();
				subVO.setImg1(oriFn);
				imglist.add(subVO);
				vo.setOrifile(oriFn);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			}
			upDemoServiceInter.addUpdemo(vo, imglist);
			return "redirect:updemoList";
	}
}
