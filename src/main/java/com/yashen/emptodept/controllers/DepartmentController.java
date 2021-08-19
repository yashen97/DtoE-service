package com.yashen.emptodept.controllers;

import com.yashen.emptodept.models.Department;
import com.yashen.emptodept.models.Employee;
import com.yashen.emptodept.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/post")
    public String addNewDepartment(@RequestBody Department department){
        departmentService.addOrUpdate(department);
        return"200 Ok";
    }

    @PostMapping("/postall")
    public String addAllDepartments(@RequestBody List<Department> departmentList){
        departmentService.addAll(departmentList);
        return "200 Ok";
    }

    @GetMapping("/get/{id}")
    public @ResponseBody Optional<Department> getOneEmployee(@PathVariable Long id){
        return departmentService.getSelectedDept(id);
    }

    @GetMapping("/getall")
    public @ResponseBody List<Department> getAllDepartments(){
        return departmentService.getAll();
    }

    @PutMapping("/update")
    public String updateADepartment(@RequestBody Department department){
        departmentService.addOrUpdate(department);
        return "204 updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable Long id){
        departmentService.deleteDept(id);
        return "204 Deleted";
    }
}
