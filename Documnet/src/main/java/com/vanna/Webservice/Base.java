package com.vanna.Webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface Base {
	@WebMethod String getAString(String name);
}
