import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.sankar.spring.config.AppConfig;
import com.sankar.spring.model.Employee;
import com.sankar.spring.service.EmployeeService;

public class AppMain {
	
	public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
        EmployeeService service = (EmployeeService) context.getBean("employeeService");
 
        Employee employee1 = new Employee();
        employee1.setName("Han Yenn");
        employee1.setJoiningDate(new Date());
        employee1.setSalary(new BigDecimal(10000));
        employee1.setSsn("ssn00000001");
 
        Employee employee2 = new Employee();
        employee2.setName("Dan Thomas");
        employee2.setJoiningDate(new Date());
        employee2.setSalary(new BigDecimal(20000));
        employee2.setSsn("ssn00000002");
 
        service.saveEmployee(employee1);
        service.saveEmployee(employee2);
 
       
        List<Employee> employeeList = service.findAllEmployees();
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
 
        context.close();
    }

}
