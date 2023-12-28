package haru.com.bbs.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import haru.com.bbs.service.BbsVO;


public interface BoardMapper {
	
	void insertBbs(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	void updateBbs(BbsVO vo) throws Exception;
	
	void deleteBbs(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	List<?> selectBbsList(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	int selectBbsTotCnt(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	BbsVO selectBbs(int seq) throws Exception;

}
