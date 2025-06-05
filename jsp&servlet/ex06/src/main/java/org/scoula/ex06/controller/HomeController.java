package org.scoula.ex06.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {
    public String getIndex(HttpServletRequest req, HttpServletResponse resp){
        return "index";
    }
}
