package dao;

import java.util.List;

import dto.memDTO;

public interface memDAO {
	
	public List<memDTO> selectMember() throws Exception;

}
