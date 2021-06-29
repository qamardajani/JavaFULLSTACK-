package com.axsos.events.repositories;

import org.springframework.data.repository.CrudRepository;

import com.axsos.events.models.Message;

public interface MessageRepo extends CrudRepository<Message, Long> {

}