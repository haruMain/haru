package haru.com.bbs.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value = "/bbsForm.do")
	public String bbsForm() throws Exception {
		return "user/bbs/form";
	}
	
	/*
	 * @RequestMapping(value = "/insertBbs.do", method=RequestMethod.POST) public
	 * String insertBbs(BbsVO vo) throws Exception {
	 * System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@INSERT 컨트롤러");
	 * bbsService.insertBbs(vo); //return "user/bbs/bbsList"; return
	 * "redirect:/bbsList.do"; }
	 */
	
		
	@RequestMapping(value = "/insertBbs.do", method=RequestMethod.POST) 
	public String insertBbs(@RequestParam Map<String, Object> commandMap) throws Exception {
		bbsService.insertBbs(commandMap); 
		
		return "redirect:/bbsList.do";
	}
	
	@RequestMapping(value = "/updateBbs.do", method=RequestMethod.POST) 
	public String updateBbs(@RequestParam Map<String, Object> commandMap, BbsVO vo) throws Exception {
		//System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@update seq : " + seq);
		String title = vo.getTitle();
		String content = vo.getContent();
		
		 vo.setSeq(Integer.parseInt(commandMap.get("seq").toString())); // seq 값 설정
		 vo.setTitle(commandMap.get("title").toString()); // title 값 설정
		 vo.setContent(commandMap.get("content").toString()); // content 값 설정
		
		//vo.setTitle(title);
		//vo.setContent(content);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@update title : " + title);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@update content : " + content);
		bbsService.updateBbs(vo);
		
		return "redirect:/bbsList.do";
	}
	
	@RequestMapping(value = "/deleteBbs.do", method=RequestMethod.POST)
	public String deleteBbs(@RequestParam Map<String, Object> commandMap, @RequestParam("seq") int seq) throws Exception {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@delete seq : " + seq);
		bbsService.deleteBbs(commandMap);
		return "redirect:/bbsList.do";
	}
	
	@RequestMapping(value = "/bbsList.do")
	public String selectBbsList(@RequestParam Map<String, Object> commandMap, BbsVO vo, ModelMap model) throws Exception {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@컨트롤러");
		List<?> bbsList = bbsService.selectBbsList(commandMap);
		
		model.addAttribute("rsList", bbsList);
		return "user/bbs/bbsList";
	}
	
	
	@RequestMapping(value = "/selectBbs.do")
	public String selectBbs(@RequestParam("seq") int seq,  Model model) throws Exception {
	    BbsVO result = bbsService.selectBbs(seq);
	    
	    model.addAttribute("result", result);
	    return "user/bbs/form";
	}
	
	
	public void setDataSource_main(BbsService bbsService) {
		this.bbsService = bbsService;
	}
	

}
