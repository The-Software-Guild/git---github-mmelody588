/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/29/2021
 * purpose: Service Class for Book Tracker Project
 */
package com.mm.booktracker.service;

import com.mm.booktracker.dao.BookDao;
import com.mm.booktracker.dto.Book;
import java.util.List;

public class BookService {
    private BookDao dao;

    public BookService(BookDao dao) {
        this.dao = dao;
    }
    
    public Book getBookByTitle(String title) {
        return dao.getBookByTitle(title);
    }
    
    public List<Book> getAllBooks() {
        return dao.getAllBooks();
    }
    
    public Book addBook(Book book) {
        return dao.addBook(book);
    }
    
    public void updateBook(Book book) {
        dao.updateBook(book);
    }
    
    public void deleteBookByTitle(String title) {
        dao.deleteBookByTitle(title);
    }
}
