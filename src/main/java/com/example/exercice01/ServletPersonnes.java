package com.example.exercice01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Personne;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "servletPersonnes", value = "/servletPersonnes")
public class ServletPersonnes extends HttpServlet {


    private List<Personne> personnes;
    @Override
    public void init() throws ServletException {

        List<Personne> personnes = new ArrayList<Personne>();


        personnes.add(new Personne("Doe", "John", 30));
        personnes.add(new Personne("Smith", "Jane", 25));
        personnes.add(new Personne("Johnson", "Bob", 35));

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personnes", personnes);
        getServletContext().getRequestDispatcher("/WEB-INF/pagePersonnes.jsp").forward(req, resp);
    }
}
