package springmvc;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller @RequestMapping(value="/spring")
public class springExample {

	@RequestMapping(value="/cars")
	public String printCars() {
		
		return "cars";
	}
	
	@RequestMapping(value="/welcome", method = RequestMethod.POST)
	public String returnCars(String car) {
		System.out.println("name of the car is "+car);
//		ModelAndView mv = new ModelAndView();
		return "cars";
	}
}
