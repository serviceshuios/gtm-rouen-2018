package fr.gtm.bonjour.servlets;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/BonjourServlet", "/foo" }) // les deux URL
public class BonjourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public BonjourServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//crée un objet qui n'est pas immuable
		
		StringBuffer sb =  new StringBuffer();
		Date date = new Date();
		sb.append("<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>Bonjour</title>");
		sb.append("</head>").append("<body>").append("<h2></h2>");
		sb.append("Nous sommes le : ").append(date.toString());
		sb.append("</body></html>");
		response.setContentType("text/html"); // pour forcer l'UTF - 8
		response.setCharacterEncoding("UTF-8");
		Writer out = response.getWriter();
		out.write(sb.toString());

		 
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
