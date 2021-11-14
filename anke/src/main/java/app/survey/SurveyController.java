package app.survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/survey")
public class SurveyController {
    
    @GetMapping("form") 
    public String form(Model model) {
		model.addAttribute("form", new SurveyForm());
		return "form";
    }
    
    @PostMapping("confirm")
    public String confirm(@ModelAttribute SurveyForm surveyForm, Model model) {
		model.addAttribute("form", surveyForm);
		return "confirm";
    }
    
}