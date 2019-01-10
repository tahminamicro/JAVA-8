/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.learn.eduQualification;


public class PassingYear {
    int id;
    String name;

    public PassingYear(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PassingYear{" + "id=" + id + ", name=" + name + '}';
    }

   
    
}
