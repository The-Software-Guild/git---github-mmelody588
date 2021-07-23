/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/23/2021
 * purpose: DAO Interface for Address Book Lab
 */
package com.mm.addressbook.dao;

import com.mm.addressbook.dto.Address;
import java.util.List;

public interface AddressBookDao {
    Address addAddress(Address addr);
    
    Address deleteAddress(String name);
    
    int countAddress();
    
    List<Address> listAddress();
    
    Address findAddress(String name);
    
    Address editAddress(String name, Address addr);
    
    void loadRoster() throws AddressBookDaoException;
    
    void saveRoster() throws AddressBookDaoException;
}
