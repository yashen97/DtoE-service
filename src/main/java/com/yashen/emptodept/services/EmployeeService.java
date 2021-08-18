package com.yashen.emptodept.services;

import com.yashen.emptodept.models.Employee;
import com.yashen.emptodept.repositories.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmpRepo empRepo;

    public Employee addOrUpdate(Employee employee){
        return empRepo.save(employee);
    }               //POST

    public List<Employee> addAll(List<Employee> employeeList){return empRepo.saveAll(employeeList);} //POST

    public List<Employee> getAll(List<Employee> employeeList){                                      //GET
        return empRepo.findAll();
    }

    public Optional<Employee> findOne(Long id){                                                     //GET
        return empRepo.findById(id);
    }

    public void delete(Long id){                                                                    //DELETE
        empRepo.deleteById(id);
    }



}
