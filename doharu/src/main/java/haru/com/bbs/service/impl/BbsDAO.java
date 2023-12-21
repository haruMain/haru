package haru.com.bbs.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import haru.com.bbs.service.BbsVO;


@Repository("bbsDAO")
public class BbsDAO extends EgovAbstractDAO {
	
	private static final String namespace = "bbsDAO";
	
	private static final Logger logger = LoggerFactory.getLogger(BbsDAO.class);
	
	public List<?> selectBbsList(BbsVO vo) throws Exception {
		  return (List<?>) select(namespace + ".selectBbsList", vo);
	}
	
	
}
