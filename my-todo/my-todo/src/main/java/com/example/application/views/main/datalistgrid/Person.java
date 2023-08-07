/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.datalistgrid;

/**
 *
 * @author Lenovo
 */
public class Person {
    private String title;
    private int birthYear;
    private String name;
    private String email;
    private int age;
    private String Descripcion = "Descripcioin de una persona, valor default ";

    public Person() {
    }
    
    public Person(String title, int birthYear, String name, String email, int age) {
        this.title = title;
        this.birthYear = birthYear;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
