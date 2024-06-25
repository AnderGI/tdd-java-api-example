package com.tdd.api.domain.event.command;

public interface EventCommandBus {
	<E extends EventCommand, H extends EventCommandHandler> void register(Class<E> eventCommand, H handler);
	<E extends EventCommand> void dispatch(E eventCommand);
}
