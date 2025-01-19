package dev.potgon.Hermes.infrastructure.event;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@DynamoDbBean
public class Event {

    String eventId;
    String eventType;
    String eventPayload;
}
