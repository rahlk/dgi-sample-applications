//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:17 AM(foreman)-)
//


package orderstatus.lite.ws;

import jakarta.xml.ws.WebFault;

@WebFault(name = "Exception", targetNamespace = "http://ws.lite.orderstatus/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
	 * Autogenerated UID
	 */
	private static final long serialVersionUID = -97863884218544080L;
	/**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private orderstatus.lite.ws.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, orderstatus.lite.ws.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param message
     * @param cause
     */
    public Exception_Exception(String message, orderstatus.lite.ws.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: orderstatus.lite.ws.Exception
     */
    public orderstatus.lite.ws.Exception getFaultInfo() {
        return faultInfo;
    }

}