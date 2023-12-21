package haru.com.bbs.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import haru.com.bbs.service.BbsService;

@Service("bbsService")
public class BbsServiceImpl implements BbsService {
	
	@Resource(name = "bbsDAO")
	private BbsDAO bbsDAO;
	

	public void insertBbs(Map<String, Object> commandMap) throws Exception {
		bbsDAO.insertBbs(commandMap);
		
	}
	public void updateBbs(Map<String, Object> commandMap) throws Exception {
		bbsDAO.updateBbs(commandMap);
		
	}
	public void deleteBbs(Map<String, Object> commandMap) throws Exception {
		bbsDAO.deleteBbs(commandMap);
		
	}
	public List<?> selectBbsList(@RequestParam Map<String, Object> commandMap) throws Exception {
		return bbsDAO.selectBbsList(commandMap);
	}
	public int selectBbsTotCnt(@RequestParam Map<String, Object> commandMap) throws Exception {
		return bbsDAO.selectBbsTotCnt(commandMap);
	}
	public Map<String, Object> selectBbs(int seq) throws Exception {
		return bbsDAO.selectBbs(seq);
	}
}
