package haru.com.bbs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import haru.com.bbs.service.BbsService;
import haru.com.bbs.service.BbsVO;

public class BbsServiceImpl implements BbsService {
	
	@Resource(name = "bbsDAO")
	private BbsDAO bbsDAO;

	@Override
	public List<?> selectBbsList(BbsVO vo) throws Exception {
		return bbsDAO.selectBbsList(vo);
	}

}
