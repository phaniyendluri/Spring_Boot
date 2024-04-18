package in.phaniit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private studentService service;

   @GetMapping("/")
   public String loadIndexPage(Model model){
       formInitBinding(model);
       return "index";

    }

    private void formInitBinding(Model model) {
        model.addAttribute("Student", new Student());
        model.addAttribute("courses",service.getCourses());
        System.out.println(service.getTimings());
        model.addAttribute("timings",service.getTimings());
    }

    @PostMapping("/save")
       public String saveStudent(@ModelAttribute("Student") Student s, Model model){
        boolean issaved = service.saveStudent(s);
        System.out.println(issaved);
        if (issaved){
            model.addAttribute("msg","Data Saved");
        }
        else{
            model.addAttribute("msg","Data NotSaved...");
        }

        formInitBinding(model);
        return "index";
    }
}
