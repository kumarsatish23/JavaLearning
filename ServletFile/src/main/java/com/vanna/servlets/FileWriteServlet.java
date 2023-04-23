package com.vanna.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileWriteServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String filename = "C:\\Users\\sakarapu\\Documents\\xyz.txt";
		String text="Tomcat Server";
		
		PrintWriter out=response.getWriter();
		
		 try {
	            Files.write(Paths.get(filename), text.getBytes());
	            out.println("Text Added");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
