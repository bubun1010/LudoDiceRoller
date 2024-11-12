package com.ludo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/roll")
public class DiceRollServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("You rolled a: " + roll);
    }
}