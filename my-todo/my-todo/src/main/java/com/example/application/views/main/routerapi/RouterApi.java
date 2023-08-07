/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application.views.main.routerapi;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.HasDynamicTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.StreamResource;

/**
 *
 * @author Lenovo
 */
@Route(value = "router_api")
@RouteAlias("router_api_rose")
public class RouterApi extends VerticalLayout implements HasDynamicTitle{

    // Se recomienda mejor usar @PageTitle("Rose Home")
    private String title="Titulo de la ventana";
    @Override
    public String getPageTitle() {
                return title;
    }
    
    public RouterApi(){
        var title = new Label("Habilitando rutas(routing)");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Router habilita las rutas para tu sitio web o aplicacion web.")));
        add(new ListItem(new Label("Por ejempo tenemos esta pagina Storefront y cuando el usuario da click en DashBoard se cambia la pantalla del usuario cambiando la URL tambien.")));
        var source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter4/IMG_1.png")
        );
        
        add(new Image(source, "img 1"));
        
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter4/IMG_2.png")
        );
        
        add(new Image(source, "img 2"));
        
        title = new Label("Como habilitamos el Routing ?");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("El Routing puede ser habilitado agregando la anotacion @Route a cualquier componente ")));
        add(new ListItem(new Label("@Route puede tomar paths como parametros  por ejemplo ")));
        
        var text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//Ejemplo 1\n" +
                            "@Route(\"home\") \n" +
                            "\n" +
                            "//Ejemplo 2 \n" +
                            "@Route(\"some/path\")\n" +
                            "\n" +
                            "//El valor por default de Route es \n" +
                            "@Route(\"\")");
        add(text_area);
        
        add(new ListItem(new Label("Se pueden tener multiples PATHS para la misma vista ? La respuesta es Si con ayuda de los alias")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter4/IMG_3.png")
        );
        add(new Image(source, "img 3"));
        
        
        var link = new Anchor("http://localhost:8080/router_api_rose", "Es la misma pagina con diferente alias en la URL");
        add(link);
        
        title = new Label("Navegar a URL y pasar  parametros");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Se implementan con la interface HasUrlParameters para que un componente pueda enviar a la URL parametros")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//Supongamos que al navegar a yourdomain.com/greet/vaadin se imprime el texto \"Welcome Vaadin\" donde \n" +
        "///greet: Es el path que se le da a la vista \n" +
        "//vaadin: Es el parametro que se le manda en la URL \n" +
        "@Route(value=\"greet\")\n" +
        "public class GrettingComponent extends Div implements HasUrlParameter<String>{\n" +
        "\n" +
        "    @Override\n" +
        "    public void setParameter(BeforeNavigationEvent event, String parameter){\n" +
        "        setText(String.format(\"Welcome %s!\", parameter));\n" +
        "    }\n" +
        "}");
        add(text_area);
        
        link = new Anchor("http://localhost:8080/router_api_parameter/Rose", "Pagina con envio de un solo parametro");
        add(link);
        
        add(new ListItem(new Label("Para poder enviar parametros opcionales en una path se usa la anotacion @OptionalParameter")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("@Route(value==\"greet\")\n" +
        "public class OptionalComponent extends Div implements HasUrlParameter<String>{\n" +
        "    \n" +
        "    @Override\n" +
        "    public void setParameter(BeforeNavigationEvent event, @OptionalParameter String parameter){\n" +
        "    \n" +
        "        if(parameter == null){\n" +
        "            setText(\"Welcome anonymous\");\n" +
        "        }else{\n" +
        "            setText(String.format(\"Welcome %s!\", parameter));\n" +
        "        }\n" +
        "    }\n" +
        "}");
        add(text_area);
        link = new Anchor("http://localhost:8080/router_api_optional", "Pagina con parametros opcionales - no se envia parametro ");
        add(link);
        link = new Anchor("http://localhost:8080/router_api_optional/rose", "Pagina con parametros opcionales - Se envia parametro rose ");
        add(link);
        
        add(new ListItem(new Label("En caso de querer enviar mas parametros por ejemplo greet/one/two/three se usa la anotacion @WildcardParameter")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("@Route(value =\"greet\")\n" +
        "public class WildCardComponent extends Div implements HasUrlParameter<String>{\n" +
        "    @Override\n" +
        "    public void setParameter(BeforeNavigationevent event ,@WildcardParameter String parameter){\n" +
        "        if(parameter.isEmpty()){\n" +
        "            setText(\"Hola Anonymous\");\n" +
        "                }else{\n" +
        "                      setText(String.format(\"Handling parameters %s!\", parameter));                }\n" +
        "    }\n" +
        "}");
        add(text_area);
        
        link = new Anchor("http://localhost:8080/router_api_multi/rose/diego/rosi", "Pagina con varios parametros - Se envia parametro rose diego rosi");
        add(link);
        
        title = new Label("Que pasa si algo sale mal ? ");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        
        add(new ListItem(new Label("Los errores de navegacion pueden ser definidos implementando HasErrorParameter<T extends Exception>")));
        add(new ListItem(new Label("Trabajan de la misma manera que una navegacion normal excepto que usualmente no tienen una @Route especifica")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("@Tag(\"div\")\n" +
        "public class RouteNotFoundError extends Component implements HasErrorParameter<NotFoundException>{\n" +
        "    \n" +
        "    @Override\n" +
        "    public int setErrorParameter(BeforeNavigationEvent event, ErrorParameter<NotFoundException> parameter){\n" +
        "        getElement().setText(\"Could not navigate to : '\"+event.getLocation().getPath()+\"'\");\n" +
        "        return 404;\n" +
        "    }\n" +
        "}");
        add(text_area);
        
        link = new Anchor("http://localhost:8080/router_not_exist/", "Pagina que no existe y re-dirige a una con error ");
        add(link);
        
        title = new Label(" Navigation");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("La manera mas facil para activar una navegacion dentro de la pagina Web es usar RouterLink.")));
        add(new ListItem(new Label("RouterLink solo trabaja dentro del sitio web o aplicacion web.")));
        add(new ListItem(new Label("Supongamos que tenemos un menu, el cual al dar click sobre el item Home, nos cargara la vista HomeView ")));
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("Div menu = new Div();"
                + "menu.add(new RouterLink(\"Home\", HomeView.class));"
                + "add(menu);");
        add(text_area);
        
        Div menu = new Div();
        menu.add(new RouterLink("Home", HomeView.class));
        add(menu);
        
        add(new ListItem(new Label("Para usar una navegacion externa de algun sitio, se puede utilizar Anchor.")));
        add(new ListItem(new Label("por ejemplo si queremos navegar hacia otro sitio Web, tendriamos que hacer lo siguiente.")));
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("new Anchor(\"https://vaadin.com/\",\"Vaadin\");");
        add(text_area);
        
        add(new Anchor("https://vaadin.com/","Vaadin"));
        
        add(new ListItem(new Label("La navegacion de la aplicacion Web puede ser activada mediente UI.navigate() el cual acepta un parametro String o una clase para definir la navegacion.")));
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//UI.navigate() con String location \n"
                + "Button button = new Button(\"Navigate to company\");\n"
                + "button.addClickListener(e ->{\n"
                + "    button.getUI().ifPresent(ui -> ui.navigate(\"company\"));\n"
                + "});");
        add(text_area);
        var button = new Button("Navigate to home view string");
        button.addClickListener(e ->{
            button.getUI().ifPresent(ui -> ui.navigate("HomeView"));
        });
        add(button);
        
        add(new ListItem(new Label("Adicional se muestra el ejemplo usando la clase que contiene la vista ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("//UI.navigate() con navegacion con clase \n"
                + "Button button = new Button(\"Navigate to company\");\n"
                + "button.addClickListener(e ->{\n"
                + "    button.getUI().ifPresent(ui -> ui.navigate(CompanyView.class));\n"
                + "});");
        add(text_area);
        
        Button button2 = new Button("Navigate to home view clase ");
            button2.addClickListener(e ->{
            button2.getUI().ifPresent(ui -> ui.navigate(HomeView.class));
        });
        add(button2);
        
        
        add(new ListItem(new Label("Tambien podemos enviar parametros a la vista ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("Button button = new Button(\"Navigate to home\");\n"
                + "button.addClickListener(e ->{\n"
                + "    //Enviamos el parametro team \n"
                + "    button.getUI().ifPresent(ui -> ui.navigate(CompanyView.class, \"team\"));\n"
                + "});\n");
        add(text_area);
        
        add(new ListItem(new Label("Para obtener la URL de una vista podemos usar el metodo UI.getCurrent().getRouter().getUrl();")));
        add(new ListItem(new Label("Revisar obsoleto")));
        
        add(new ListItem(new Label("Podemos cambiar el titulo de la pagina con la anotacion @PageTitle")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("@PageTitle(\"home\")"
                + "class HomeView extends Div{"
                + "    HomeView(){"
                + "        setText(\"This is the home view\");"
                + "  }"
                + "}");
        add(text_area);
        
        add(new ListItem(new Label("El titulo de la pagina tambien lo podemos hacer dinamico implementando la interface HasDynamicTitle")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("@Route(value=\"blog\")"
                + "class BlogPost extends Component implements HasDynamicTitle{"
                + "    private String title=\"\";"
                + "    @Override"
                + "    public String getPageTitle(){"
                + "        return title;"
                + "}"
                + "}"
                + "UI.getCurrent().getPage().setTitle(\"Dynamic title\");");
        add(text_area);
        
        add(new ListItem(new Label("Usar ambos @PageTitle y la implementacion HasDynamicTitle lanzara una exception en tiempo de ejecucion.")));
        
        add(new ListItem(new Label("Cambiando el titulo de esta ventana ")));
        UI.getCurrent().getPage().setTitle(this.title);
        
        title = new Label(" Application Layout ");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Cuando defines una ruta utilizando @Route(\"path\"), el componente por default se renderizara dentro del tag html <body>")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter4/IMG_4.png")
        );
        add(new Image(source, "img 4"));        
        
        add(new ListItem(new Label("Podemos definir diferente componentes en nuestro Layout principal ")));
        source = new StreamResource("photo", () ->
            getClass().getClassLoader().getResourceAsStream("./images/chapter4/IMG_5.png")
        );
        add(new Image(source, "img 5"));        
        
        add(new ListItem(new Label("Estos layout se pueden definir como componentes padres e hijos ")));
        add(new ListItem(new Label("Un layout padre puede ser definido con el atributo layout en la anotacion @Route")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("@Route(value=\"company\", layout=MainLayout.class)"
                + "public class CompanyComponent extends Component{"
                + "}");
        add(text_area);
        
        add(new ListItem(new Label("Cuando navegamos entre componentes que usan el mismo paren, el parent sera re-utilizado y no se actualizara durante la navegacion.")));
        add(new ListItem(new Label("Cada layout usado como parent layout deberan de implementar de la interface RouterLayoute.")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("public class MainLayout extends Div implements RouterLayout{}");
        add(text_area);
        
        add(new ListItem(new Label("La interface RouterLayout tiene un metodo default showRouterLayoiutContent el cual agrega el contenido como un componente hijo")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("public interface RouterLayout extends HasElement{\n" +
            "    default void showRouterLayoiutContent(Haselement content){\n" +
            "    \n" +
            "        if(content!=null){\n" +
            "            //No es necesario quitar el contendio viejo, RouterLayout automaticamente lo hace \n" +
            "            getElement().appendChild(Objects.requireNonNull(content.getElement));\n" +
            "        }\n" +
            "    }\n" +
            "}");
        add(text_area);
        
        add(new ListItem(new Label("No existen restricciones acerca de la cantidad de layouts ")));
        add(new ListItem(new Label("Normalmente un RouterLayout no deberia tener la anotacion @Route")));
        add(new ListItem(new Label("La clase que contiene la anotacion @ParentLayout deberia ser tambien un RouterLayout ")));
        
        
        title = new Label(" Navigation lifecycle ");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        add(new ListItem(new Label("Tres ventos son observados durante el ciclo de vida de la navegacion ")));
        add(new ListItem(new Label("1. BeforeEnterEvent")));
        add(new ListItem(new Label("2. BeforeLeaveEvent")));
        add(new ListItem(new Label("3. AfterNavigationEvent\n")));
        
        
        add(new ListItem(new Label("BeforeEnterEvent")));
        add(new ListItem(new Label("1. Es lanzado cuando un componente empieza a ser cargado ")));
        add(new ListItem(new Label("2. Puede ser observado con BeforeEnterObserver")));
        add(new ListItem(new Label("3. Puede ser usado para re-dirigir dinamicamente ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("@Route(\"blog\")\n" +
            "public class BlogList extends Div implements BeforeEnterObserver{\n" +
            "    @Override\n" +
            "    public void beforeEnter(BeforeEnterEvent event){\n" +
            "        if(getItem()== null){\n" +
            "            event.rerouteTo(NoItemsView.class);\n" +
            "        }\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "@Route(\"no-items\")\n" +
            "public class NoItemsView extends Div{\n" +
            "    \n" +
            "    public NoItemsView(){\n" +
            "        setText(\"No Items Found\");\n" +
            "    }\n" +
            "}");
        add(text_area);
        
        add(new ListItem(new Label("4. Tambien se puiede re-dirigir a una vista de error registrada por una exception de BeforeEnterEvent")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("public class AuthenticateHandler implements BeforeEnterObserver{\n" +
            "    @Override\n" +
            "    public void beforeEnter(BeforeEnterEvent event){\n" +
            "        Class<?> target = event.getNavigationTarget();\n" +
            "        if(!currentUserMayEnter(target)){\n" +
            "            event.rerouteToError(AccessDeniedException.class);\n" +
            "        }\n" +
            "    }\n" +
            "}");
        add(text_area);
        
        
        add(new ListItem(new Label("BeforeLeaveEvent")));
        add(new ListItem(new Label("1. Es lanzado cuando un componente empieza a ser destruido ")));
        add(new ListItem(new Label("2. Puede ser observado con BeforeLeaveObserver")));
        add(new ListItem(new Label("3. Puede ser usado para posponer un proposito")));
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("public class SignUp Div implements BeforeLeaveObserver{\n" +
            "    \n" +
            "    @Override\n" +
            "    public void beforeLeave(BeforeNavigationEvent event){\n" +
            "        if(this.hasChanges()){\n" +
            "            ContinueNavigationAction action = event.postpone();\n" +
            "            Dialog confirmDialog = new Dialog();\n" +
            "            Button confirmButton = new Button(\"Copnfirm\", e ->{\n" +
            "                action.proceed();\n" +
            "                confirmDialog.close();\n" +
            "            });\n" +
            "            confirmDialog.open();\n" +
            "        }\n" +
            "    }\n" +
            "}");
        add(text_area);
        
        add(new ListItem(new Label("AfterNavigationEvent")));
        add(new ListItem(new Label("1. Puede ser observado con AfterNavigationObserver")));
        add(new ListItem(new Label("2. Un buen caso de uso es cuando tu necesitas actualizar  la seleccion de menus ")));
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("public class SideMenu extends Div implements AfterNavigationObserver{\n" +
            "    Anchor blog = new Anchor(\"blog\", \"Blog\");\n" +
            "    \n" +
            "    @Override\n" +
            "    public void afterNavigation(AfterNavigationEvent event){\n" +
            "        boolean active = event.getLocation().getFirstSegment().equals(blog.getHref);\n" +
            "        blog.getElement().getClassList().set(\"active\",\"active\");\n" +
            "    }\n" +
            "}");
        add(text_area);
        
        
        title = new Label(" ");
        title.getStyle().set("fontWeight", "bold");
        add(title);
        
        text_area = new TextArea();
        text_area.setReadOnly(true);
        text_area.setWidthFull();
        text_area.setValue("");
        add(text_area);
        
        add(new ListItem(new Label("")));
    }

    
}
