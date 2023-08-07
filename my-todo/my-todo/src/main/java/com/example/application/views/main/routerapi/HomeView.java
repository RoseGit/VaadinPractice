package com.example.application.views.main.routerapi;


import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
@PageTitle("Rose Home")
@Route("HomeView")
public class HomeView extends VerticalLayout{
    
    public HomeView(){
        add(new Label("Home View"));
    }
}
