package dadaController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainController {
	
	@RequestMapping("main.do")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView(); // 객채만들기
		mav.setViewName("/main");
		return mav; 
	}
	
}
