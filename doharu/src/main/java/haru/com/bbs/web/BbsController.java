package haru.com.bbs.web;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.SampleDefaultVO;
import haru.com.bbs.service.BbsService;
import haru.com.bbs.service.BbsVO;

@Controller
public class BbsController {
	
	@Resource(name = "bbsService")
    private BbsService bbsService;
	
	@RequestMapping(value = "/main.do")
	public String main(@ModelAttribute("searchVO") SampleDefaultVO searchVO, ModelMap model) throws Exception {
		return "main";
	}
	
	@RequestMapping(value = "/bbsList.do")
	public String selectBbs(BbsVO vo, ModelMap model) throws Exception {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@컨트롤러");
		List<?> bbsList = bbsService.selectBbsList(vo);
		model.addAttribute("rsList", bbsList);
		return "user/bbsList";
	}

}
