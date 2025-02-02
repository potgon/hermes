package dev.potgon.Hermes.domain.event;

import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class EventProcessingService {

    private EventPort eventPort;

    public EventDomain processEvent(EventDomain event) {
        event.setEventTimestamp(Instant.now());
        eventPort.save(event);
        return event;
    }

}
