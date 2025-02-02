package dev.potgon.Hermes.infrastructure.event;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.time.Instant;

@DynamoDbBean
public class Event {

    String eventId;
    String eventType;
    String eventPayload;
    Instant eventTimestamp;

    @DynamoDbPartitionKey
    public String getEventId() {
        return eventId;
    }
}
