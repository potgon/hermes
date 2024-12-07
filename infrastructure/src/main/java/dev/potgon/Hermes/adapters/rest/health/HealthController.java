package dev.potgon.Hermes.adapters.rest.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Health health() {
        return Health.up()
                .withDetail("application", "Running")
                .build();
    }
}
