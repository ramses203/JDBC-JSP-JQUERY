package kr.co.kosmo.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	// spring 기본설정이 forward
	@PostMapping("/myprofileAdd3")
	public ModelAndView myProcess3(ProfileVO vo, ModelAndView mav) {
		System.out.println("name:"+vo.getName());
		int age = vo.getAge() * 3;
		System.out.println("age:"+age);
		vo.setAge(age);
		//requestScope 값을 저장
		mav.addObject("vo", vo);//request.setAttribute랑 같은개념
		mav.setViewName("profileRes");
		return mav;
	}
	
		@PostMapping("/myprofileAdd4")
		public ModelAndView myProcess4(ProfileVO vo, ModelAndView mav) {
			String name = vo.getName();
			vo.setName(name);
			System.out.println(vo.getName());
			
			int age = vo.getAge();
			vo.setAge(age);
			System.out.println(vo.getAge());
			
			String email = vo.getEmail();
			vo.setEmail(email);
			System.out.println(vo.getEmail());
			
			String gender = vo.getGender();
			vo.setGender(gender);
			System.out.println(vo.getGender());
			
			String cartype = vo.getCartype();
			vo.setCartype(cartype);
			System.out.println(vo.getCartype());
			
			List<String> cls = vo.getCls();
			vo.setCls(cls);
			
			System.out.println("programing : "+vo.getCls());
			
			
			mav.addObject("vo", vo);
			mav.setViewName("profileRes");
			return mav;
		}
	
}
