package com.andersen.servlet;import com.andersen.bean.Message;import com.andersen.core.Response;import com.andersen.db.DBAccess;import com.andersen.service.MainService;import com.andersen.service.QueryService;import org.apache.ibatis.session.SqlSession;import org.apache.log4j.Logger;import javax.print.attribute.standard.Media;import javax.servlet.ServletException;import javax.servlet.http.HttpServlet;import javax.servlet.http.HttpServletRequest;import javax.servlet.http.HttpServletResponse;import java.io.IOException;import java.io.PrintWriter;import java.sql.*;import java.util.ArrayList;import java.util.List;import static java.lang.Class.*;public class ListServlet extends HttpServlet {    @Override    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        resp.setContentType("text/html; charset=UTF-8");        String command = req.getParameter("command");        String description = req.getParameter("description");        QueryService queryService = new QueryService();        PrintWriter printWriter = resp.getWriter();            Response response = new Response();            response.setDATA(queryService.getList(command,description));            printWriter.write(response.toJsonStr());    }    @Override    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        this.doGet(req,resp);    }}