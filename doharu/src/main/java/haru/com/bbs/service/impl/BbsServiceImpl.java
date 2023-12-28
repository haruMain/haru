package haru.com.bbs.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import haru.com.bbs.service.BbsService;
import haru.com.bbs.service.BbsVO;

@Service("bbsService")
public class BbsServiceImpl implements BbsService {
	
	@Resource(name = "bbsDAO")
	private BbsDAO bbsDAO;
	

	/*
	 * public void insertBbs(Map<String, Object> commandMap) throws Exception {
	 * bbsDAO.insertBbs(commandMap);
	 * 
	 * }
	 */
	public void insertBbs(@RequestParam Map<String, Object> commandMap) throws Exception {
		  bbsDAO.insertBbs(commandMap);
		  
	}
	public void updateBbs(BbsVO vo) throws Exception {
		bbsDAO.updateBbs(vo);
		
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
	public BbsVO selectBbs(int seq) throws Exception {
		return bbsDAO.selectBbs(seq);
	}
}
