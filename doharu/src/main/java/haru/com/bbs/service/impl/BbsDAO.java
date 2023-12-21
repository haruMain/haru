package haru.com.bbs.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import haru.com.bbs.service.BbsVO;


@Repository("bbsDAO")
public class BbsDAO extends EgovAbstractMapper {
	
	/*
	 * private static final String namespace = "bbsDAO";
	 * 
	 * private static final Logger logger = LoggerFactory.getLogger(BbsDAO.class);
	 * 
	 * public List<?> selectBbsList(BbsVO vo) throws Exception {
	 * System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@DAO"); return (List<?>)
	 * selectList(namespace + ".bbsList", vo); }
	 */
	 //private static final String namespace = "haru.com.bbs.service.BbsVO";
	    private static final Logger logger = LoggerFactory.getLogger(BbsDAO.class);

	    public List<?> selectBbsList(BbsVO vo) throws Exception {
	        logger.info("@@@@@@@@@@@@@@@@@@@@@@@@DAO");
	        //return (List<?>) selectList(namespace + ".bbsList", vo);
	        return selectList("selectBbsList", vo);
	    }
	
}
