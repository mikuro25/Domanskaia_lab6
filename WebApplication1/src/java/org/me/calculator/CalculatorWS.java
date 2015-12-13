/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Hanna
 */
@WebService(serviceName = "CalculatorWS")
public class CalculatorWS {

 
    /**
     * Операция веб-службы
     */
    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "parameter") int parameter) {
        String character = null;
        switch(parameter){            
            case 1:
                character ="one";
                break;
            case 2:
                character ="two";
                break;
             case 3:
                character ="three";
                break;
        }
        return character;
    }
}
