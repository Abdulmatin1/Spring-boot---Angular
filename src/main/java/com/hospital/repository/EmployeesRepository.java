package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Employee;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Long> {

}
