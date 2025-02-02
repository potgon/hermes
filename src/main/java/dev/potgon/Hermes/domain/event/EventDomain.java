package dev.potgon.Hermes.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
public class EventDomain {
    String eventId;
    String eventType;
    String eventPayload;
    Instant eventTimestamp;
}
