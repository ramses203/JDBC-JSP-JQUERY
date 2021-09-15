package ex2;

// *****=> Python Django ���� ���� ����
import java.lang.reflect.Array;
import java.util.ArrayList;


import ex1.dto.MemberDTO;

public class ValueObject {

	// int num, String pwd, String name, String address, int age, String email
	public void addMember(MemberDTO vo) {
		System.out.println("DB");
		// �Է�ó��
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		if (vo.getAge() > 19) {
			System.out.println("����");
		}

	}

	public ArrayList<MemberDTO> getMemberList() {
		ArrayList<MemberDTO> arlist = new ArrayList<>();
		
		for (int i = 0; i < 8; i++) {
			MemberDTO vo = new MemberDTO();
			vo.setNum(i);
			vo.setId("xman"+i);
			vo.setAge(20+i);
			arlist.add(vo);
			
		}
		return arlist;
	}
public static void main(String[] args) {
	
	ValueObject ref = new ValueObject();
	MemberDTO vo = new MemberDTO();
	vo.setNum(10);
	vo.setId("bigmama");
	vo.setAge(50);
	ref.addMember(vo);
	System.out.println("=============");
	ArrayList<MemberDTO> arlist = ref.getMemberList();
	for(MemberDTO e : arlist) {
		System.out.println(e);
	}
	
}
}
