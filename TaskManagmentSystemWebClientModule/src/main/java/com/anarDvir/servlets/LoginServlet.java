package com.anarDvir.servlets;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Holder;

import com.anarDvir.servlets.beans.UserBean;
import com.anarDvir.tools.Const;


/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	private Logger logger = Logger.getLogger(LoginServlet.class.getName());
	//private ClientWSDL port = null;
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

/*	public void initClientWebService() {
		URL wsdlURL = ClientWSDL_Service.WSDL_LOCATION;

		ClientWSDL_Service ss = new ClientWSDL_Service(wsdlURL, ClientWSDL_Service.SERVICE);
		port = ss.getClientWSDLSOAP();  

	}*/

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		logger.info("excecute init method");
		//initClientWebService();

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
		UserBean userBean = new UserBean(reqUserName, reqPass);

		//port.userAuthentication(new Holder<UserElementType>(new UserElementType(userBean)));
		//TODO front-end query should return user : userBean = UserFrontEnd.login(userBean);
		boolean authenticationResult = reqUserName.equalsIgnoreCase("user") && reqPass.equalsIgnoreCase("pass");
		userBean.setAuthenticate(authenticationResult);// set the result of the query

		if (userBean.getAuthenticate()) {
			request.getSession().setAttribute(Const.CURRENT_USER_ATT, userBean); //set the user bean on the session
			redirectPageUri = Const.SUCCESS_LOGIN_PAGE;
		}

		response.sendRedirect(redirectPageUri);
	}
}
