/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.databinding;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.PropertyId;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;

/**
 *
 * @author rose
 */
@Route(value = "forms_databinding")
public class FormsDatabinding extends VerticalLayout {
    
        private TextField name = new TextField();
        @PropertyId("birthYear")
        private IntegerField birthYearField3 = new IntegerField();
        
    
    public FormsDatabinding() {
        var title = new Label("Forms And Data Binding");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Contienen componentes que generalmente representan información que necesitamos capturar en una aplicación web")));
        add(new ListItem(new Label("Esto componentes por lo general tienen algún tipo de objeto de datos en la parte del backend asociados entre si y es donde se almacenaran los datos de los componentes.")));

        //Cargando una imagen de un archivo local que esta en la carpeta resources del proyecto
        var source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter3/IMG_1.png")
        );
        
        var image = new Image(source, "img 1");
        add(image);
        
        var text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("/* La clase o entidad donde almacenaremos los datos que se introduzcan en el formulario puede ser representada asi...*/ \n"
                + "public class User extends AbstractEntity{ \n"
                + "    private String email;\n"
                + "    private String firstName;\n"
                + "    private String lastName;\n"
                + "    private String passwordHash;\n"
                + "    private String role;\n"
                + "    //Properties needs getter and setter \n"
                + "}");
        add(text_area);
        
        title = new Label("Fields(Campos)");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Es un componente ")));
        add(new ListItem(new Label("Implementan una interface especial llamada HasValue")));
        add(new ListItem(new Label("HasValue Tiene dos parametros genericos HasValue<E,V> donde V es el parámetro mas importante ")));
            add(new ListItem(new Label("1. E significa que es el tipo de dato que regresara el evento para el valor V ")));
            add(new ListItem(new Label("2. V significa que tendrá el valor del tipo de dato.")));
        add(new ListItem(new Label("Esta interface contiene 3 importantes métodos que son : ")));
            add(new ListItem(new Label("1. V getValue(): regresa el valor del campo.")));
            add(new ListItem(new Label("2. void setValue(): Establece el valor del campo, según el tipo de dato especificado en la interace.")));
            add(new ListItem(new Label("3. Registration addValueChangeListener(ValueChangeListener<? super E >listener): Permite agregar un listener cada vez que el valor cambia. ")));
        
