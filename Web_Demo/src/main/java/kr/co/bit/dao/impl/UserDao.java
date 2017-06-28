package kr.co.bit.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bit.user.dao.IUserDao;
import kr.co.bit.user.dto.JoinDTO;
import kr.co.bit.user.dto.LoginDTO;
import kr.co.bit.user.vo.LoginVO;

@Repository
public class UserDao implements IUserDao {

	private static final String namespace = "kr.co.pjb.mapper.UserMapper";
	
	@Autowired
	SqlSession sqlSession;
	
	
	@Override
	public LoginVO login(LoginDTO loginDTO) {
		
		return sqlSession.selectOne(namespace+".login_chk", loginDTO);
	}

	@Override
	public int join(JoinDTO joinDTO) {
		int result = 0;
		try {
			result = sqlSession.insert(namespace+".join", joinDTO);
		} catch (Exception e) {
			result = 0;
		}
		
		return result;
	}

	@Override
	public String id_chk(String userid) {
		return sqlSession.selectOne(namespace+".id_chk", userid);
	}

}
