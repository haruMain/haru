package haru.com.bbs.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import haru.com.bbs.service.BbsService;
import haru.com.bbs.service.BbsVO;

@Controller
public class BbsController {
	
	
	@Resource(name = "bbsService")
    private BbsService bbsService;
	
	@RequestMapping(value = "/main.do")
	public String main() throws Exception {
		return "main";
	}
	@RequestMapping(value = "/insertBbs.do")
	public String insertBbs() throws Exception {
		return "main";
	}
	
	@RequestMapping(value = "/updateBbs.do")
	public String updateBbs() throws Exception {
		return "main";
	}
	
	@RequestMapping(value = "/deleteBbs.do")
	public String deleteBbs() throws Exception {
		return "main";
	}
	
	@RequestMapping(value = "/bbsList.do")
	public String selectBbsList(@RequestParam Map<String, Object> commandMap, BbsVO vo, ModelMap model) throws Exception {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@컨트롤러");
		List<?> bbsList = bbsService.selectBbsList(commandMap);
		
		model.addAttribute("rsList", bbsList);
		return "user/bbs/bbsList";
	}
	
	@RequestMapping(value = "/selectBbs.do")
	public String selectBbs() throws Exception {
		return "main";
	}
	

}
