package id.my.hendisantika.employeeapi.repository;

import id.my.hendisantika.employeeapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : employee-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/12/24
 * Time: 19.01
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
