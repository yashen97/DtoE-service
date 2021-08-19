package com.yashen.emptodept.repositories;

import com.yashen.emptodept.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepo extends JpaRepository<Department,Long> {
}
