package dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dto.memDTO;

@Repository
public class memDAOImple implements memDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}


	@Override
	public List<memDTO> selectMember() throws Exception {
		return null;
	}

}
