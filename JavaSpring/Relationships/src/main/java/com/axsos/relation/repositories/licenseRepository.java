package com.axsos.relation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.relation.models.License;
@Repository
public interface licenseRepository extends CrudRepository <License,Long> {

}
