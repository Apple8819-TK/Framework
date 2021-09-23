package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	@RequestMapping(value = "/sample/test") //http://localhost:8080/sample/test
	private String hello() {
		return "test";
	}
}