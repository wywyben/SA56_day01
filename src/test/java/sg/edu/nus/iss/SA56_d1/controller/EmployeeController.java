package sg.edu.nus.iss.SA56_d1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.SA56_d1.model.Employee;
import sg.edu.nus.iss.SA56_d1.service.EmployeeService;

@Controller
@RequestMapping(path = "/employees")
public class EmployeeController {
    @Autowired
    EmployeeService empSvc;
    
    @GetMapping(value = "/list")
    public @ResponseBody List<Employee> getAllEmployees(){
        return empSvc.getAllEmployees();
    }

    public @ResponseBody List<Employee> getEmployeesByLastName(String lastName){
        return empSvc.getEmployeesByLastName(lastName);
    }
}
