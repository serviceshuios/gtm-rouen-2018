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

import fr.gtm.bovoyage.entities.DatesVoyage;
import fr.gtm.bovoyage.service.DestinationService;





/**
 * Servlet implementation class DetailsDestinationServlet
 */
@WebServlet("/DetailsDestinationServlet")
public class DetailsDestinationServlet extends HttpServlet {
	private static final Logger LOG=Logger.getLogger(DetailsDestinationServlet.class.getName());
	
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
		long id = 0;
		List<DatesVoyage> datesVoyages = service.getDatesVoyages(id);
		request.setAttribute("datesVoyages", datesVoyages);
		String page = "/DetailsDestination.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
