package dev.potgon.Hermes.domain.event;

public interface EventPort {
    void save(EventDomain event);
}
