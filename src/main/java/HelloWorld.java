
package sample;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://sample/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://sample/", className = "sample.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://sample/", className = "sample.HelloResponse")
    public String hello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
