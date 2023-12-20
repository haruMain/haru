package haru.com.bbs.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.SampleDefaultVO;

@Controller
public class BbsController {
	
	@RequestMapping(value = "/main.do")
	public String main(@ModelAttribute("searchVO") SampleDefaultVO searchVO, ModelMap model) throws Exception {

		

		return "user/bbsList";
	}

}
