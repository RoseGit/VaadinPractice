/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.datalistgrid;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.data.renderer.ComponentRenderer;
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
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("var grid_person_7 = new Grid<Person>(Person.class);\n"
                + "grid_person_7.setItems(list_persons);\n"
                + "grid_person_7.setSelectionMode(Grid.SelectionMode.MULTI);\n"
                + "grid_person_7.addSelectionListener(event -> {\n"
                + "var selected_person =grid_person_7.getSelectedItems();\n"
                + "for (var person : selected_person) {\n"
                + "System.out.println(\"Personas seleccionadas \"+person.getName());\n"
                + "}\n"
                + "});\n");
        add(text_area);
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
        
        title = new Label("Mostrar mas detalle en la fila del grid ");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Podemos introducir mas detalle en las filas de uin grid de la siguiente forma:")));
        add(new ListItem(new Label("Al seleccionar una fila, se abrira una nueva con el valor de la descripcion")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//con ComponentRenderer  se puede construir  cualquier componente Vaadin para renderizar detalles"
                + "var grid_person_8 = new Grid<Person>(Person.class);"
                + "grid_person_8.setItems(list_persons);"
                + "grid_person_8.setItemDetailsRenderer("
                + "new ComponentRenderer<>(person -> {"
                + "return new Label(person.getDescripcion());"
                + "}));"
                + "\n"
                + "//Si queremos deshabilitar los detalles de algun componente podemos hacerlo de la siguiente forma \n" +
                "grid.setDetailsVisibleOnClick(false);\n"
                + "\n"
                + "//si queremos que el Grid no permita seleccionar las filas, solo mostrar informacion por ejemplo \n" +
                "grid.setSelectionMode(SelectionMode.NONE)");
        add(text_area);
        
        //con ComponentRenderer  se puede construir  cualquier componente Vaadin para renderizar detalles
        var grid_person_8 = new Grid<Person>(Person.class);
        grid_person_8.setItems(list_persons);
        grid_person_8.setItemDetailsRenderer(
                new ComponentRenderer<>(person -> {
                    return new Label(person.getDescripcion());
                })
            );
        grid_person_8.setSelectionMode(Grid.SelectionMode.NONE);
        add(grid_person_8);
        
        
        title = new Label("ComboBox");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Es un componente de seleccion de informacion")));
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("ComboBox<Person> combo = new ComboBox<>();\n"
                + "\n"
                + "//Tiene metodos que guardan la informacion en memoria \n"
                + "combo.setItems();\n"
                + "\n"
                + "//Por default las etiquetas de los combobox usan el metodo toString para representar un Item\n"
                + "//Sin embargo nosotros podemos cambiar este comportamiento \n"
                + "combo.setItemLabelGenerator(\n"
                + "    person -> person.getFullName()+\"(\"+person.getEmail+\")\"\n"
                + ");");
        add(text_area);
        
        var combo = new ComboBox<Person>();
        combo.setItems(list_persons);
        combo.setItemLabelGenerator(person -> person.getName());
        add(combo);
        
        
        title = new Label("RadioButton otro componente de seleccion");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue(""
                + "var options = new RadioButtonGroup<Person>();\n"
                + "options.setItems(list_persons);\n"
                + "options.setItemLabelGenerator(person -> person.getName());\n"
                + "options.addValueChangeListener(e ->{\n"
                + "Person selectionOption = e.getValue();\n"
                + "Notification.show(\"Seleccionaste: \"+selectionOption.getName());\n"
                + "});");
        add(text_area);
        
        var options = new RadioButtonGroup<Person>();
        options.setItems(list_persons);
        options.setItemLabelGenerator(person -> person.getName());
        options.addValueChangeListener(e ->{
            Person selectionOption = e.getValue();
            Notification.show("Seleccionaste: "+selectionOption.getName());
        });
        add(options);
        
        
        title = new Label("Data Binding and Data providers");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Cuando utilizamos el metodo grid.setItems() realmente estamos utilizando ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("grid.setDataProvider(DataProvider.ofCollection(items));");
        add(text_area);
        
        
        add(new ListItem(new Label("La interface DataProvider unifica el API para buscar y para escuchar a los componentes ")));
        add(new ListItem(new Label("Otorga los metodos de items, getting, size, etc.")));
        add(new ListItem(new Label("Existen dos formas de cargas los datos ")));
        add(new ListItem(new Label("1. In Memory")));
        add(new ListItem(new Label("2. Lazy Load")));
        add(new ListItem(new Label("In Memory data providers son convenientes para pequeños conjuntos de datos(cientos de datos ) ordenar y filtrar es mucho mas facil ")));
        add(new ListItem(new Label("ListDataProvider es la interface por default para todos los items cuando se llama al metodo setItems()")));
        add(new ListItem(new Label("soporta ordenamiento y filtrado ")));
        add(new ListItem(new Label("Basado en JavaBeans y Collections")));
        add(new ListItem(new Label("Si quisieramos agregar un comparador para ordenar items podriamos hacer lo siguiente ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//Ejemplo 1\n"
                + "dataProvider.setSortComparator(Comparator.comparing(Consultant::getTaxtBracket)::compare);\n"
                + "\n"
                + "//Ejemplo 2 \n"
                + "dataProvider.setSortOrder(Consultant::getProirity, SortDirection.DESCENDING);\n");
        add(text_area);
 
        
        
        add(new ListItem(new Label("Para el tema de filtrado existen dos opciones.")));
        add(new ListItem(new Label("1. Directamente ")));
        add(new ListItem(new Label("2 Por query muy parecido a lazy load ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//Ejemplo para filtrar personas que no tengan email \n"
                + "dataProvider.setFilter(person -> person.getEmail() != null);\n"
                + "//Ejemplo 2 \n"
                + "dataProvider.setFilter(Person::getSalary, salary -> salary >= 50000);\n"
                + "//Ejemplo 3 Filtrando directamente por un valor \n"
                + "dataProvider.setFilterByValue(Person::getBirthDate, null);\n");
        add(text_area);
        
        add(new ListItem(new Label("Lazy load data es recomendable para miles de datos y que no se quieran cargar todos esos datos en memoria.")));
        add(new ListItem(new Label("1. Salvan la memoria pero el costo es la velocidad al mostrar los datos. Estos datos solo se muestran pocos al usuario, cuando el usuario quiere ver mas por ejemplo con el scroll, este manda una peticion al backend para cargar mas datos.")));
        add(new ListItem(new Label("2. Trabaja dinamicamente el query con dos datos principalmente offset que indica desde que datos quiero cargar y limit es cuantos registros quiero cargar.")));
        add(new ListItem(new Label("Si se modifica o agrega cualquier dato del provider, el provider NO sabra de ese cambio a menos que se utilize una de estas dos formas:")));
        add(new ListItem(new Label("1. usar el metodo dataProvider.refreshAll();")));
        add(new ListItem(new Label("2. usar el metodo dataProvider.refreshItem(personWithNewData);")));
        add(new ListItem(new Label("//Revisa el tema de Lazy load parece que no quedo muy claro")));
        
        var router_api = new Button("Router API");
        router_api.addClickListener(event ->{
            UI.getCurrent().navigate("router_api");
        });
        add(router_api);
    }
}
