package dev.potgon.Hermes.infrastructure.event;

import dev.potgon.Hermes.domain.event.EventDomain;
import org.mapstruct.Mapper;

@Mapper
public interface EventMapper {

    EventDomain dtoToDomain(Event event);

    Event domainToDto(EventDomain domain);
}
