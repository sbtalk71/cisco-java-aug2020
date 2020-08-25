package com.demo.entity;
public class Employee{
private int id;
private String name;

public Employee(int id, String name){
this.id=id;
this.name=name;
}

public void printEmpDetails(){

System.out.println(id+" "+name);
}
}