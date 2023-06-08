package sg.edu.nus.iss.SA56_d1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.SA56_d1.model.Employee;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    
    public EmployeeService(){
        employees.add(new Employee("1", "Hsien Loong", "Lee"));
        employees.add(new Employee("2", "Derrick", "Tan"));
        employees.add(new Employee("3", "Maverick", "Tan"));
    }

    public List<Employee> getAllEmployees(){
        return this.employees;
    }

    public List<Employee> getEmployeesByLastName(String lastName){
        List<Employee> filterEmployees = employees
                                            .stream()
                                            .filter(emp -> emp.getLastName()
                                            .equals(lastName))
                                            .toList();
        return filterEmployees;
    }
}
