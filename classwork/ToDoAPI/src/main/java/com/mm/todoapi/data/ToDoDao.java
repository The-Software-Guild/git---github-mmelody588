/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/09/2021
 * purpose: DAO Interface for REST Exercise
 */
package com.mm.todoapi.data;

import com.mm.todoapi.models.ToDo;
import java.util.List;

public interface ToDoDao {
    ToDo add(ToDo todo);

    List<ToDo> getAll();

    ToDo findById(int id);

    // true if item exists and is updated
    boolean update(ToDo todo);

    // true if item exists and is deleted
    boolean deleteById(int id);
    
    ToDo complete(int id);
}
