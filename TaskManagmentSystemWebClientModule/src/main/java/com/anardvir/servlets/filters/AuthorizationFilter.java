package com.anardvir.servlets.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.anardvir.tools.Const;
import com.anardvir.webservicecontracts.clientwsdl.userelementtype.UserElementType;

/**
 * Servlet Filter implementation class AuthorizationFilter
 */
@WebFilter(description = "cheking authorization for each request", urlPatterns = { "/Login*" })
public class AuthorizationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthorizationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
	
		UserElementType currentUser = (UserElementType) request.getAttribute(Const.CURRENT_USER_ATT);
		
		if (currentUser == null) {
			request.getServletContext()
				.getRequestDispatcher(Const.ERROR_LOGIN_PAGE).forward(request, response);
		}		

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
