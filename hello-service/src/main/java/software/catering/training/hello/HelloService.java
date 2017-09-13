package software.catering.training.hello;

import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloService {
    
    public static void main(String[] args) {
        SpringApplication.run(HelloService.class, args);
    }
    
    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
    public HelloResponse hello() throws UnknownHostException {
        return new HelloResponse("test");
    }
}