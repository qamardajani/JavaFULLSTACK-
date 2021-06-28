package com.axsos.Loginandreg.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.Loginandreg.models.User;
	@Repository
	public interface UserRepository extends CrudRepository<User, Long> {
	    User findByEmail(String email);
	}


