/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.routerapi;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.Route;

/**
 *
 * @author Lenovo
 */
@Route("router_api_optional")
public class RouterApiOptional extends VerticalLayout implements HasUrlParameter<String>{
    @Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
        
        if(parameter == null){
            add(new Label("Welcome anonymus"));
        }else{
            add(new Label(String.format("Welcome %s", parameter)));
        }
    }
}
