/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.theming;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;

/**
 *
 * @author Lenovo
 */
@Route("temas")
public class ThemingView extends VerticalLayout{
    
    public ThemingView(){
        var title = new Label("Theming");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Para agregar un tema a el layout principal debemos usar la anotacion @Theme")));
        add(new ListItem(new Label("Existen dos temas predefinidos en Vaadin: ")));
        add(new ListItem(new Label("1. Lumo ")));
        add(new ListItem(new Label("Lumo es el tema default si no se especifica nada ")));
        var source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_1.png")
        );
        add(new Image(source, "img 1"));
        
        add(new ListItem(new Label("2. Material")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_2.png")
        );
        add(new Image(source, "img 2"));
        
        add(new ListItem(new Label("Cada tema puede tener variantes de Light y Dark ")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_3.png")
        );
        add(new Image(source, "img 3"));
        
        add(new ListItem(new Label("Algunos componentes tienen definidos variantes que permiten cambiar la apariencia del componente rápidamente.")));
        var text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);");
        add(text_area);
        
        var button1 = new Button("Boton normal ");
        add(button1);
        
        var button2 = new Button("Boton cambiado  ");
        button2.addThemeVariants(ButtonVariant.LUMO_ERROR);
        add(button2);
        
        
        
        add(new ListItem(new Label("La mayoría de los componentes implementan la interface HasStyle que te permite: ")));
        add(new ListItem(new Label("1. Definir el estilo en linea por ejemplo: component.getStyle().set(\"background-color\",\"gray\");")));
        add(new ListItem(new Label("2. Agregar nombre de clases CSS por ejemplo addClassName(\"class_name\");")));
        add(new ListItem(new Label("3. Remover un nombre de clase por ejemplo removeClassName(\"class_name\");")));
        add(new ListItem(new Label("")));
        add(new ListItem(new Label("Para componentes que no implementan la interface HasStyle se puede usar el elemento Element del API")));
        add(new ListItem(new Label("1. Definir el estilo en linea por ejemplo: component.getElement.getStyle.setName(\"name\", \"value\");")));
        add(new ListItem(new Label("2. Agregar un nombre de la clase component.getElement().getClassList().add(\"class_name\");")));
        add(new ListItem(new Label("3. Remover un nombre de clase por ejemplo component.getElement().getClassList().remove(\"class_name\");")));
        
        title = new Label("Theming con CSS");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        
        add(new ListItem(new Label("Usar CSS directamente en vez de codigo Java es mejor pero aplicaciones que son mas exigentes.")));
        add(new ListItem(new Label("Tenemos dos tipos de realizar theming con CSS ")));
        add(new ListItem(new Label("1. Estilos globales : Usualmente usados para estilos de toda la aplicacion")));
        add(new ListItem(new Label("2. Estilos locales: usualmente para estilos de componentes")));
        add(new ListItem(new Label("Para importar estilos utilizaremos la anotacion @CssImport el cual debe estar en el layout padre ")));
        add(new ListItem(new Label("El archivo deberia ser localizado bajo el folder frontend por ejemplo frontend/styles/shared-styles.css")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_4.png")
        );
        add(new Image(source, "img 4"));
        add(new ListItem(new Label("sabiendo esto nosotros tambien podemos definir variables para ajustar los estilos por ejemplo modificamos la variable --lumo-border.radius")));
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("/*Esta es una variable interna de lumo la cual podemos modificar*/\n" +
            "html{\n" +
            "    /*Todos los componentes tendran 2px de border radius*/\n" +
            "    --lumo-border-radius:2px;\n" +
            "}");
        add(text_area);
        
        add(new ListItem(new Label("Esta pantalla se ve asi, sin ningun cambio de estilo de Lumo ")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_5.png")
        );
        add(new Image(source, "img 5"));
        
        add(new ListItem(new Label("Ya con algunos cambios podemos verlo asi ")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_6.png")
        );
        add(new Image(source, "img 6"));
        add(new ListItem(new Label("Para explorar todas las variables de lumo podemos visitar vaadin.com/themes/lumo")));
        
        title = new Label("Recursos estaticos");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        
        add(new ListItem(new Label("Frecuentemente se necesita poner una imagen de fondo o modificar algunas fuentes. modificar color, etc")));
        add(new ListItem(new Label("Para proyectos de tipo war los recursos deben de estar bajo el directorio src/man/webapp ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("/*Ejemplo si tenemos una imagen en \n" +
            "src/main/webapp/img/logo.jpg*/\n" +
            "\n" +
            "//Java\n" +
            "new Image(\"img/logo.jpg\")\n" +
            "\n" +
            "//Css\n" +
            "div{\n" +
            "    background-image: url(img/logo.jpg)\n" +
            "}");
        add(text_area);
        
        add(new ListItem(new Label("Para proyectos de tipo jar los recursos deberian de estar en el directorio src/main/resources/META-INF/resources")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("/*Ejemplo si tenemos una imagen en\n" +
            "src/main/resources/META-INF/resourcesimg/logo.jpg*/\n" +
            "\n" +
            "//Java\n" +
            "new Image(\"img/logo.jpg\")\n" +
            "\n" +
            "//Css\n" +
            "div{\n" +
            "    background-image: url(img/logo.jpg)\n" +
            "}");
        add(text_area);
        
        title = new Label("La anotacion @StyleSheet");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        
        add(new ListItem(new Label("Tambien es usada para importar estilos, es muy similar  a @CssImport")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("@StyleSheet(\"./styles/my-style.css\")\n" +
        "public class MainLayout");
        add(text_area);
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_7.png")
        );
        add(new Image(source, "img 7"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_8.png")
        );
        add(new Image(source, "img 8"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_9.png")
        );
        add(new Image(source, "img 9"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_10.png")
        );
        add(new Image(source, "img 10"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_11.png")
        );
        add(new Image(source, "img 11"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_12.png")
        );
        add(new Image(source, "img 12"));
        
        
        
        add(new ListItem(new Label("Normalmente deberiamos usar @CSSImport")));
        add(new ListItem(new Label("Deberiamos usar @StyleSheet cuando: ")));
        add(new ListItem(new Label("1. Necesitamos cargar estilos de URL externas ")));
        add(new ListItem(new Label("2. No necesitas el soporte para IE 11 ")));
        
        title = new Label("Customizar una fuente");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Las fuentes son recursos estaticos asi que el proceso o referencia de las fuentes es muy similar al de las imagenes.")));
        add(new ListItem(new Label("Por ejemplo supongamos que tenemos las fuentes listas, ya sea .ttf o oft")));
        add(new ListItem(new Label("Debemos pasarlas a archivos .zip que contienen los css")));
        add(new ListItem(new Label("ponemos estas fuentes en el lugar correcto igual que en las imagenes.")));
        add(new ListItem(new Label("usamos @StyleSheet ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("@StyleSheet(\"context://fonts/Chilanka/stylessheet.css\")\n" +
"public class MainLayout{\n" +
"}");
        add(text_area);
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_13.png")
        );
        add(new Image(source, "img 13"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_14.png")
        );
        add(new Image(source, "img 14"));
        
        
        title = new Label("Shadow DOM Styling");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        
        
        add(new ListItem(new Label("Supongamos que queremos cambiar el estilo de una caja de texto mediante su Id ")));
        add(new ListItem(new Label("El caso incorreecto es: ")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_15.png")
        );
        add(new Image(source, "img 15"));
        
        add(new ListItem(new Label("El caso correcto seria de la forma:")));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_16.png")
        );
        add(new Image(source, "img 16"));
        
        
        add(new ListItem(new Label("El atributo ThemeFor generara un <dom-module> que permite estilar componentes internos dejandolo de esta forma ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("<dom-module id=\"flow_css_mod_x\" theme-for=\"vaadin-text-field\">\n" +
            "    <template>\n" +
            "        <style>\n" +
            "            #vaadin-text-field-input-0{\n" +
            "                background-color: yellow;\n" +
            "            }\n" +
            "        </style>\n" +
            "    </template>    \n" +
            "</dom-module>");
        add(text_area);
        
        add(new ListItem(new Label("Cada  modulo de estilos deberia de estar un archivo css diferente.")));
        add(new ListItem(new Label("Recuerda que el archivo shared-styles.css es usado comunmente para estilos globales, para nuestro ejemplo seria conveniente tener el archivo yellow.bg--text-field.css")));
        add(new ListItem(new Label("Tambien podemos definir variables a nunestros estilos de la siguiente manera")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_17.png")
        );
        add(new Image(source, "img 17"));
        
        
        
        
        add(new ListItem(new Label("Podemos tambien incorporar el uso de temas de estilos por ejemplo ")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_18.png")
        );
        add(new Image(source, "img 18"));
        
        title = new Label("Grid dinamic Styling ");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Para estilar filas enteras llamaremos al metodo setClassNameGenerator sobre el componente Grid, el cual aplicara a todas las columnas del grid  de esa fila.")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//Ejemplo \n" +
            "grid.setClassNameGenerator(this::getClassName);\n" +
            "\n" +
            "private String getClassName(MonthlyExpense expense){\n" +
            "    \n" +
            "    if(expense.getSpending() > LIMIT){\n" +
            "        return \"warn\"\n" +
            "    }else{\n" +
            "        return null;\n" +
            "    }\n" +
            "}");
        add(text_area);
        
        
        add(new ListItem(new Label("Si solo queremos estilar alguna columna en particular debemos hacer los siguiente:")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("grid.getColumnByKey(\"myColumn\").setClassNameGenerator(this::getClassName);\n" +
            "\n" +
            "private String getClassName(MonthlyExpense expense){    \n" +
            "    if(expense.getSpending() > LIMIT){\n" +
            "        return \"warn\"\n" +
            "    }else{\n" +
            "        return null;\n" +
            "    }\n" +
            "}");
        add(text_area);
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter5/IMG_19.png")
        );
        add(new Image(source, "img 19"));        
        
    }
}
