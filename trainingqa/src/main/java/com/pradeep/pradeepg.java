package com.pradeep;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class pradeepg extends HttpServlet {
       @Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		  
        PrintWriter out = response.getWriter();
          
        out.print("<html>");
        out.print("<body>");
        out.print("<h2>pradeepg</h2>");
        out.print("</body>");
        out.print("</html>");
	}

}
