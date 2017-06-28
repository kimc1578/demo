package kr.co.bit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bit.dao.impl.UserDao;
import kr.co.bit.service.IUserService;
import kr.co.bit.user.dto.JoinDTO;
import kr.co.bit.user.dto.LoginDTO;
import kr.co.bit.user.vo.LoginVO;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public LoginVO login(LoginDTO loginDTO) {

		return userDao.login(loginDTO);
	}

	@Override
	public int join(JoinDTO joinDTO) {
		return userDao.join(joinDTO);
	}

	@Override
	public String id_chk(String userid) {
		return userDao.id_chk(userid);
	}

}
