package com.vanna.servlets;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Filereadandwrite extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		File read=new File("C:\\Users\\sakarapu\\Documents\\xyz.txt");
		File write=new File("C:\\Users\\sakarapu\\Documents\\abc.txt");
		
		 FileReader r = null;  
		  FileWriter w = null;  
		  PrintWriter out=response.getWriter();
		  try {  
		   r = new FileReader(read);  
		   w = new FileWriter(write);  
		   int ch;  
		   while ((ch = r.read()) != -1) {  
		    w.write(ch);  
		   }  
		   out.println("Succesful");
		  } catch (IOException e) {  
		   System.out.println(e);  
		   } finally {   
		    r.close();  
		    w.close();  
		   }
	}
}
		  
