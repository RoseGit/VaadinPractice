/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.routerapi;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

/**
 *
 * @author Lenovo
 */
@Route(value = "router_api_parameter")
public class RouterApiParameter extends VerticalLayout implements HasUrlParameter<String>{

    @Override
    public void setParameter(BeforeEvent event, String parameter) {
        add(new Label(String.format("Welcome %s", parameter)));
    }
}
