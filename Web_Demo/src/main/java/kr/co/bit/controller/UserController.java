package kr.co.bit.controller;



import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.bit.commons.Pages;
import kr.co.bit.commons.URLs;
import kr.co.bit.service.impl.UserService;
import kr.co.bit.user.dto.JoinDTO;
import kr.co.bit.user.dto.LoginDTO;
import kr.co.bit.user.vo.LoginVO;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/User")
public class UserController {

	private static final Logger logger = 
			LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value=URLs.URI_LOGOUT, method=RequestMethod.GET)
	public String logout(HttpServletRequest request){
		request.getSession().invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value=URLs.URI_LOGIN_CHK, method=RequestMethod.POST)
	public String loginChk(@RequestParam(value="userid")String userid, 
						@RequestParam(value="userpw")String userpw, Model model){
		
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserid(userid);
		loginDTO.setUserpw(userpw);
		
		LoginVO loginVO = new LoginVO();
		loginVO = userService.login(loginDTO);
		
		model.addAttribute("loginVO", loginVO);
		
		
		
		return "redirect:/";
	}
	
	@RequestMapping(value=URLs.URI_JOIN_VIEW, method=RequestMethod.GET)
	public String joinView(){
		
		return Pages.VIEW_USER_JOIN;
	}
	
	@RequestMapping(value=URLs.URI_ID_CHK, method=RequestMethod.GET)
	@ResponseBody
	public JSONObject id_chk(@RequestParam(value="userid")String userid){
		String msg = "이 아이디는 사용이 가능합니다.";
		logger.info("컨트롤러의 id_chk : "+userid);
		String result = userService.id_chk(userid);
		
		if(result != null){
			msg = "이 아이디는 사용할 수 없습니다.";
		}
		
		JSONObject id_chk_json = new JSONObject();
		
		id_chk_json.put("id_chk", msg);
		
		return id_chk_json;
	}
	
	@RequestMapping(value=URLs.URI_JOIN, method=RequestMethod.POST)
	public String join(JoinDTO joinDTO){
		
		
		int result = userService.join(joinDTO);
		
		if(result == 1){
			return "redirect:/";
		}
		
		return Pages.VIEW_USER_JOIN_FAILED;
	}
	
	
}
