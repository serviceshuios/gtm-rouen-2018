package fr.gtm.bovoyage.servlets;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import fr.gtm.bovoyage.entities.Destination;
import fr.gtm.bovoyage.service.DestinationService;


@WebServlet("/ListDestinationsServlet")
public class ListDestinationsServlet extends HttpServlet {
	private static final Logger LOG=Logger.getLogger(ListDestinationsServlet.class.getName());
	
	private static final long serialVersionUID = 1L;
       
    
	private static DestinationService service;
	
	@Resource (name="jdbc/bovoyages") DataSource ds;
	@Override
	public void init() throws ServletException {
		super.init();
		
		service = new DestinationService(ds);
		LOG.info(">>>>>>>> connection par init ");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Destination> destinations = service.getAllDestinations();
		request.setAttribute("destinations", destinations);
		String page = "/List_destinations.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
