package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {


    @GetMapping("")
    public String showForm(ModelMap model){
        model.addAttribute("employee", new Employee());
        return "/create";
    }

    @PostMapping("/create")
    public String create(Employee employee, Model model){
        model.addAttribute("employee", employee);
        return "/info";
    }
}
