package dev.potgon.Hermes.infrastructure.event;

import dev.potgon.Hermes.domain.event.EventDomain;
import dev.potgon.Hermes.domain.event.EventPort;
import io.awspring.cloud.dynamodb.DynamoDbTemplate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EventAdapter implements EventPort {

    private DynamoDbTemplate dynamoDbTemplate;

    @Override
    public void save(EventDomain event) {
        dynamoDbTemplate.save(event);
    }

}
