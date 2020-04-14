package org.cap.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Min;

public class Employee {

   private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public Employee(){

    }

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
