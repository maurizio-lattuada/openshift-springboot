package software.catering.training.hello;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@Component
@RestController
@RequestMapping("/")
public class SickService implements HealthIndicator {

    private boolean sick = false;

    @RequestMapping(path = "/sick", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String getSick() throws UnknownHostException {
        sick = true;
        return "got sick! :-( " + ServiceIdentificationUtil.getServiceIdentification();
    }

    @RequestMapping(path = "/healthy", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String getHealthy() throws UnknownHostException {
        sick = false;
        return "got healthy! :-) " + ServiceIdentificationUtil.getServiceIdentification();
    }

    @Override
    public Health health() {
        Health.Builder health;
        if (sick) {
            health = Health.down();
        } else {
            health = Health.up();
        }
        return health.build();
    }

    public boolean isSick() {
        return sick;
    }
}