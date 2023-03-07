package fsp;

import javax.swing.*;

public class Employee {
    String  name;
    int id;
    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }


}
 class department extends  Employee{
    department(String name,int id){
        super(name,id);
    }


}
