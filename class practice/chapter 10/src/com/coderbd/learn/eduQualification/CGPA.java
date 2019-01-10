/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.learn.eduQualification;


public class CGPA {
    int id;
    String name;

    public CGPA(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CGPA{" + "id=" + id + ", name=" + name + '}';
    }

    
    
}
