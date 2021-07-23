/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/23/2021
 * purpose: DAO Exception Class for Address Book Lab
 */
package com.mm.addressbook.dao;

public class AddressBookDaoException extends Exception {

    public AddressBookDaoException(String string) {
        super(string);
    }

    public AddressBookDaoException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }
}
