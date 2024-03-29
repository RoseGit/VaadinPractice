/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.databinding;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

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
    private String emailTest;
    
    @NotBlank(message="no vacio pplease ")
    @Size(max= 3, message="3 caracteres maximo")
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    public String getEmailTest() {
        return emailTest;
    }

    public void setEmailTest(String emailTest) {
        this.emailTest = emailTest;
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

    @Override
    public String toString() {
        return "Person{" + "title=" + title + ", birthYear=" + birthYear + ", name=" + name + ", email=" + email + '}';
    }
    
    
}
