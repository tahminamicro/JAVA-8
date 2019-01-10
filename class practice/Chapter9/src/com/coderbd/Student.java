
package com.coderbd;


public class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
    //way 1 default constructor and setter method

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsScienceMajor(boolean isScienceMajor) {
        this.isScienceMajor = isScienceMajor;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    //way 3==========

    public Student(String name, int age, boolean isScienceMajor, char gender) {
        this.name = name;
        this.age = age;
        this.isScienceMajor = isScienceMajor;
        this.gender = gender;
    }
    
    
    
    
    
}

class Test{
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setName("Tahmina");
        student1.setAge(25);
        student1.setIsScienceMajor(true);
        student1.setGender('F');
        
        System.out.println("name? " + student1.name);
        System.out.println("age? "+ student1.age);
        System.out.println("isScienceMajor? "+ student1.isScienceMajor);
        System.out.println("gender? "+ student1.gender);
        
        //way-2==========
        Student student2= new Student();
        student2.name="Sultana";
        student2.age=25;
        student2.isScienceMajor= true;
        student2.gender='F';
        
        System.out.println("name? " + student2.name);
        System.out.println("age? "+ student2.age);
        System.out.println("isScienceMajor? "+ student2.isScienceMajor);
        System.out.println("gender? "+ student2.gender);
        
        //way-3
        
        Student student3 = new Student("Sumaiya",25, true, 'F' );
        System.out.println("name? " + student3.name);
        System.out.println("age? "+ student3.age);
        System.out.println("isScienceMajor? "+ student3.isScienceMajor);
        System.out.println("gender? "+ student3.gender);
        
        
    }

}
