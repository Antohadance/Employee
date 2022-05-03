package com.example.Employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public EmployeeController(EmployeeService employeeService) {this.employeeService = employeeService;}

    @GetMapping("/add")
    public String add(@RequestParam String firstName, @RequestParam String lastName){
        Employee result = employeeService.add(firstName, lastName);
        return generateMassage(result,"успешно создан");
    }
    @GetMapping("/remove")
    public String remove(@RequestParam String firstName,@RequestParam String lastName){
        Employee result = employeeService.remove(firstName, lastName);
        return generateMassage(result,"удален");
    }
    @GetMapping("/find")
    public Employee find (@RequestParam String firstName,@RequestParam String lastName){
        return employeeService.find(firstName,lastName);
    }

    @GetMapping("/all")
    public Employee[] findAll(){
        return employeeService.findAll();
    }

    private String generateMassage(Employee employee,String status){
        return String.format("Сотрудник %s %s %s.",
                employee.getLastName(),
                employee.getFirstName(),
                status,
                employee);
    }
}
