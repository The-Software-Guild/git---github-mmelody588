/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/10/2021
 * purpose: DAO Stub for REST Exercise
 */
package com.mm.todoapi.servicelayer;

import com.mm.todoapi.data.ToDoDao;
import com.mm.todoapi.models.ToDo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
public class StubDAOTest implements ToDoDao{

    ToDo StubToDo = new ToDo();
    ToDo StubToDoF = new ToDo();
    
    private void setUpStub(){
        StubToDo.setId(42);
        StubToDo.setTodo("The Only Thing ToDo");
        StubToDo.setNote("This is my last thing to do");
        StubToDo.setFinished(true);
        
        StubToDoF.setId(24);
        StubToDoF.setTodo("There is Always One More Thing");
        StubToDoF.setNote("So after this I'm done");
        StubToDoF.setFinished(true);
    }
    
    @Override
    public ToDo add(ToDo todo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ToDo> getAll() {
        this.setUpStub();
        List<ToDo> list = new ArrayList<ToDo>();
        list.add(StubToDo);
        list.add(StubToDoF);
        return list;
    }

    @Override
    public ToDo findById(int id) {
        if(id == 42)
            return this.StubToDo;
        else if(id == 24)
            return this.StubToDoF;
        return null;
    }

    @Override
    public boolean update(ToDo todo) {
        int update = todo.getId();
        if(update == 42){
            this.StubToDo.setNote(todo.getNote());
            //this.StubToDo.setTodo(todo.getTodo());
            //this.StubToDo.setFinished(todo.isFinished());
        }else if(update == 24){
            this.StubToDo.setNote(todo.getNote());
            //this.StubToDo.setTodo(todo.getTodo());
            //this.StubToDo.setFinished(todo.isFinished());
        }
        return true;
    }

    @Override
    public boolean deleteById(int id) {
        return (id == 42);
    }

    @Override
    public ToDo complete(int id) {
        this.setUpStub();
        if(id == 42){
            this.StubToDo.setFinished(true);
            this.StubToDo.setNote("");
            return this.StubToDo;
        }else if(id == 24){
            this.StubToDoF.setFinished(true);
            this.StubToDoF.setNote("");
            return this.StubToDoF;
        }
        return null;
    }
    
}
