package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	@GetMapping(value = "/sample/test") //http://localhost:8080/sample/test
	private String hello(Model model) {
		model.addAttribute("message", "Hello World");
		return "test";
	}
}