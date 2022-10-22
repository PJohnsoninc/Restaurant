package business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import business.beans.Employee;

/**
 * @author peterjohnson - pmjohnson5
 * CIS175-Fall 2022
 * October 14, 2022
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> { }

