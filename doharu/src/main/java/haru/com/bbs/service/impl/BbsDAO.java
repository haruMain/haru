package haru.com.bbs.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

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
	    private static final Logger logger = LoggerFactory.getLogger(BbsDAO.class);
	    //logger.info("@@@@@@@@@@@@@@@@@@@@@@@@DAO");
	    
	    public void insertBbs(@RequestParam Map<String, Object> commandMap) throws Exception {
	    	insert("insertBbs", commandMap);
	    }
	    public void updateBbs(BbsVO vo) throws Exception {
	    	System.out.println("@@@@@@@@@@@@UPDATE DAO: " + vo.getSeq());
			update("updateBbs", vo);
		}
	    public void deleteBbs(@RequestParam Map<String, Object> commandMap) throws Exception {
			delete("deleteBbs", commandMap);
		}
		public List<?> selectBbsList(@RequestParam Map<String, Object> commandMap) throws Exception {
			return selectList("selectBbsList", commandMap);
		}
		int selectBbsTotCnt(@RequestParam Map<String, Object> commandMap) throws Exception {
			return (Integer)selectOne("selectBbsTotCnt", commandMap);
		}
		public BbsVO selectBbs(int seq) throws Exception {
			System.out.println("@@@@@@@@@@@@SEQ DAO: " + seq);
			return selectOne("selectBbs", seq);
		}
	    
	    
	    
}
