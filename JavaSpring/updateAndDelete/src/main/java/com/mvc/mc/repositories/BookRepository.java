package com.mvc.mc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mvc.mc.models.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findAll();
	void deleteById(Long id);

}