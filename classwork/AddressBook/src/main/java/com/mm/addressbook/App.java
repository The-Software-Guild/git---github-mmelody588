/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/23/2021
 * purpose: Application Class for Address Book Lab
 */
package com.mm.addressbook;

import com.mm.addressbook.controller.AddressBookController;
import com.mm.addressbook.dao.AddressBookDao;
import com.mm.addressbook.dao.AddressBookDaoImpl;
import com.mm.addressbook.ui.AddressBookView;
import com.mm.addressbook.ui.UserIO;
import com.mm.addressbook.ui.UserIOImpl;

public class App {
    public static void main(String[] args) {
        UserIO io = new UserIOImpl();
        AddressBookView view = new AddressBookView(io);
        AddressBookDao dao = new AddressBookDaoImpl();
        AddressBookController controller = new AddressBookController(view, dao);
        controller.run();
    }
}
