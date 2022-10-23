
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BanqeWS", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:9191/?wsdl")
public class BanqeWS
    extends Service
{

    private final static URL BANQEWS_WSDL_LOCATION;
    private final static WebServiceException BANQEWS_EXCEPTION;
    private final static QName BANQEWS_QNAME = new QName("http://ws/", "BanqeWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9191/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANQEWS_WSDL_LOCATION = url;
        BANQEWS_EXCEPTION = e;
    }

    public BanqeWS() {
        super(__getWsdlLocation(), BANQEWS_QNAME);
    }

    public BanqeWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANQEWS_QNAME, features);
    }

    public BanqeWS(URL wsdlLocation) {
        super(wsdlLocation, BANQEWS_QNAME);
    }

    public BanqeWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANQEWS_QNAME, features);
    }

    public BanqeWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BanqeWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort() {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANQEWS_EXCEPTION!= null) {
            throw BANQEWS_EXCEPTION;
        }
        return BANQEWS_WSDL_LOCATION;
    }

}
