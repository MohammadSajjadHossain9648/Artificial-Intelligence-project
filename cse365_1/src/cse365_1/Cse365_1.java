/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse365_1;

/**
 *
 * @author Student
 */
public class Cse365_1 {
    public static int Absolute(int n){
        if(n>0){
            return -n;
        }
        else return n;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(Absolute(-10));
        
        Student s1=new Student (12,"ai");
        s1. show();
    }
    
}

class Student{
    int id;
    String name;
    
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public void show(){
        System.out.println("name : "+name+" &id : "+id);
    }
}