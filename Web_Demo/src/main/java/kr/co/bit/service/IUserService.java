package kr.co.bit.service;

import kr.co.bit.user.dto.JoinDTO;
import kr.co.bit.user.dto.LoginDTO;
import kr.co.bit.user.vo.LoginVO;

public interface IUserService {
	public LoginVO login(LoginDTO loginDTO);
	public int join(JoinDTO joinDTO);
	public String id_chk(String userid);

}
