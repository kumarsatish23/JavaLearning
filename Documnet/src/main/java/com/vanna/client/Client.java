package com.vanna.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.vanna.Webservice.Base;


public class Client {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://localhost:1234/WS/Saivarma?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QName qname=new QName("http://Webservice.vanna.com/","BaseImplService");
		
		Service service=Service.create(url, qname);
		Base msg=service.getPort(Base.class);
		System.out.println(msg.getAString(" Saivarma"));
	}

}
