/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.databinding;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 *
 * @author rose
 */
@Route(value = "forms_databinding")
public class FormsDatabinding extends VerticalLayout {
    
    public FormsDatabinding() {
        add(new Label("Hello"));
    }
}
