package kr.co.kosmo.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.dto.ProfileVO;

@Controller
public class MyProFileController {
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping("/form")
	public String myForm() {
		return "profileForm";
	}
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping("/myprofileAdd")
	public String myProcess1(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("name:"+name);
		return "profileForm";
	}
	
	@PostMapping("/myprofileAdd2")
	public String myProcess2(String name, int age) {
		System.out.println("name:"+name);
		age = age*2;
		System.out.println("age:"+age);
		return "profileForm";
	}
	// spring �⺻������ forward
	@PostMapping("/myprofileAdd3")
	public ModelAndView myProcess3(ProfileVO vo, ModelAndView mav) {
		System.out.println("name:"+vo.getName());
		int age = vo.getAge() * 3;
		System.out.println("age:"+age);
		vo.setAge(age);
		//requestScope ���� ����
		mav.addObject("vo", vo);//request.setAttribute�� ��������
		mav.setViewName("profileRes");
		return mav;
	}
	
		@PostMapping("/myprofileAdd4")
		public String myProcess4(ProfileVO vo, Model model) {
			System.out.println("name:"+vo.getName());
			int age = vo.getAge() * 3;
			System.out.println("age:"+age);
			vo.setAge(age);
			return "profileRes";
		}
		
		@PostMapping("/myprofileAdd5")
		public String myProcess5(@ModelAttribute("vo") ProfileVO vo) {
			System.out.println("name:"+vo.getName());
			int age = vo.getAge() * 3;
			System.out.println("age:"+age);
			vo.setAge(age);
			return "profileRes";
		}
	
}
