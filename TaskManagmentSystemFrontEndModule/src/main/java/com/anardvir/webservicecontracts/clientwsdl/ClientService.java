package com.anardvir.webservicecontracts.clientwsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.4
 * 2012-08-10T19:09:18.032+03:00
 * Generated source version: 2.5.4
 * 
 */
@WebServiceClient(name = "ClientService", 
                  wsdlLocation = "http://localhost:8080/TaskManagmentSystemFrontEndModule/services/ClientPort?wsdl",
                  targetNamespace = "http://www.anardvir.com/WebServiceContracts/ClientWSDL/") 
public class ClientService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.anardvir.com/WebServiceContracts/ClientWSDL/", "ClientService");
    public final static QName ClientPort = new QName("http://www.anardvir.com/WebServiceContracts/ClientWSDL/", "ClientPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/TaskManagmentSystemFrontEndModule/services/ClientPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ClientService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/TaskManagmentSystemFrontEndModule/services/ClientPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ClientService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ClientService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClientService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ClientPort
     */
    @WebEndpoint(name = "ClientPort")
    public ClientPort getClientPort() {
        return super.getPort(ClientPort, ClientPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClientPort
     */
    @WebEndpoint(name = "ClientPort")
    public ClientPort getClientPort(WebServiceFeature... features) {
        return super.getPort(ClientPort, ClientPort.class, features);
    }

}
