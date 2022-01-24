package com.janadri.filter;

import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addAlien")
public class IdFilter extends HttpFilter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public IdFilter() {
        super();
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		if(aid>1)
		chain.doFilter(request, response);
		else
			out.println("Invalid input");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
