package com.vanna.Webservice;

import javax.xml.ws.Endpoint;

public class MainApp {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1235/WS/Saivarma", new BaseImpl());
	}

}
