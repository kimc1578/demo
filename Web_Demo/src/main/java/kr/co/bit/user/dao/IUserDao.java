package kr.co.bit.user.dao;

import kr.co.bit.user.dto.JoinDTO;
import kr.co.bit.user.dto.LoginDTO;
import kr.co.bit.user.vo.LoginVO;
import net.sf.json.JSONObject;

public interface IUserDao {
	public LoginVO login(LoginDTO loginDTO);
	public int join(JoinDTO joinDTO);
	public String id_chk(String userid);

}
