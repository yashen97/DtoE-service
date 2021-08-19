package com.yashen.emptodept.controllers;

import com.yashen.emptodept.models.Employee;

import com.yashen.emptodept.services.EmployeeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employee")
public class EmployeeController {
     @Autowired
     EmployeeService employeeService;

    @PostMapping("/post")
    public String postOneEmployee(@RequestBody Employee employee){
        employeeService.addOrUpdate(employee);
        return "200 Ok";
    }

    @PostMapping("/postall")
    public String postAllEmployees(@RequestBody List<Employee> employeeList){
        employeeService.addAll(employeeList);
        return "200 Ok";
    }

    @GetMapping("/get/{id}")
    public @ResponseBody Optional<Employee> getOneEmployee(@PathVariable Long id){
        return employeeService.findOne(id);
    }

    @GetMapping("/getall")
    public @ResponseBody List<Employee> getAllEmployee(){
        return employeeService.getAll();
    }

    @PutMapping("update/{id}")
    public String updateEmployee(@RequestBody Employee employee){
        employeeService.addOrUpdate(employee);
        return "202 Updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeService.delete(id);
        return  "204 deleted";
    }


}
