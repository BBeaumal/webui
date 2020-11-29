package com.mycompany.tennis.webui.controller;

import com.mycompany.tennis.core.DTO.JoueurDTO;
import com.mycompany.tennis.core.services.JoueurService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listes")
public class ListeJoueurServlet extends HttpServlet {

    private JoueurService joueurService;

    public ListeJoueurServlet() {
        this.joueurService = new JoueurService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<JoueurDTO> listeHommes = joueurService.getListeParamJoueurs('H');
        List<JoueurDTO> listeFemmes = joueurService.getListeParamJoueurs('F');

        req.setAttribute("listeHommes", listeHommes);
        req.setAttribute("listeFemmes", listeFemmes);

        RequestDispatcher disp = req.getRequestDispatcher("listes.jsp");
        disp.forward(req, resp);
    }
}
