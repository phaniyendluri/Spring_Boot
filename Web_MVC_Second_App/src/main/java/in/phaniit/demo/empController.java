package in.phaniit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class empController {
    @Autowired
    private EmpRepository repo;

    @GetMapping("/")
    public ModelAndView getemp(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;

    }
    @GetMapping("/emp")
    public String getemp_tblByID(@RequestParam("emp_id") Integer id, Model model){
        ModelAndView mav = new ModelAndView();
        Optional<emp_tbl> findById = repo.findById(id);
        if(findById.isPresent()){
            emp_tbl empobj = findById.get();
            model.addAttribute("emp_tbl",empobj);
        }else{
            emp_tbl emp = new emp_tbl();
            emp.setEmp_id(101);
            emp.setEmp_dept("Dev");
            emp.setEmp_name("Phani");
            emp.setEmp_gender("Male");
            emp.setEmp_salary(50000);
            repo.save(emp);
//            mav.addObject(emp);
        }
        mav.setViewName("index");
        return "index";
    }
}
