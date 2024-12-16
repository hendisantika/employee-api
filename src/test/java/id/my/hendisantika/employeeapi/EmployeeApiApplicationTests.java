package id.my.hendisantika.employeeapi;

import id.my.hendisantika.employeeapi.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@Testcontainers
@SpringBootTest(
        properties = {
                "management.endpoint.health.show-details=always",
                "spring.datasource.url=jdbc:tc:mysql:9.1.0:///employeeDB"
        },
        webEnvironment = RANDOM_PORT
)
class EmployeeApiApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void deleteAll() {
        employeeRepository.deleteAll();
    }

}
