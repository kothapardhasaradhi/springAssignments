package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springMVC.modal.Marks;

@Controller
public class SpringController {
	

	@RequestMapping("/marks")
	public ModelAndView displayTotal(){
		
		
		
		 return new ModelAndView("total","command",new Marks());  
		
	}
	@RequestMapping("/total")
	public ModelAndView displayTotal(@ModelAttribute("marks") Marks marks){
		
		marks.setTotal(marks.getEnglishMarks()+marks.getMathsMarks()+marks.getScienceMarks());
		
		 return new ModelAndView("total","command",marks);  
		
	}
}
