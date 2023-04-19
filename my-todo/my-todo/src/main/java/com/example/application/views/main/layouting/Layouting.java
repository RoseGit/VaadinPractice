/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.layouting;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 *
 * @author rose
 */
@Route(value = "layouting")
public class Layouting extends VerticalLayout{
    
    public Layouting(){
        var title = new Label("Layouts");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Los Layouts es donde se agregan los componentes gráficos.")));
        add(new ListItem(new Label("Es decir lo que se vera en la interface de usuario.")));
        add(new ListItem(new Label("Existen varias implementaciones con el fin de acomodar los componentes como lo deseemos.")));
        
        title = new Label("Horizontal Layout y Vertical Layout");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        add(new ListItem(new Label("Son los Layout mas utilizados ")));
        
        add(new ListItem(new Label("HorizontalLayout")));
        add(GetExampleHorizontalLayout());
        add(new ListItem(new Label("VerticalLayout")));
        add(GetExampleVerticalLayout());
        
        
        add(new ListItem(new Label("Existen propiedades comunes para estos layouts")));
        var boldWord = new Label("1. Paading: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(new ListItem(boldWord, new Label("Es el espacio alrededor del borde dentro del borde del layout, se activa con el metodo setPadding y acepta valores true, false.")));
        add(new HorizontalLayout(GetExampleWithPaading(), GetExampleWithOutPaading()));
        
        
        boldWord = new Label("2. Margin: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(new ListItem(boldWord, new Label("Es muy similar a Padding Y es el espacio alrededor fuera del borde del layout, se activa con el método setMargin y acepta valores true, false.")));
        add(new HorizontalLayout(GetExampleWithMargin(), GetExampleWithOutMargin()));
        
        boldWord = new Label("3. Spacing: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(new ListItem(boldWord, new Label("Es el espacio entre los componentes dentro del layout. se activa con el método setSpacing y acepta valores true, false.")));
        add(new HorizontalLayout(GetExampleWithSpacing(), GetExampleWithOutSpacing()));
        
        add(new ListItem(new Label("Por default, VerticalLayout tiene ambas propiedades: Padding y Spacing.")));
        add(new ListItem(new Label("Por Default, HorizontalLayout tiene la propiedad: Spacing pero No tiene Padding activada")));
        add(new ListItem(new Label("Por default, VerticalLayout y HorizontalLayout la propiedad Margin esta desactivada.")));
        
    }
    
    private VerticalLayout GetExampleWithSpacing(){
        var date_picker = new DatePicker("Date Picker:");
        var text_field = new TextField("TextField:");
        var combo_box = new ComboBox("Combo box:");
        
        var vertical_layout = new VerticalLayout();
        vertical_layout.setSpacing(true);
        vertical_layout.add(new Label("Con Spacing"));
        
        vertical_layout.add(date_picker, text_field, combo_box);
        vertical_layout.getStyle().set("border", "1px solid black");
        return vertical_layout;
    }
    
    private VerticalLayout GetExampleWithOutSpacing(){
        var date_picker = new DatePicker("Date Picker:");
        var text_field = new TextField("TextField:");
        var combo_box = new ComboBox("Combo box:");
        
        var vertical_layout = new VerticalLayout();
        vertical_layout.setSpacing(false);
        vertical_layout.add(new Label("Sin Spacing"));
        
        vertical_layout.add(date_picker, text_field, combo_box);
        vertical_layout.getStyle().set("border", "1px solid black");
        return vertical_layout;
    }
    
    
    private VerticalLayout GetExampleWithMargin(){
        var date_picker = new DatePicker("Date Picker:");
        var text_field = new TextField("TextField:");
        var combo_box = new ComboBox("Combo box:");
        
        var vertical_layout = new VerticalLayout();
        vertical_layout.setMargin(true);
        vertical_layout.add(new Label("Con Margin"));
        
        vertical_layout.add(date_picker, text_field, combo_box);
        vertical_layout.getStyle().set("border", "1px solid black");
        return vertical_layout;
    }
    
    private VerticalLayout GetExampleWithOutMargin(){
        var date_picker = new DatePicker("Date Picker:");
        var text_field = new TextField("TextField:");
        var combo_box = new ComboBox("Combo box:");
        
        var vertical_layout = new VerticalLayout();
        vertical_layout.setMargin(false);
        vertical_layout.add(new Label("Sin Margin"));
        
        vertical_layout.add(date_picker, text_field, combo_box);
        vertical_layout.getStyle().set("border", "1px solid black");
        return vertical_layout;
    }
    
    private VerticalLayout GetExampleWithPaading(){
        var date_picker = new DatePicker("Date Picker:");
        var text_field = new TextField("TextField:");
        var combo_box = new ComboBox("Combo box:");
        
        var vertical_layout = new VerticalLayout();
        vertical_layout.setPadding(true);
        vertical_layout.add(new Label("Con padding"));
        
        vertical_layout.add(date_picker, text_field, combo_box);
        vertical_layout.getStyle().set("border", "1px solid black");
        return vertical_layout;
    }
    
    private VerticalLayout GetExampleWithOutPaading(){
        var date_picker = new DatePicker("Date Picker:");
        var text_field = new TextField("TextField:");
        var combo_box = new ComboBox("Combo box:");
        
        var vertical_layout = new VerticalLayout();
        vertical_layout.setPadding(false);
        vertical_layout.add(new Label("Sin padding"));
        vertical_layout.add(date_picker, text_field, combo_box);
        vertical_layout.getStyle().set("border", "1px solid black");
        return vertical_layout;
    }
    
    private HorizontalLayout GetExampleHorizontalLayout(){
        var date_picker = new DatePicker("Date Picker:");
        var text_field = new TextField("TextField:");
        var combo_box = new ComboBox("Combo box:");
        
        var horizontal_layout = new HorizontalLayout();
        horizontal_layout.add(date_picker, text_field, combo_box);
        horizontal_layout.getStyle().set("border", "1px solid black");
        return horizontal_layout;
    }
    
    private VerticalLayout GetExampleVerticalLayout(){
        var date_picker = new DatePicker("Date Picker:");
        var text_field = new TextField("TextField:");
        var combo_box = new ComboBox("Combo box:");
        
        var vertical_layout = new VerticalLayout();
        
        vertical_layout.add(date_picker, text_field, combo_box);
        vertical_layout.getStyle().set("border", "1px solid black");
        return vertical_layout;
    }
}
