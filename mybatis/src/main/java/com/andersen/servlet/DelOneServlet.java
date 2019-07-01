package com.andersen.servlet;

import com.andersen.core.Response;
import com.andersen.service.MainService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DelOneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String id = req.getParameter("id");
        MainService mainService = new MainService();
        mainService.delOne(id);

        PrintWriter printWriter = resp.getWriter();
        Response response = new Response();
        response.setDATA(null);
        response.setCODE(200);
        printWriter.write(response.toJsonStr());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
