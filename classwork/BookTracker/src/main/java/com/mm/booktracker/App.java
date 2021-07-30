/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/29/2021
 * purpose: Application Class for Book Tracker Project
 */
package com.mm.booktracker;

import com.mm.booktracker.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext appContext
                = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        BookController controller = appContext.getBean("controller", BookController.class);
        controller.run();
    }
}
