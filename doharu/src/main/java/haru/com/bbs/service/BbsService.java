package haru.com.bbs.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

public interface BbsService {
	
	void insertBbs(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	void updateBbs(BbsVO vo) throws Exception;
	
	void deleteBbs(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	List<?> selectBbsList(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	int selectBbsTotCnt(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	BbsVO selectBbs(int seq) throws Exception;

}
