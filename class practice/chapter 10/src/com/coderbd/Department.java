/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;


public class Department {
    private int id;
    private String depname;

    public Department() {
    }

    public Department(int id, String depname) {
        this.id = id;
        this.depname = depname;
    }

    public int getId() {
        return id;
    }

    public String getDepname() {
        return depname;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", depname=" + depname + '}';
    }
    
    
}
