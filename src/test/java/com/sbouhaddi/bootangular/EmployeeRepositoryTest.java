package com.sbouhaddi.bootangular;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sbouhaddi.bootangular.model.Employee;
import com.sbouhaddi.bootangular.repository.EmployeeRepository;

@RunWith(JUnitPlatform.class)
@DataJpaTest
public class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository repository;

	private Employee employee;

	@BeforeAll
	static void setup() {
		System.out.println("@BeforeAll executed");
	}

	@BeforeEach
	void setupThis() {

		System.out.println("@BeforeEach executed");
		employee = new Employee();
		employee.setFirstName("sabri");
		employee.setLastName("sabri");
		employee.setEmailId("sabri");
		repository.save(employee);
	}

	@Test
	void testCalcOne() {
		System.out.println("======TEST ONE EXECUTED=======");
		List<Employee> employees = repository.findAll();
		Assertions.assertEquals(employees.size(), 1);
	}

	@AfterEach
	void tearThis() {
		System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void tear() {
		System.out.println("@AfterAll executed");
	}
}
