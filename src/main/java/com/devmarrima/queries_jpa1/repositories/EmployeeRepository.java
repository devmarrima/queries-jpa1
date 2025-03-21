package com.devmarrima.queries_jpa1.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devmarrima.queries_jpa1.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT obj FROM Employee obj JOIN FETCH obj.department")
    List<Employee> employeeWithDepartment();

    @Query(value = "SELECT obj FROM Employee obj JOIN FETCH obj.department",
    countQuery = "SELECT COUNT(obj) FROM Employee obj JOIN obj.department")
    Page<Employee> employeeWithDepartment(Pageable pageable);


}
