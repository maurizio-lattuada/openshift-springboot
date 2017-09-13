package software.catering.training.hello;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@Component
@RestController
public class SickService implements HealthIndicator {

    private boolean sick = false;

    @RequestMapping("/sick")
    public String getSick() throws UnknownHostException {
        sick = true;
        return "got sick! :-( " + ServiceIdentificationUtil.getServiceIdentification();
    }

    @RequestMapping("/healthy")
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