
package ru.itmo.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LoyaltyService", targetNamespace = "http://itmo.ru/", wsdlLocation = "http://localhost:8080/LoyaltyService?wsdl")
public class LoyaltyService_Service
    extends Service
{

    private final static URL LOYALTYSERVICE_WSDL_LOCATION;
    private final static WebServiceException LOYALTYSERVICE_EXCEPTION;
    private final static QName LOYALTYSERVICE_QNAME = new QName("http://itmo.ru/", "LoyaltyService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/LoyaltyService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOYALTYSERVICE_WSDL_LOCATION = url;
        LOYALTYSERVICE_EXCEPTION = e;
    }

    public LoyaltyService_Service() {
        super(__getWsdlLocation(), LOYALTYSERVICE_QNAME);
    }

    public LoyaltyService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOYALTYSERVICE_QNAME, features);
    }

    public LoyaltyService_Service(URL wsdlLocation) {
        super(wsdlLocation, LOYALTYSERVICE_QNAME);
    }

    public LoyaltyService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOYALTYSERVICE_QNAME, features);
    }

    public LoyaltyService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoyaltyService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LoyaltyService
     */
    @WebEndpoint(name = "LoyaltyServicePort")
    public LoyaltyService getLoyaltyServicePort() {
        return super.getPort(new QName("http://itmo.ru/", "LoyaltyServicePort"), LoyaltyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoyaltyService
     */
    @WebEndpoint(name = "LoyaltyServicePort")
    public LoyaltyService getLoyaltyServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://itmo.ru/", "LoyaltyServicePort"), LoyaltyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOYALTYSERVICE_EXCEPTION!= null) {
            throw LOYALTYSERVICE_EXCEPTION;
        }
        return LOYALTYSERVICE_WSDL_LOCATION;
    }

}
