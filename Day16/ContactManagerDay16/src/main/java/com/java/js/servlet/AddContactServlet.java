package com.java.js.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.js.dao.ContactDao;

public class AddContactServlet extends HttpServlet {
	private ContactDao dao = new ContactDao();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");

		if (name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
			req.setAttribute("msg", "Error: All fields are required!");
			req.getRequestDispatcher("error.jsp").forward(req, resp);
			return;
		}

		dao.addContact(name, phone, email);
		req.setAttribute("msg", "Contact Added Successfully!");
		req.getRequestDispatcher("success.jsp").forward(req, resp);
	}

}
