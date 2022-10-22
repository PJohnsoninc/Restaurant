package business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import business.beans.Employee;
import business.controller.BeanConfiguration;
import business.repository.EmployeeRepository;

@SpringBootApplication
public class RestaurantApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}
	
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// Use the existing bean
		Employee e = appContext.getBean("employee", Employee.class);	
		repo.save(e);
		
		// Creating a bean to use that is not managed by Spring
		Employee em = new Employee("Maria Jones", "444-444-4445", "waitress", 4);
		repo.save(em);
		
		List<Employee> allEmployees = repo.findAll();
		for(Employee people: allEmployees) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
		
	}

}
