package com.vanna.filters.SpringFilter2.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class SecurityFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//		System.out.println("doFilter() method is invoked");
//		HttpServletRequest httpreq=(HttpServletRequest)request;
//		HttpServletResponse httpresp=(HttpServletResponse)response;
//		System.out.println("Context path is:"+httpreq.getContextPath());
//		chain.doFilter(httpreq,httpresp);;
//		System.out.println("End of doFilter() method");
		System.out.println("Remote Host:"+request.getRemoteHost());
		System.out.println("Remote Address"+request.getRemoteAddr());
		chain.doFilter(request, response);
	}
	@Override
	public void init(FilterConfig config) throws ServletException{
		System.out.println("init() method has been get invoked");
        System.out.println("Filter name is "+config.getFilterName());
        System.out.println("ServletContext name is"+config.getServletContext());
        System.out.println("init() method is ended");
	}
	@Override
	public void destroy() {
		
	}
}
