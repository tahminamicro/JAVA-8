
package com.coderbd.learn.eduQualification;


public class Session {
    int id;
    String name;

    public Session(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Session{" + "id=" + id + ", name=" + name + '}';
    }
    
}
