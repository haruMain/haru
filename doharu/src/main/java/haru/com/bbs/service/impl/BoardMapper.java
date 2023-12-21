package haru.com.bbs.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;


public interface BoardMapper {
	
	void insertBbs(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	void updateBbs(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	void deleteBbs(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	List<?> selectBbsList(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	int selectBbsTotCnt(@RequestParam Map<String, Object> commandMap) throws Exception;
	
	Map<String, Object> selectBbs(int seq) throws Exception;

}
