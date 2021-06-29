package com.axsos.events.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.events.models.User;


@Repository
public interface userRepo extends CrudRepository<User, Long> {
    User findByEmail(String email);
}