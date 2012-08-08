package com.anardvir.servlets;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Holder;

import com.anardvir.tools.Const;
import com.anardvir.webservicecontracts.clientwsdl.ClientPort;
import com.anardvir.webservicecontracts.clientwsdl.ClientService;
import com.anardvir.webservicecontracts.clientwsdl.userelementtype.ObjectFactory;
import com.anardvir.webservicecontracts.clientwsdl.userelementtype.UserElementType;


/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private Logger logger = Logger.getLogger(LoginServlet.class.getName());

	private static ClientService _ss;
	private static ClientPort _port;
	
	static {
		initClientWebService();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static void initClientWebService() {

		_ss = new ClientService(ClientService.WSDL_LOCATION, ClientService.SERVICE);
		_port = _ss.getClientPort();

	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request,response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request,response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		request.getSession().removeAttribute(Const.CURRENT_USER_ATT);
		String redirectPageUri = Const.ERROR_LOGIN_PAGE; //Error Page. 		//TODO add error page redirection

		//Create new UserBean entity
		String reqUserName = request.getParameter("userName");
		String reqPass = request.getParameter("password");
		
		ObjectFactory objectFactory = new ObjectFactory();
		UserElementType user = objectFactory.createUserElementType();
		user.setUserName(reqUserName);
		user.setPassword(reqPass);
		
		user = _port.login(user);
		
		if (user != null) {
			//set the user bean on the session
			request.getSession().setAttribute(Const.CURRENT_USER_ATT, user); 
			redirectPageUri = Const.SUCCESS_LOGIN_PAGE;
		}

		response.sendRedirect(redirectPageUri);
	}
}
