package com.example.employeemanagement.controller;

import com.example.employeemanagement.domain.Employee;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
        return (List<Employee>) employeeService.listAll();
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable Long id) {
        return (Employee) employeeService.getById(id);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.update(employee);
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.delete(id);
    }
}
