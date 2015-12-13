
package org.me.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorWS", targetNamespace = "http://calculator.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWS {


    /**
     * 
     * @param parameter
     * @param character
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.AddResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/addRequest", output = "http://calculator.me.org/CalculatorWS/addResponse")
    public String add(
        @WebParam(name = "parameter", targetNamespace = "")
        int parameter,
        @WebParam(name = "character", targetNamespace = "")
        String character);

}
