package com.yashen.emptodept.repositories;

import com.yashen.emptodept.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Long> {
}
