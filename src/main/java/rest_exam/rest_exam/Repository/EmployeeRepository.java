package rest_exam.rest_exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rest_exam.rest_exam.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Long> {
}
