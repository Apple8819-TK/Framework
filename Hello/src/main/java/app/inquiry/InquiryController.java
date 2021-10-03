package app.inquiry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {
    
    @GetMapping("form") 
    public String form(Model model) {
		model.addAttribute("form", new InquiryForm());
		return "from";
    }
    
    @PostMapping("confirm")
    public String confirm(@ModelAttribute InquiryForm inquiryForm, Model model) {
		model.addAttribute("from", inquiryForm);
		return "confirm";
    }
    
}