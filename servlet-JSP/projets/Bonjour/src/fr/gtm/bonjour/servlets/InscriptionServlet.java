package fr.gtm.bonjour.servlets;

import java.io.IOException;
import java.io.Writer;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = Logger.getLogger(InscriptionServlet.class.getName());
	
       
   
    public InscriptionServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LOG.info(">>> réception par GET");
		String civilite = request.getParameter("civilite");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		Writer out = response.getWriter();
		
		out.append ("<!DOCTYPE html><html><head>")
		.append("<meta charset=\"UTF-8\">")
		.append ("<title>Bonjour</title>")
		.append("</h2>/body><h2>Bonjour ")
		.append(civilite).append(" ").append(prenom).append(" ").append(nom)
		.append("</h2></body></html>");
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info(">>> réception par POST");
		doGet(request, response);
	}

}
