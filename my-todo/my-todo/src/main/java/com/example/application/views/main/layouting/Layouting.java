/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.layouting;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;

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
        add(boldWord, new Label("Es el espacio alrededor del borde dentro del borde del layout, se activa con el metodo setPadding y acepta valores true, false."));
        add(new HorizontalLayout(GetExampleWithPaading(), GetExampleWithOutPaading()));
        
        
        boldWord = new Label("2. Margin: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord, new Label("Es muy similar a Padding Y es el espacio alrededor fuera del borde del layout, se activa con el método setMargin y acepta valores true, false."));
        add(new HorizontalLayout(GetExampleWithMargin(), GetExampleWithOutMargin()));
        
        boldWord = new Label("3. Spacing: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord, new Label("Es el espacio entre los componentes dentro del layout. se activa con el método setSpacing y acepta valores true, false."));
        add(new HorizontalLayout(GetExampleWithSpacing(), GetExampleWithOutSpacing()));
        
        add(new ListItem(new Label("Por default, VerticalLayout tiene ambas propiedades: Padding y Spacing.")));
        add(new ListItem(new Label("Por Default, HorizontalLayout tiene la propiedad: Spacing pero No tiene Padding activada")));
        add(new ListItem(new Label("Por default, VerticalLayout y HorizontalLayout la propiedad Margin esta desactivada.")));
        
        boldWord = new Label("FlexLayout es un componente que implementa CSS Flexbox");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord);
        add(new ListItem(new Label("CSS Flexbox es una característica de maquetacion propia de CSS. y tiene dos principales conceptos Contenedores e Items.")));
        
         //Cargando una imagen de un archivo local que esta en la carpeta resources del proyecto
        var source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_1.png")
        );
        
        var image = new Image(source, "img 1");
        add(image);
        
        add(new ListItem(new Label("FlexBox contiene muchas propiedades, solo se mencionan algunas.")));
        
        boldWord = new Label("1. flex-direction: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord, new Label("Es una propiedad que indica en que sentido se agregaran los items al contenedor."));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_2.png")
        );
        
        image = new Image(source, "img 2");
        add(image);
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_3.png")
        );
        
        image = new Image(source, "img 3");
        add(image);
        
        add(new ListItem(new Label("En Vaadin 14.1 existe un Enum que establece las propiedades para flex-direction")));
        add(new Label("FlexLayout flexLayout = new FlexLayout();"));
        add(new Label("flexLayout.setFlexDirection(FlexDirection.ROW);"));
        add(new Label("flexLayout.setFlexDirection(FlexDirection.ROW_REVERSE);"));
        add(new Label("flexLayout.setFlexDirection(FlexDirection.COLUMN);"));
        add(new Label("flexLayout.setFlexDirection(FlexDirection.COLUMN_REVERSE);"));
        
        boldWord = new Label("2. justify-content: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord, new Label("Determina como los Items estarán posicionados ya sea por row o column."));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_4.png")
        );
        
        image = new Image(source, "img 4");
        add(image);
        
        add(new ListItem(new Label("En Vaadin 14.1 existe un Enum que establece las propiedades para justify-content")));
        add(new Label("flexLayout.setJustyfyContentMode(FlexComponent.JustifyContentMode.AROUND);"));
        add(new Label("flexLayout.setJustyfyContentMode(FlexComponent.JustifyContentMode.BETWEEN);"));
        add(new Label("flexLayout.setJustyfyContentMode(FlexComponent.JustifyContentMode.CENTER);"));
        add(new Label("flexLayout.setJustyfyContentMode(FlexComponent.JustifyContentMode.END);"));
        add(new Label("flexLayout.setJustyfyContentMode(FlexComponent.JustifyContentMode.EVENLY);"));
        add(new Label("flexLayout.setJustyfyContentMode(FlexComponent.JustifyContentMode.START);"));
        
        boldWord = new Label("3. align-items: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord, new Label("Determina como serán posicionados los Items con respecto al layout en el que se encuentren, es decir si tengo un layout horizontal, como los posicionarse de manera vertical Y e segundo caso es si tengo un layout vertical como los posicionare de manera horizontal horizontal."));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_5.png")
        );
        
        image = new Image(source, "img 5");
        add(image);
        
        add(new ListItem(new Label("En Vaadin 14 existe un Enum que establece las propiedades para align-items")));
        add(new Label("flexLayout.setAlignmentItems(FlexComponent.Alignment.BASELINE);"));
        add(new Label("flexLayout.setAlignmentItems(FlexComponent.Alignment.CENTER);"));
        add(new Label("flexLayout.setAlignmentItems(FlexComponent.Alignment.END);"));
        add(new Label("flexLayout.setAlignmentItems(FlexComponent.Alignment.START);"));
        add(new Label("flexLayout.setAlignmentItems(FlexComponent.Alignment.STRETCH);"));
        add(new Label(""));
        add(new Label("//Existen metodos de ayuda para alinear en base al alyout opuesto(flex-start, flex-end, flex-center)"));
        add(new Label("horizontalLayout.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.BASELINE);"));
        add(new Label("verticalLayout.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.BASELINE);"));
        add(new Label(""));
        add(new Label("/*Para hacer que todos los Items abarquen la altura maxima en un horizontalLayout o que los items abarquen el ancho maximo en un layout vertical se puede usar la siguiente linea */"));
        add(new Label("flexLayout.setAlignItem(FlexComponent.Alignment.STRETCH);"));
        add(new Label(""));
        add(new Label("/*Para centrar un componente de manera horizontal y vertical dentro de un layot*/"));
        add(new Label("flexLayout.setAlignItems(FlexComponent.Alignment.CENTER);"));
        add(new Label("flexLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);"));
        
        add(new ListItem(new Label("Para establecer el tamaño de un componente existen métodos que nos ayudan con esta tarea, el valor que acepta puede ser en pixels o en porcentaje.")));
        add(new Label("component1.setWidth(\"200px\");"));
        add(new Label("component2.setWidth(\"100%\");"));
        add(new Label("component1.setHeight(\"100px\");"));
        add(new Label("component2.setHeight(\"95%\");"));
        add(new Label(""));
        add(new Label("/*Para establecer el tamaño maximo de width y height podemos usar el metodo */"));
        add(new Label("component.setSizeFull();"));
        add(new Label("/*NOTA: Si los valores que se manejan son en porcentaje, estos actuaran en base al componente padre*/"));
        
        add(new ListItem(new Label("Existen propiedades de CSS FlexBox que nos ayudan a determinar como colocar componentes en un contenedor con respecto al tamaño.")));
        boldWord = new Label("1. flex-shrink: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord, new Label("Define como los Items deberán comportarse cuando el espacio en el contenedor tiene poco espacio.."));        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_6.png")
        );
        
        image = new Image(source, "img 6");
        add(image);
        
        boldWord = new Label("2. flex-grow: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord, new Label(", Define como distribuir el espacio libre cuando el contenedor es mas grande que el tamaño de todos los items."));        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_7.png")
        );
        
        image = new Image(source, "img 7");
        add(image);
        
        add(new ListItem(new Label("En Vaadin 14.1 existen métodos para establecer estar propiedades")));
        add(new Label("flexLayout.setFlexGrow(1, item); // = flexLayout.expand(item);"));
        add(new Label("flexLayout.setFlexShrink(0,component);"));
        
        boldWord = new Label("3. flex-wrap: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord, new Label(", Permite hacer que los Items se posicionen en una nueva linea en el contenedor si estos no caben en una sola."));        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_8.png")
        );
        
        image = new Image(source, "img 8");
        add(image);
        
        add(new Label("flexLayout.setWrapMode(FlexLayout.WrapMode.WRAP);"));

        boldWord = new Label("4. align-content: ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord, new Label(", Indica como se distribuirá el espacio entre filas de flex-wrap, el valor default es stretch"));        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_9.png")
        );
        
        image = new Image(source, "img 9-3");
        add(image);
        
        add(new ListItem(new Label("En Vaadin 14.1 tenemos el Enum correspondiente para implementar estas propiedades.")));
        add(new Label("flexBox.setAlignContent(FlexLayout.ContentAlignment.START);"));
        add(new Label("flexBox.setAlignContent(FlexLayout.ContentAlignment.END);"));
        add(new Label("flexBox.setAlignContent(FlexLayout.ContentAlignment.CENTER);"));
        add(new Label("flexBox.setAlignContent(FlexLayout.ContentAlignment.SPACE_BETWEEN);"));
        add(new Label("flexBox.setAlignContent(FlexLayout.ContentAlignment.SPACE_AROUND);"));
        add(new Label("flexBox.setAlignContent(FlexLayout.ContentAlignment.STRECTH);"));
        
        
        add(new ListItem(new Label("Existen propiedades CSS FlexBox que permiten colocar un Scroll a un contenedor, sin embargo en Vaadin 14.1 no existe implementacion Java, pero se puede realizar de manera genérica.")));
        add(new Label("//Habilita vertical scroll"));
        add(new Label("layout.getStyle().set(\"overflow-y\",\"auto\");"));
        add(new Label(""));
        add(new Label("//Habilita horizontal scroll"));
        add(new Label("layout.getStyle().set(\"overflow-x\", \"auto\");"));
        add(new Label(""));
        add(new Label("//Habilita ambos vertical y horizontal scroll"));
        add(new Label("layout.getStyle().set(\"overflow\",\"auto\");"));
        
        boldWord = new Label("FormLayout ");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord, new Label(", Es un caso especial de maquetacion, ya que tiene en mente ser un diseño responsivo."));
        add(new ListItem(new Label("El diseño responsivo significa que los componentes se ajustan al tamaño del dispositivo donde se esta visualizando automáticamente.")));
        add(new ListItem(new Label("Por default se muestran dos columnas cuando el ancho es mayor a 40em y solo una columna en cualquier otro caso.")));
        add(new ListItem(new Label("Para definir como se deben de mostrar las columnas según el tamaño del ancho se utiliza el metodo setResponsiveSteps().")));
        
        add(new Label("/*"));
        add(new Label("Muestra 2 columnas cuando el ancho es >= 50em."));
        add(new Label("Muestra 1 columna cuando el ancho esta entre 0 y 50em."));
        add(new Label("*/"));
        add(new Label(""));
        add(new Label("formLayout.setResponsiveSteps("));
        add(new Label("    new ResponsiveStep(\"0\",1),"));
        add(new Label("    new ResponsiveStep(\"50em\", 2)"));
        add(new Label(");"));
        
        add(new ListItem(new Label("Existen 2 formas de agregar componentes a un FormLayout")));
        add(new Label("1. Usando el metodo add() como cualquier tipo de layout. Con este método una etiqueta es establecida en el componente y se muestra en la parte superior del componente"));
        add(new Label("FormLayout formLayout = new FormLayout();"));
        add(new Label("TextField firstName = new TextField(\"First Name\");"));
        add(new Label("formLayout.add(firstName);"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_10.png")
        );
        
        image = new Image(source, "img 10");
        add(image);
        
        add(new Label("2. Usando el método addFormItem(), Con este método  agrega el componente en un Wrapper y la etiqueta se muestra a la izquierda del componente."));
        add(new Label("FormLayout formLayout = new FormLayout();"));
        add(new Label("TextField firstName = new TextField();"));
        add(new Label("forLayout.addFormItem(firstName, \"Firs Name\");"));
        add(new Label(""));
        add(new Label("/*Con el diseño responsivo podemos indicar que cuando se alcance un minimo de ancho del componente, podemos cambiar la posicion de la etiqueta.*/"));
        add(new Label("formLayout.setResponsiveSteps("));
        add(new Label("    new ResponsiveStep(\"0\",1,LabelPosition.TOP),"));
        add(new Label("    new ResponsiveStep(\"20em\", 1),"));
        add(new Label("    new ResponsiveStep(\"50em\", 2)"));
        add(new Label(");"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_11.png")
        );
        
        image = new Image(source, "img 11");
        add(image);
        
        add(new ListItem(new Label("Forzar una nueva fila")));
        add(new Label("PasswordField password = new PasswordField();"));
        add(new Label(""));
        add(new Label("formLayout.addFormItem(password, \"Password\");"));
        add(new Label("formLayout.getElement().appendChild(ElementFactory.createBr());"));
        add(new Label(""));
        add(new Label("PasswordField repeatPwd = new PasswordField();"));
        add(new Label("formLayout.addFormItem(repeatPwd, \"RepeatPassword\");"));
        add(new Label("El resultado es el siguiente "));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_12.png")
        );
        
        image = new Image(source, "img 12");
        add(image);
        
        boldWord = new Label("Vaadin Board");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord);
        
        add(new ListItem(new Label("Es un layout responsivo.")));
        add(new ListItem(new Label("Hace que el tema de layout sea mas sencillo.")));
        add(new ListItem(new Label("Es un componente comercial.")));
        add(new ListItem(new Label("Esta basado en filas y columnas.")));
        add(new ListItem(new Label("Tiene una limitación: En una fila se pueden agregar hasta 4 columnas, si se especifica mas de 4 Vaadin arroja una exception.")));
        
        add(new Label("Board board = new Board();"));
        add(new Label("Component a = createComponent(\"A\");"));
        add(new Label("Component b = createComponent(\"B\");"));
        add(new Label("Component c = createComponent(\"C\");"));
        add(new Label("Component d = createComponent(\"D\");"));
        add(new Label(""));
        add(new Label("Row row1 = board.addRow(a,b,c);"));
        add(new Label("row1.addRow(d);"));
        add(new Label(""));
        add(new Label("//Para indicar que un componente debe abarcar mas de una columna, se usa el metodo setComponentSpan"));
        add(new Label("// row1.setCoponentSpan(a,2);"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_13.png")
        );
        
        image = new Image(source, "img 13");
        add(image);
        
        boldWord = new Label("App Layout");
        boldWord.getStyle().set("fontWeight", "bold");
        add(boldWord);
        
        add(new ListItem(new Label("Es un nuevo componente para definir el layout de aplicaciones web de manera rápida.")));
        add(new ListItem(new Label("Contiene 3 partes: La barra de navegación, El cajón y el contenido.")));
        add(new ListItem(new Label("Es responsivo.")));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_14.png")
        );
        
        image = new Image(source, "img 14");
        add(image);
        
        add(new Label("//Agregar contenido a Navigation Bar"));
        add(new Label("AppLayout appLayout = new AppLayout();"));
        add(new Label("Image img = new Image(\"logo-url\", \"Logo\");"));
        add(new Label("appLayout.addToNavbar(img);"));
        add(new Label(""));
        add(new Label("//Agregando componentes a el cajon "));
        add(new Label("Tabs tabs = new Tabs(new Tab(\"Home\"), new Tab(\"About\"));"));
        add(new Label("tabs.setOrientation(Tabs.Orientation.VERTICAL);"));
        add(new Label("appLayout.addToDrawer(tabs);"));
        add(new Label(""));
        add(new Label("//Agregando componentes a el contenido"));
        add(new Label("Content content = new Paragraph(\"I am Content\")"));
        add(new Label("appLayout.setContent(content);"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter2/IMG_15.png")
        );
        
        image = new Image(source, "img 15");
        add(image);
        
        var layouting = new Button("Forms and databinding");
        layouting.addClickListener(event ->{
            UI.getCurrent().navigate("forms_databinding");
        });
        add(layouting);
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
