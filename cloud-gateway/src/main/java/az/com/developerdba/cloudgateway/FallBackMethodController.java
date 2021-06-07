package az.com.developerdba.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userFallBackMethodController(){
        return "User Service is taking longer than Expected." +
                "Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentFallBackMethodController(){
        return "Department Service is taking longer than Expected." +
                "Please try again later";
    }
}
