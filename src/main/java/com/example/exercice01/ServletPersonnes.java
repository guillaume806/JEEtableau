package com.example.exercice01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "servletPersonnes", value = "/servletPersonnes")
public class ServletPersonnes extends HttpServlet {


    private List<String> prenoms;
    @Override
    public void init() throws ServletException {


        prenoms = new ArrayList<>();
        prenoms.add("Jack lang 65");
        prenoms.add("Sully bonobo 30");
        prenoms.add("Chloée tuche 25");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("prenoms", prenoms);
        getServletContext().getRequestDispatcher("/WEB-INF/pagePersonnes.jsp").forward(req, resp);
    }
}
