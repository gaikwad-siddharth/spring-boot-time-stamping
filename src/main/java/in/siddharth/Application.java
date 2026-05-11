package in.siddharth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.siddharth.entity.Employee;
import in.siddharth.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		
		Employee emps = new Employee();
		emps.setEmpId(6);
		emps.setEmpName("Pratiksha");
		emps.setEmpSalary(25000.00);
		emps.setEmpGender("female");
		emps.setDept("Doctor");
		
		repo.save(emps);
	}

}
