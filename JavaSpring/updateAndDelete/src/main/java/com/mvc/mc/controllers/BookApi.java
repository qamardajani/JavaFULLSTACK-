package com.mvc.mc.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.mc.models.Book;
import com.mvc.mc.services.BookService;
@Controller
public class BookApi {
    private final BookService bookService;
    public BookApi(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "/books/index.jsp";
    }
    @RequestMapping(value="/books", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "/books/new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String description, @RequestParam(value="language") String language, @RequestParam(value="numberOfPages") Integer numberOfPages) {
        Book book = bookService.updateBook( id ,title ,description, language, numberOfPages);
        return book;
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
    @RequestMapping("/api/books/{id}")
    public String show(@PathVariable("id") Long id,Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
       
        return "/books/show.jsp";
    }
    
}