package com.yashen.emptodept.services;

import com.yashen.emptodept.models.Department;
import com.yashen.emptodept.repositories.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    DeptRepo deptRepo;

    public Department addOrUpdate(Department department){
        return deptRepo.save(department);
    }

    public List<Department> addAll(List<Department> departmentList){
        return deptRepo.saveAll(departmentList);
    }

    public Optional<Department> getSelectedDept(Long id){
        return deptRepo.findById(id);
    }

    public void deleteDept(Long id){
        deptRepo.deleteById(id);
    }

  public List<Department> getAll(){
        return deptRepo.findAll();
  }
}
