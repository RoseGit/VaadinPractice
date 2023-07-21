/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.datalistgrid;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
@Route(value = "data_list_grid")
public class DataListGridView extends VerticalLayout{
 
    
    public DataListGridView(){
        var title = new Label("Data List With Grid");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Aprenderemos a trabajar con la API DataProvider para obtener datos desde cualquier lugar Ej. REST, base de datos, etc. y como habilitar el filtrado en la interfaz de usuario.")));
        var text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//Escanea persona y agrega las columnas automaticamente\n"
                + "Grid<Person> grid = new Grid<>(Person.class);");
        add(text_area);
        
        var grid_person_1 = new Grid<Person>(Person.class);
        add(grid_person_1);
        
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("No escanea nada, se deben agregar las columnas manualmente\n"
                + "Grid<Person> grid = new Grid<>();");
        add(text_area);
        
        Grid<Person> grid_person_manual_1 = new Grid<>();
        add(grid_person_manual_1);
        
        add(new ListItem(new Label("Opciones para agregar columnas manualmente")));
        add(new ListItem(new Label("Opción 1 ")));
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("// Puedes agregar las columnas que tu quieras usando ValueProviders\n"
                + "public Column<T> addColumn(ValueProvider<T,V> valueProvider);\n"
                + "\n"
                + "//Ejemplo "
                + "grid.addColumn(Person::getName).setHeader(\"Name\");;");
        add(text_area);
        var grid_person_manual_2 = new Grid<Person>();
        grid_person_manual_2.addColumn(Person::getName).setHeader("Name");
        add(grid_person_manual_2);
        
        add(new ListItem(new Label("Opción 2 ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//Tambien se puede usar el property name\n"
                + "// parametro false indica que no lo haga automatico, solo trabaja con Beans type\n"
                + "var grid = new Grid<Person>(Person.class, false);\n"
                + "public Column<T> addColumn(String propertyBean);\n"
                + "\n"
                + "grid.addColumn(\"name\").setHeader(\"Name\");");
        add(text_area);
        
        add(new ListItem(new Label("Opción 3 ")));
        var grid_person_manual_3 = new Grid<Person>(Person.class, false);
        grid_person_manual_3.addColumn("name").setHeader("Name 2");
        add(grid_person_manual_3);
        
        add(new ListItem(new Label("Los Column Keys, son los identificadores que son usados para recuperar una columna del grid. Por ejemplo Grid::getColumnByKey()")));
        add(new ListItem(new Label("Estos Key son generados automaticamente cuando se crea el Grid ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("new Grid<Person>(Person.class);\n"
                + "grid.getColumnByKey(\"name\");");
        add(text_area);
        
        
        title = new Label("Llenar los datos a el grid");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Se usara el método grid.setItems()")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//Es una forma facil de agregar datos al grid \n"
                + "Grid<Person> grid = new Grid<>();\n"
                + "List<Person> list = getPersons();\n"
                + "grid.setItems(list);");
        add(text_area);
        
        var grid_person_4 = new Grid<Person>(Person.class);
        var list_persons = new ArrayList<Person>();
        list_persons.add(new Person("titulo 1", 2023, "Rose", "prueba@gmail.com", 38));
        list_persons.add(new Person("titulo 2", 2022, "Nohemi", "prueba2@gmail.com", 37));
        list_persons.add(new Person("titulo 3", 2023, "cdf", "prueba3@gmail.com", 34));
        list_persons.add(new Person("titulo 4", 2021, "ghi", "prueba4@gmail.com", 56));
        list_persons.add(new Person("titulo 5", 2025, "jkl", "prueba5@gmail.com", 13));
        grid_person_4.setItems(list_persons);
        add(grid_person_4);
        
        add(new ListItem(new Label("Para ordenar en base a una columna, se usa el metodo setSorteable(true) el cual ordena en base a un Comparator por default ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("Grid<Person> grid = new Grid<>();\n"
                + "grid.addColumn(Person::getAge).setSorteable(true);");
        add(text_area);
        
        var grid_person_5 = new Grid<Person>(Person.class);
        grid_person_5.setItems(list_persons);
        var list_columns = grid_person_5.getColumns();
        for(var column : list_columns){
            column.setSortable(false);
        }
        grid_person_5.getColumnByKey("age").setSortable(true);
        add(grid_person_5);
        
        add(new ListItem(new Label("Para agregar un comparador personalizado, lo podemos establecer con el metodo setComparator()")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("Grid<Person> grid = new Grid<>();\n"
                + "grid.getColumnByKey(\"name\").setComparator(Comparator.comparing(Person::getName));");
        add(text_area);
        
        add(new ListItem(new Label("Otros metodos utiles son:")));
        add(new ListItem(new Label("1. setSelectionMode")));
        add(new ListItem(new Label("2. asSingleSelect")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("var grid_person_6 = new Grid<Person>(Person.class);\n"
                + "grid_person_6.setItems(list_persons);\n"
                + "grid_person_6.setSelectionMode(Grid.SelectionMode.SINGLE);\n"
                + "grid_person_6.addSelectionListener(event -> {\n"
                + "var person_selected = grid_person_6.asSingleSelect().getValue();\n"
                + "Notification.show(\"Persona seleccionada \"+person_selected.getName());\n"
                + "});");
        add(text_area);
        
        var grid_person_6 = new Grid<Person>(Person.class);
        grid_person_6.setItems(list_persons);
        grid_person_6.setSelectionMode(Grid.SelectionMode.SINGLE);
        grid_person_6.addSelectionListener(event -> {
            var person_selected = grid_person_6.asSingleSelect().getValue();
            Notification.show("Persona seleccionada "+person_selected.getName());
        });
        add(grid_person_6);
        
        add(new ListItem(new Label("2. asMultiSelect")));
        var grid_person_7 = new Grid<Person>(Person.class);
        grid_person_7.setItems(list_persons);
        grid_person_7.setSelectionMode(Grid.SelectionMode.MULTI);
        grid_person_7.addSelectionListener(event -> {
            var selected_person =grid_person_7.getSelectedItems();
            for (var person : selected_person) {
                System.out.println("Personas seleccionadas "+person.getName());
            }
        });
        add(grid_person_7);
        
        
        
        
        add(new ListItem(new Label("")));
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("");
        add(text_area);
    }
}
