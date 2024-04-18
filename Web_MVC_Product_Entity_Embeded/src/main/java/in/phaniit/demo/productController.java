package in.phaniit.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class productController {
    @GetMapping("/")

    public String loadForm(Model model){
        model.addAttribute("product",new productEntity());

        return "index";
    }

}
