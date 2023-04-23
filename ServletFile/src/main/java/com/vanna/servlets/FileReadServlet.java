package com.vanna.servlets;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileReadServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String filename = "C:\\Users\\sakarapu\\Documents\\Tomcat.txt";
		

		Path path = Paths.get(filename);
		try (Scanner scanner = new Scanner(path)) {
			PrintWriter out=response.getWriter();
			
			System.out.println("Reading the file");
			while(scanner.hasNextLine()){
			    String line = scanner.nextLine();
			    out.println("<h1><center>"+line+"</center></h1>");
			}
		}
//		
//		File file = new File(filename);
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		PrintWriter out=response.getWriter();
//		
//		String line;
//		while((line = br.readLine()) != null){
//		    //process the line
//		    out.println("<h1>"+line+"</h1>");
//		}
	}
}
