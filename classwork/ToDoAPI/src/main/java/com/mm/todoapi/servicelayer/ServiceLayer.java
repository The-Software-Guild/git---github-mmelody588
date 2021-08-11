/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/10/2021
 * purpose: Service Class 2 for REST Exercise
 */
package com.mm.todoapi.servicelayer;

import com.mm.todoapi.data.ToDoDao;
import com.mm.todoapi.models.ToDo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceLayer {
    @Autowired
    private ToDoDao myDao;
    
    public ServiceLayer(ToDoDao myDao){
        this.myDao = myDao;
    }
    
    public ToDo add(ToDo todo){
        return myDao.add(todo);
    }

    public List<ToDo> getAll(){
        return myDao.getAll();
    }

    public ToDo findById(int id){
        return myDao.findById(id);
    }

    public boolean update(ToDo todo){
        return myDao.update(todo);
    }
    
    public boolean deleteById(int id){
        if(this.checkForId(id)){
            ToDo myTD = myDao.findById(id);
            if(myTD.isFinished())
                return myDao.deleteById(id);
        }
        return false;
    }
    
    public ToDo complete(int id, String note){
        if(this.checkForId(id)){
            ToDo myTD = myDao.findById(id);
            
            String newNote = myTD.isFinished() ? myTD.getNote() : myTD.getNote().concat("|" + note);
            myTD.setNote(newNote);
            myTD.setFinished(true);
            myDao.update(myTD);
            return myDao.complete(id);
        }
        return null;
    }
    
    public boolean redo(int id) {
        if(this.checkForId(id)){
            ToDo myTD = myDao.findById(id);
            myTD.setFinished(false);
            return myDao.update(myTD);
        }
        return false;
    }
    
    public boolean checkForId(int id){
        List<ToDo> list = myDao.getAll();
        for(ToDo td : list){
            if(td.getId() == id)
                return true;
        }
        return false;
    }
}
