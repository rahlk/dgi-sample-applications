//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.05 at 03:32:18 PM EDT 
//


package orderlinejpa;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderlineData_QNAME = new QName("", "OrderlineData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderlineInfo }
     * 
     */
    public OrderlineInfo createOrderlineInfo() {
        return new OrderlineInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderlineInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OrderlineData")
    public JAXBElement<OrderlineInfo> createOrderlineData(OrderlineInfo value) {
        return new JAXBElement<OrderlineInfo>(_OrderlineData_QNAME, OrderlineInfo.class, null, value);
    }

}
