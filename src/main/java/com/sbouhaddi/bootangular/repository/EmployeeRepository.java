package com.sbouhaddi.bootangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbouhaddi.bootangular.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
