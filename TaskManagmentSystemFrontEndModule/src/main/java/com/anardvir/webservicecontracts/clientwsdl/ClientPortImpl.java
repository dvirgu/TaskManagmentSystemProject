
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.anardvir.webservicecontracts.clientwsdl;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.4
 * 2012-08-10T19:09:17.962+03:00
 * Generated source version: 2.5.4
 * 
 */

@javax.jws.WebService(
                      serviceName = "ClientService",
                      portName = "ClientPort",
                      targetNamespace = "http://www.anardvir.com/WebServiceContracts/ClientWSDL/",
                      wsdlLocation = "http://localhost:8080/TaskManagmentSystemFrontEndModule/services/ClientPort?wsdl",
                      endpointInterface = "com.anardvir.webservicecontracts.clientwsdl.ClientPort")
                      
public class ClientPortImpl implements ClientPort {

    private static final Logger LOG = Logger.getLogger(ClientPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.anardvir.webservicecontracts.clientwsdl.ClientPort#login(com.anardvir.webservicecontracts.clientwsdl.userelementtype.UserElementType  userRequest )*
     */
    public com.anardvir.webservicecontracts.clientwsdl.userelementtype.UserElementType login(com.anardvir.webservicecontracts.clientwsdl.userelementtype.UserElementType userRequest) { 
        LOG.info("Executing operation login");
        
        //TODO request user form back-end
        try {
           if (userRequest.getUserName().equalsIgnoreCase("user")
        		   && userRequest.getPassword().equalsIgnoreCase("test")) {
        	   
        	   userRequest.setEmail("dvirg@gmail.com");
        	   return userRequest;
           }
           
           return null;
           
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
