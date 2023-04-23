package com.vanna;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class Myfilter {

	public void init(FilterConfig arg0)throws ServletException{
	}
	public void doFilter(ServletRequest request, ServletResponse res, FilterChain chain)throws IOException,ServletException
	{
		PrintWriter out=res.getWriter();
		out.print("Filter is invoked before");
		chain.doFilter(request, res);
		out.print("filter is invoked after");
	}
	public void destroy() {
	}
}
