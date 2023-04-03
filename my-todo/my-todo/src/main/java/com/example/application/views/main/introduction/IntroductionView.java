/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.introduction;


import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.stefan.table.Table;



/**
 *
 * @author rose
 */
@PageTitle("Main")
@Route(value = "introduction")
public class IntroductionView extends VerticalLayout{
    
    public IntroductionView() {
        
        var title = new Label("Que es Vaadin ?  ");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        add(new ListItem(new Label("1.- Es un framework para Java. Viene con una suite de componentes y herramientas para construir Progressive Web Apps.")));
        add(new ListItem(new Label("2.- Vaadin es de codigo abierto y con soporte de proveedor.")));
        
        
        title = new Label("Java ");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        add(new ListItem(new Label("Se debe tener instalado como pre-requisito Java JDK 8 o superior.")));
        add(new ListItem(new Label("Se debe tener instalado como pre-requisito Node.js 10.")));
        add(new ListItem(new Label("Para empezar un proyecto con vaadin debemos ir a la liga https://vaadin.com/start y descargar proyecto con SpringBoot o la mejor opción que deseemos.<, esto nos descargara un proyecto Maven con el cual podremos trabajar con el IDE que deseemos.")));
        add(new ListItem(new Label("Contiene el goal de maven jetty:run para ejecutar la aplicación: http://localhost:8080 y cargar la pagina inicial.")));
        
        title = new Label("Components");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        add(new ListItem(new Label("Contiene varios componentes que se pueden crear en una pagina Web como si fueran simples objetos en Java, existen listas, botones, enlaces, tablas, datagrid, etc.")));
        add(new ListItem(new Label("Por default Vaadin integra el tema de Lumo para sus componentes")));
        add(new ListItem(new Label("Existen también componentes comerciales que integran funciones especificas como Grid Pro")));
        add(new ListItem(new Label("Vision general de componentes")));
        
        //External component html-table
        var table = new Table();
        var headerRow = table.addRow();
        headerRow.addHeaderCell().setText("Concepto"); 
        headerRow.addHeaderCell().setText("Componentes relacionados");
        
        var detailsRow = table.addRow();
        var cell = detailsRow.addDataCell();
        cell.getStyle().set("background-color", "#ddf");
        cell.setText("Form Inputs");
        detailsRow.addDataCell().setText("CheckBox, Combo Box, Custom Field, Date Picker,Email Field, List Box, Number Field, Password Field,Radio Button, Select , TextField, Time Picker, Upload File");
        
        detailsRow = table.addRow();
        cell = detailsRow.addDataCell();
        cell.getStyle().set("background-color", "#ddf");
        cell.setText("Visualizacion e Interaccion");
        detailsRow.addDataCell().setText("Accordion, Button, Context Menu, Details, Dialog Grid, Icons, Item, Notification, Progress Bar, Tabs, TreeGrid.");
        
        detailsRow = table.addRow();
        cell = detailsRow.addDataCell();
        cell.getStyle().set("background-color", "#ddf");
        cell.setText("Layouts (Componentes de disposición)");
        detailsRow.addDataCell().setText("Horizontal Layout, Vertical layout, Ordered layout, Form layout, Split layout, App layout, Login.");
        
        detailsRow = table.addRow();
        cell = detailsRow.addDataCell();
        cell.getStyle().set("background-color", "#ddf");
        cell.setText("Componentes comerciales");
        detailsRow.addDataCell().setText("Board, CRUD, Charts, Confirm Dialog, Cookie Consent, Grid Pro, Rich Text Editor, Spreadsheet");
        
        detailsRow = table.addRow();
        cell = detailsRow.addDataCell();
        cell.getStyle().set("background-color", "#ddf");
        cell.setText("Componentes HTML");
        detailsRow.addDataCell().setText("Anchor, Article, Aside, Description, List, Div, Emphasis, H1, H2, H3, H4, H5, H6, Hr, Header, Footer, IFrame, Input, Label, ListItem, Main, Native Button, Nav, OrderedList, Paragraph, Section, Span, UnorderedList.");
        
        table.getCaption().setText("Caracteristicas de componentes Vaadin");
        add(table);
        
        add(new ListItem(new Label("Arquitectura Vaadin: Lado Cliente/Web Components(Browser, HTML, JavaScript, CSS) -> Lado servidor(Java) -> Comunicación(Flow, componentes Java)")));        
        add(new ListItem(new Label("Los componentes Web son implementaciones del lado del cliente y se basan en estandares web. Estos componentes son una manera de crear nuevas etiquetas HTML(Generan la vista del cliente).")));
        add(new ListItem(new Label("Los componentes web son reutilizables ya que las propiedades se basan en estandares y son compatbles con todos los frameworks web y no solo con uno.")));
 
        
        title = new Label("Uso de componentes externos con NPM");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Es muy facil usar componentes web externos con las aplicaciones Vaadin.")));
        add(new ListItem(new Label("Primero se debe instalar el componente en el directorio raiz del proyecto.")));
        add(new ListItem(new Label("Se incorpora el nuevo componente en una clase Java para poder utilizarlo y crearlo como objeto.")));
        
        title = new Label("Tools (Herramientas que se obtienen con la plataforma Vaadin)");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        var boldWord = new Label("TestBeanch");
        boldWord.getStyle().set("fontWeight", "bold");
        
        
        var itemCompuesto = new ListItem(boldWord, new Label(" Es una herramienta que sirve para crear y ejecutar pruebas de integracion, basadas en navegador para tu aplicacion Vaadin.") );
        add(itemCompuesto );
        add(new ListItem(new Label("Para iniciarlo debemos ejecutar el goal de maven 'mvn verify' esto hace que se abran varias ventanas del navegador y realiza pruebas con la interface de usuario.")));
        add(new ListItem(new Label("TestBeanch esta basado en Selenium.")));
        
        var orderedList = new OrderedList();
        orderedList.add(new ListItem(new Label("TestBeanch Ofrece un API para los componentes Vaadin.")));
        orderedList.add(new ListItem(new Label("TestBeanch espera a que el servidor este listo y no lo hace manual como en Selenium.")));
        orderedList.add(new ListItem(new Label("TestBeanch soporta Shadow DOM en automatico")));
        orderedList.add(new ListItem(new Label("TestBeanch contiene comparacion de pantallas, asi como capturas de pantalla cuando el Test falla.")));
        orderedList.add(new ListItem(new Label("TestBeanch funciona simulando a un usuario dentro de la aplicación. y realiza tareas de verificación de código Java.")));
        add(orderedList);
        
        boldWord = new Label("Designer");
        boldWord.getStyle().set("fontWeight", "bold");
        itemCompuesto = new ListItem(boldWord, new Label(" (Es un Plugin para los IDE eclipse e Intellij IDEA)") );
        add(itemCompuesto );
        
        
        add(new ListItem(new Label("Es una herramienta visual para crear aplicaciones Vaadin. Cuenta con soporte Drag and Drop.")));
        add(new ListItem(new Label("Contiene varios patrones útiles incorporados.")));
        orderedList = new OrderedList();
        orderedList.add(new ListItem(new Label("Ej. El patrón de cuadricula con datos REST.")));
        orderedList.add(new ListItem(new Label("Ej. El patrón CRUD con columnas personalizadas.")));
        add(orderedList);
        
        
        add(new ListItem(new Label("Para iniciarlo debemos ejecutar el goal de maven 'mvn verify' esto hace que se abran varias ventanas del navegador y realiza pruebas con la interface de usuario.")));
        
        boldWord = new Label("Vaadin Multiplatform Runtime ");
        boldWord.getStyle().set("fontWeight", "bold");
        itemCompuesto = new ListItem(boldWord, new Label(" ( Es una plataforma para ejecutar aplicaciones Vaadin 7 o Vaadin 8 dentro de Vaadin 14)") );
        add(itemCompuesto );
        add(new ListItem(new Label("No se pueden heredar componentes de Vaadin 8 o Vaadin 7 directamente, para eso necesitamos utilizar una clase de envoltorio heredado.")));
 
        title = new Label("Tools (Herramientas que se obtienen con la plataforma Vaadin)");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Es una característica que hace que las aplicaciones web, parezcan aplicaciones nativas por ejemplo en un smartphone.")));
        add(new ListItem(new Label("Contiene varias caracteristicas a implementar")));
        orderedList = new OrderedList();
        orderedList.add(new ListItem(new Label("Web App Manifest")));
        orderedList.add(new ListItem(new Label("Service Worker")));
        orderedList.add(new ListItem(new Label("Icons")));
        orderedList.add(new ListItem(new Label("Offline support ")));
        orderedList.add(new ListItem(new Label("Header Information")));
        orderedList.add(new ListItem(new Label("Installation prompt")));
        add(orderedList);       
        
        add(new ListItem(new Label("Para crear una aplicacion web Progresiva con Vaadin, todo lo que se tiene que hacer es anotar la clase de la vista con @PWA")));
        
    }
}