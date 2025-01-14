package dev.potgon.Hermes.domain.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDomain {
    String eventId;
    String eventType;
    String eventPayload;
}
