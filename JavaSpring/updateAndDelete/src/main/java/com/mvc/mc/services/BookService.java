package com.mvc.mc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mvc.mc.models.Book;
import com.mvc.mc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepsitory;
	
public BookService (BookRepository bookRepository) {
	this.bookRepsitory=bookRepository;
			
}
public List<Book> allBooks() {
    return bookRepsitory.findAll();
}

public Book createBook(Book book) {
    return bookRepsitory.save(book);
}
public Book findBook(Long id) {
	Optional<Book> findBook = bookRepsitory.findById(id);
    if(findBook.isPresent()) {
        return findBook.get();
    } else {
        return null;
    }
}
public Book updateBook(Long id , String title , String description, String language, int numberOfPages) {

	Optional<Book> updateBook = bookRepsitory.findById(id);
    if(updateBook.isPresent()) {
    	updateBook.get().setTitle(title);
    	updateBook.get().setDescription(description);
    	updateBook.get().setLanguage(language);
    	updateBook.get().setNumberOfPages(numberOfPages);
        return createBook(updateBook.get());
    } 
    else {
        return null;
    }
    
}
public void deleteBook(Long id) {
	Optional<Book> optionalBook = bookRepsitory.findById(id);
	if (optionalBook.isPresent()) {
		bookRepsitory.deleteById(id);
	}
}
}
	

