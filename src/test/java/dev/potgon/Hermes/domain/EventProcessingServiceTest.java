package dev.potgon.Hermes.domain;

import dev.potgon.Hermes.application.HermesApplication;
import dev.potgon.Hermes.domain.event.EventDomain;
import dev.potgon.Hermes.domain.event.EventProcessingService;
import dev.potgon.Hermes.infrastructure.event.EventAdapter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;

@SpringBootTest(classes = HermesApplication.class)
@ExtendWith(MockitoExtension.class)
public class EventProcessingServiceTest {

    @InjectMocks
    private EventProcessingService eventProcessingService;

    @Mock
    private EventAdapter eventAdapter;

    @Test
    void shouldAddTimestampAndProcessEvent() {
        EventDomain event = EventDomain.builder()
                .eventId("1")
                .eventType("Financial")
                .eventPayload("potgon: 1000")
                .build();

        event = eventProcessingService.processEvent(event);

        assertNotNull(event.getEventTimestamp());
    }

    @Test
    void shouldPersistInDynamoDB() {
        EventDomain event = EventDomain.builder()
                .eventId("1")
                .eventType("Financial")
                .eventPayload("potgon: 1000")
                .build();

        event = eventProcessingService.processEvent(event);

        verify(eventAdapter).save(event);
    }

}
