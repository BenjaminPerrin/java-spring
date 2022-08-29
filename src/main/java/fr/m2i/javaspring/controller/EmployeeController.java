
package fr.m2i.javaspring.controller;

import fr.m2i.javaspring.model.Employee;
import fr.m2i.javaspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService service;
    
    @Autowired
    public EmployeeController(EmployeeService service){
        this.service = service;
    }
    
    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
        return service.findAll();
    }
}
