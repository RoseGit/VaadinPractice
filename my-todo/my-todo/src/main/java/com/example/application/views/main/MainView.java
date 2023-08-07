package com.example.application.views.main;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@Route(value = "")
public class MainView extends HorizontalLayout {

    private Button sayHello;

    public MainView() {
        
        sayHello = new Button("Introduction");
        
        sayHello.addClickListener(e -> {
            UI.getCurrent().navigate("introduction");
        });
        var layouting = new Button("Layouting");
        layouting.addClickListener(event ->{
            UI.getCurrent().navigate("layouting");
        });
        var forms_databinding = new Button("Forms and databinding");
        forms_databinding.addClickListener(event ->{
            UI.getCurrent().navigate("forms_databinding");
        });
        
        var data_list_with_grid = new Button("Data List With Grid");
        data_list_with_grid.addClickListener(event ->{
            UI.getCurrent().navigate("data_list_grid");
        });
        
        var router_api = new Button("Router API");
        router_api.addClickListener(event ->{
            UI.getCurrent().navigate("router_api");
        });
        add(router_api);
        
        var theming = new Button("Theming");
        theming.addClickListener(event ->{
            UI.getCurrent().navigate("temas");
        });
        
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, sayHello);

        add(sayHello);
        add(layouting);
        add(forms_databinding);
        add(data_list_with_grid);
        add(router_api);
        add(theming);
    }

}
