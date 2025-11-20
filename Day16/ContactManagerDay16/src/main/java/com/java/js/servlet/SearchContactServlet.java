package com.java.js.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.js.dao.ContactDao;

public class SearchContactServlet extends HttpServlet {
	private ContactDao dao = new ContactDao();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String keyword = req.getParameter("keyword");
		req.setAttribute("results", dao.searchByName(keyword));
		req.getRequestDispatcher("search.jsp").forward(req, resp);
	}
}
