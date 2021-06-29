package com.axsos.events.repositories;
import org.springframework.data.repository.CrudRepository;

import com.axsos.events.models.Event;

public interface EventRepo extends CrudRepository<Event, Long> {
	
}