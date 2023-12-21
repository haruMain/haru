package haru.com.bbs.service.impl;

import java.util.List;

import haru.com.bbs.service.BbsVO;

public interface BoardMapper {
	
	 public List<?> selectBbsList(BbsVO vo) throws Exception; 

}
