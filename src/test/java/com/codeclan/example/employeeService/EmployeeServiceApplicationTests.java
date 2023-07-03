package com.codeclan.example.employeeService;

import com.codeclan.example.employeeService.models.Employee;
import com.codeclan.example.employeeService.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Employee bobCratchit = new Employee("Bob Cratchit", 5, "DZ32Y", "bobby-c@mcscrooge.com");
		employeeRepository.save(bobCratchit);

	}

}
