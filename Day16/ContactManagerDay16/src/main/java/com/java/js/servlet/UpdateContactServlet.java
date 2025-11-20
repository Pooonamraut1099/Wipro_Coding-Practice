package com.java.js.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.js.dao.ContactDao;
import com.java.js.model.Contact;

public class UpdateContactServlet extends HttpServlet {
    private ContactDao dao = new ContactDao();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Contact contact = dao.getContactById(id);
        req.setAttribute("contact", contact);
        req.getRequestDispatcher("update.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int id = Integer.parseInt(req.getParameter("id"));
        dao.updateContact(id, req.getParameter("name"), req.getParameter("phone"), req.getParameter("email"));
        resp.sendRedirect("view");
    }
}
