package org.scoula.test0605.controller;

import org.scoula.test0605.model.Menu;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuController {
    public List<Menu> list = new ArrayList<>();


    public String getMenu(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("menuList", list);
        return "menu/list";
    }

    public String getAdd(HttpServletRequest req, HttpServletResponse resp) {
        return "menu/add";
    }
    public String postAdd(HttpServletRequest req, HttpServletResponse resp){
        String name = req.getParameter("user");
        String price = req.getParameter("price");

        list.add(new Menu(name, price));
        return "redirect:/menu/list";
    }
}
