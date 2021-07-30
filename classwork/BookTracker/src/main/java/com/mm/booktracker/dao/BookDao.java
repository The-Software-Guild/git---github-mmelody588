/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/29/2021
 * purpose: DAO Interface for Book Tracker Project
 */
package com.mm.booktracker.dao;

import com.mm.booktracker.dto.Book;
import java.util.List;

public interface BookDao {
    Book getBookByTitle(String title);
    List<Book> getAllBooks();
    Book addBook(Book book);
    void updateBook(Book book);
    void deleteBookByTitle(String title);
}
