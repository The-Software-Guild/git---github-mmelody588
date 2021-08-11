/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/09/2021
 * purpose: DTO Class for REST Exercise
 */
package com.mm.todoapi.models;

public class ToDo {
    private int id;
    private String todo;
    private String note;
    private boolean finished;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
