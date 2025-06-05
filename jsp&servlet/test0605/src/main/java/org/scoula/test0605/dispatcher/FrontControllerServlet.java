package org.scoula.test0605.dispatcher;

import org.scoula.test0605.command.Command;
import org.scoula.test0605.controller.HomeController;
import org.scoula.test0605.controller.MenuController;
import org.scoula.test0605.model.Menu;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet(name = "frontControllerServlet", value = "/")
public class FrontControllerServlet extends DispatcherServlet {

    String prefix = "/WEB-INF/views/";
    String suffix = ".jsp";

    HomeController homeController = new HomeController();
    MenuController menuController = new MenuController();


    ServletContext sc;

    @Override
    public void init(ServletConfig config) throws ServletException {
        menuController.list.add(new Menu("오리지널 타코야끼", "3000"));
        menuController.list.add(new Menu("치즈 타코야끼", "3500"));

        sc = config.getServletContext();

    }

    @Override
    protected void createMap(Map<String, Command> getMap, Map<String, Command> postMap) {
        getMap.put("/", homeController::getWelcome);

        getMap.put("/menu/list", menuController::getMenu);
        getMap.put("/menu/add", menuController::getAdd);


        postMap.put("/menu/add", menuController::postAdd);

    }
    public void execute(Command command, HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        String viewName = command.execute(req, resp);

        if (viewName.startsWith("redirect:")){
            resp.sendRedirect(viewName.substring("redirect:".length()));

        }else {
            String view = prefix+viewName+suffix;
            RequestDispatcher dis = req.getRequestDispatcher(view);
            dis.forward(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Command command = getCommand(req);
        if(command != null){
            execute(command, req, resp);
        }else {
            String view = prefix+"404"+suffix;
            RequestDispatcher dis = req.getRequestDispatcher(view);
            dis.forward(req, resp);        }

    }

    private String getCommandName(HttpServletRequest req){
        String requestURI = req.getRequestURI();
        String contextPath = req.getContextPath();
        return requestURI.substring(contextPath.length());

    }

    private Command getCommand(HttpServletRequest req){
        String commandName = getCommandName(req);

        Command command;
        if(req.getMethod().equalsIgnoreCase("GET")){
            command = getMap.get(commandName);
        }else {
            command = postMap.get(commandName);
        }
        return command;
    }


}
