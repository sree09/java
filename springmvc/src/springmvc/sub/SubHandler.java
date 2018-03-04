package springmvc.sub;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller @RequestMapping("/login")
public class SubHandler {

	@RequestMapping(value="/auth",method=RequestMethod.POST )
	public ModelAndView auth(@RequestParam("name") String name, @RequestParam("pass") String pass) {
		String msg =" ";
		if(name.equals(pass))
			msg="Login Success";
		else
			msg = "Login Failed";
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg",msg);
		mv.setViewName("output");
		return mv;
	}
}
