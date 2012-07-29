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
 * 2012-07-28T18:21:23.175+03:00
 * Generated source version: 2.5.4
 * 
 */
@WebServiceClient(name = "ClientWSDL", 
                  wsdlLocation = "http://www.anarDvir.com/?wsdl",
                  targetNamespace = "http://www.anarDvir.com/WebServiceContracts/ClientWSDL/") 
public class ClientWSDL_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.anarDvir.com/WebServiceContracts/ClientWSDL/", "ClientWSDL");
    public final static QName ClientWSDLSOAP = new QName("http://www.anarDvir.com/WebServiceContracts/ClientWSDL/", "ClientWSDLSOAP");
    static {
        URL url = null;
        try {
            url = new URL("http://www.anarDvir.com/?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ClientWSDL_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://www.anarDvir.com/?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ClientWSDL_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ClientWSDL_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClientWSDL_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ClientWSDL_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ClientWSDL_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ClientWSDL_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ClientWSDL
     */
    @WebEndpoint(name = "ClientWSDLSOAP")
    public ClientWSDL getClientWSDLSOAP() {
        return super.getPort(ClientWSDLSOAP, ClientWSDL.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.
     *     Supported features not in the <code>features</code> parameter will have their default values.
     *     
     * @return
     *     returns ClientWSDL
     */
    @WebEndpoint(name = "ClientWSDLSOAP")
    public ClientWSDL getClientWSDLSOAP(WebServiceFeature... features) {
        return super.getPort(ClientWSDLSOAP, ClientWSDL.class, features);
    }

}
