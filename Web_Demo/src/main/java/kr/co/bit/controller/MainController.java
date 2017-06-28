package kr.co.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.bit.commons.Pages;

@Controller
public class MainController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String main(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String page = "";
		System.out.println("메인컨트롤러들어옴");
		try {
			if(session.getAttribute("LOGIN") == null){
				System.out.println("로그인 세션 없을때");
				page = "View/Main";
			}else{
				System.out.println("세션 있음, 보드리스트로 가기");
				return "../../Board/boardList";
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("page : " + page);
		return page;
	}

}
