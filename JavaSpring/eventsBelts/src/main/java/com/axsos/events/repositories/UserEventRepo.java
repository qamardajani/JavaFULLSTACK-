package com.axsos.events.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.events.models.UserEvent;

@Repository
public interface UserEventRepo extends CrudRepository<UserEvent, Long> {

}