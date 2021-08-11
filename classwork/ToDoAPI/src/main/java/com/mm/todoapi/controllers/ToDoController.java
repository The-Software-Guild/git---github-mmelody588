/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/09/2021
 * purpose: Controller Class for REST Exercise
 */
package com.mm.todoapi.controllers;

import com.mm.todoapi.servicelayer.ServiceLayer;
import com.mm.todoapi.models.ToDo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {
    @Autowired
    private final ServiceLayer service;

    public ToDoController(ServiceLayer service) {
        this.service = service;
    }

    @GetMapping
    public List<ToDo> all() {
        return service.getAll();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ToDo create(@RequestBody ToDo todo) {
        return service.add(todo);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ToDo> findById(@PathVariable int id) {
        ToDo result = service.findById(id);
        if (result == null) {
            return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }
    
    @PutMapping("/{id}")
    public ToDo update(@PathVariable int id, @RequestBody ToDo todo) {
        todo.setId(id);
        if(service.update(todo))
            return todo;
        return null;
    }
    
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        if (service.deleteById(id)) {
            return "ToDo Deleted";
        }
        return "You still need to do that!";
    }
    
    @PatchMapping("{id}")
    public ToDo complete(@PathVariable int id){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate ld = LocalDate.now();
        
        String CompletedNote = ld.format(formatter);
        ToDo result = service.complete(id, CompletedNote);
        return result;
    }
    
    @PutMapping("redo/{id}")
    public String redo(@PathVariable int id){
        String output = String.valueOf(service.redo(id));
        
        return output;
    }
}
