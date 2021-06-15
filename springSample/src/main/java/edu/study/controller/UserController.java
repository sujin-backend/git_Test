package edu.study.controller;

import java.util.ArrayList;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.study.vo.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("UserController-list");
		
		//user list 화면에서 필요한 user 목록 데이터 가공
		ArrayList<UserVO> alist = new ArrayList<UserVO>(); //user 정보를 담을 list\
		//[{UserVO},{UserVO},...]
		for(int i =0; i<5; i++) {
			UserVO vo = new UserVO();
			vo.setName("홍길동"+(i+1));
			vo.setAge(10);
			vo.setPhone("010-0000-0000");
			
			alist.add(vo);
		}
		//alist 5개의 UserVO가 들어가 있음
		
		model.addAttribute("alistKey",alist); //request에 데이터를 넘김
		
		
		model.addAttribute("name","홍길동"); //request.setAttribute("testKey","testValue");
		model.addAttribute("age",20);
		return "user/list";
	}
	
}
