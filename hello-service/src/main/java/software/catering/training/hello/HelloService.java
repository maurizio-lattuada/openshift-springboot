package software.catering.training.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class HelloService {

    public static void main(String[] args) {
        SpringApplication.run(HelloService.class, args);
    }

    @Autowired
    private SickService sickService;

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public HelloResponse hello() throws UnknownHostException {

        if (sickService.isSick()) {
            return new HelloResponse("hello, I'm sick");
        } else {
            return new HelloResponse("hello");
        }
    }
}