        title = new Label("ValueChangeEvent<V>");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("El valor de los campos puede cambiar en dos lugares.")));
        add(new ListItem(new Label("1. Llamando al método setValue() en el código Java")));
        add(new ListItem(new Label("2. El usuario cambia el valor en el lado del cliente, generalmente el formulario.")));
        add(new ListItem(new Label("3. Se puede validar si el evento viene del lado del cliente con el siguiente código.")));
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("TextField text = new TextField();\n"
                + "textField.addValueChangeListener(event -> {\n"
                + "    if(event.isFromClient()){\n"
                + "        //se va a hacer algo\n"
                + "    }\n"
                + "});\n");
        add(text_area);
        
        title = new Label("Databinding");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("El sistema de enlace de datos de Vaadin esta diseñado para accesar y modificar los datos de la aplicación a partir de los componentes de interface de usuario(UI).")));
        add(new ListItem(new Label("Los datos pueden agruparse en campos simples, formularios complejos y componentes de tipo  lista.")));
        add(new ListItem(new Label("En el núcleo del data binding existe una clase auxiliar llamada Binder, que se encarga de leer los valores de los objeto negocio y mostrar los componentes del campo")));
        
        title = new Label("Binder");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Enlaza los datos de negocio con los componentes gráficos ")));
        add(new ListItem(new Label("Maneja la conversión y la validación de datos ")));
        add(new ListItem(new Label("Binder siempre se escribe en el Bean backend ejemplo Person")));
        add(new ListItem(new Label("Se puede instanciar de dos formas ")));
            add(new ListItem(new Label("1. Option 1 No admite vinculación con nombres de propiedad ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("Binder <Person> binder = new Binder<>();");
        add(text_area);
            
            add(new ListItem(new Label("1. Option 2 Usa reflection para escanear las propiedades de la clase, así que se pueden enlazar por el nombre de la propiedad")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("Binder<Person> binder = new Binder<>(Person.class);");
        add(text_area);
        
        title = new Label("Creando enlaces con binder");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Un enlace describe como mover datos entre campos(Field, componente gráfico ) y datos de objetos el siguiente ejemplo muestra como crear un Binder de forma manual. ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue(" var person = new Person();\n" +
        "Binder<Person> binder = new Binder<>();\n" +
        " binder.setBean(person);\n\n" +
        "TextFiled textField1 = new TextField();\n" +
        "IntegerField birthYearField = new IntegerField();\n" +
        "\n" +
        "binder.forField(textField1).bind(Person::getTitle, Person::setTitle);\n" +
        "binder.forField(birthYearField).bind(Person::getBirthYear, Person::setBirthYear);");
        add(text_area);
        
        //Especificamos de que objeto es el binder y asignamos un objeto
        var person = new Person();
        var binder = new Binder<Person>();
        binder.setBean(person);
        
        var textField1 = new TextField();
        var birthYearField = new IntegerField();
        
        // Indicamos que propiedad le corresponde con el objeto y el componente grafico 
        binder.forField(textField1).bind(Person::getTitle, Person::setTitle);
        binder.forField(birthYearField).bind(Person::getBirthYear, Person::setBirthYear);
        var button = new Button("Show values");
        
        // Mostramos el valor del objeto y el valor del objeto que contiene el binder 
        // A su vez es un objeto de tipo Person 
         button.addClickListener(event ->{
             var person_aux = binder.getBean();
             Notification.show("Componente: "+ textField1.getValue() +" Objeto Person: "+person_aux.getTitle());
             Notification.show("Componente: "+String.valueOf(birthYearField.getValue()) + " Objeto Person: "+person_aux.getBirthYear()  );
        });
        add(textField1);
        add(birthYearField);
        add(button);
        
        title = new Label("Binder con property name");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Se puede mapear los componentes con los objetos indicando la propiedad en formato string de la siguiente forma:")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue(" var person2 = new Person();\n" +
        "var binder2 = new Binder<Person>(Person.class);\n" +
        " binder2.setBean(person2);\n\n" +
        "var textField2 = new TextField();\n" +
        "var birthYearField2 = new IntegerField();\n" +
        "\n" +
        "binder2.forField(textField2).bind(\"title\");\n" +
        "binder2.forField(birthYearField2).bind(\"birthYear\");");
        add(text_area);
        
        var person2 = new Person();
        var binder2 = new Binder<Person>(Person.class);
        binder2.setBean(person2);
        
        var textField2 = new TextField();
        var birthYearField2 = new IntegerField();
        binder2.forField(textField2).bind("title");
        binder2.forField(birthYearField2).bind("birthYear");
        
        var button2 = new Button("Show values 2");
        button2.addClickListener(event ->{
             var person_aux = binder2.getBean();
             Notification.show("Componente: "+ textField2.getValue() +" Objeto Person: "+person_aux.getTitle());
             Notification.show("Componente: "+String.valueOf(birthYearField2.getValue()) + " Objeto Person: "+person_aux.getBirthYear()  );
        });
        add(textField2);
        add(birthYearField2);
        add(button2);
        
        title = new Label("Automatic Bindings Minute");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Se puede crear un binding automatico, para eso se debe tener en cuenta que ")));
        add(new ListItem(new Label("Los componentes graficos deben ser instancias de clase.")));
        add(new ListItem(new Label("Deben de coincidir el nombre de la variable de los componentes graficos con el nombre de la propiedad del objeto ")));
        add(new ListItem(new Label("En caso de que no coincidan, se puede anotar el componente grafico con la anotación @PropertyId")));
        
        var binder3 = new Binder<Person>(Person.class);
        var person3 = new Person();
        binder3.setBean(person3);
        binder3.bindInstanceFields(this);
        
        var button3 = new Button("Show values 3");
        button3.addClickListener(event ->{
             var person_aux = binder3.getBean();
             Notification.show("Componente: "+ name.getValue() +" Objeto Person: "+person_aux.getName());
             Notification.show("Componente: "+String.valueOf(birthYearField3.getValue()) + " Objeto Person: "+person_aux.getBirthYear()  );
        });
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("private TextField name = new TextField();\n"
        + " @PropertyId(\"birthYear\")"
        + "private IntegerField birthYearField3 = new IntegerField();\n"  
        + "var binder3 = new Binder<Person>(Person.class);\n" +
        "var person3 = new Person();\n" +
        " binder3.setBean(person3)\n\n" +
        "var textField2 = new TextField();\n" +
        "var birthYearField2 = new IntegerField();\n" +
        "\n" +
        "binder3.bindInstanceFields(this);\n" );
        add(text_area);
        
        add(name);
        add(birthYearField3);
        add(button3);
        
        title = new Label("Binder para Objetos anidados ");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter3/IMG_2.png")
        );
        
        image = new Image(source, "img 2");
        add(image);
        
        title = new Label(" Reading and writing values. ");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Si se desea actualizar de forma manual los valores entre los componentes gráficos y el binder se pueden utilizar los metodos readBean y writeBean")));
        add(new ListItem(new Label("readBean permite leer los valores de la instancia persona a el binder")));
        add(new ListItem(new Label("writeBean permite escribir valores del binder a la instancia del objeto persona ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("Person person = getPerson();\n"
                + "Binder<Person> binder = new Binder<>();"
                + "\n"
                + "binder.readBean(person); //Lee valores de la instancia de persona a el binder \n"
                + "Button saveButton = new Button(\"Save\", event ->{\n"
                + "  try{\n"
                + "    binder.writeBean(person); //Escribe valores del binder al objeto Persona \n"
                + "  }catch(ValidationException ex){\n"
                + " }"
                + "});" );
        add(text_area);
        
        add(new ListItem(new Label("")));
        add(new ListItem(new Label("")));
        
    }
}
