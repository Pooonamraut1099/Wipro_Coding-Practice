package com.java.js.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.js.dao.ContactDao;

public class ViewContactsServlet extends HttpServlet {
    private ContactDao dao = new ContactDao();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("contacts", dao.getContacts());
        req.getRequestDispatcher("view.jsp").forward(req, resp);
    }

}
