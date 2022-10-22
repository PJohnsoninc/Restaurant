package business.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import business.beans.Employee;

/**
 * @author peterjohnson - pmjohnson5
 * CIS175-Fall 2022
 * October 14, 2022
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Employee employee() {
		Employee bean = new Employee();
		bean.setName("Annette Smith");
		bean.setPhone("444-444-4444");
		bean.setPosition("manager");
		bean.setYearsEmployed(7);
		return bean;
	}

}
