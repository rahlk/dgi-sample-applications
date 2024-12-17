//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:17 AM(foreman)-)
//


package neworder.lite.ws;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for newOrderOutputInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="newOrderOutputInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="outCustomerCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outCustomerDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="outCustomerId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="outCustomerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outDistrictId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="outDistrictTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="outItemList" type="{http://ws.lite.neworder/}newOrderSingleItemOutInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outOrderEntryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outOrderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outOrderItemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="outWarehouseId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="outWarehouseTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="stcnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newOrderOutputInfo", propOrder = {
    "entityType",
    "outCustomerCredit",
    "outCustomerDiscount",
    "outCustomerId",
    "outCustomerLastName",
    "outDistrictId",
    "outDistrictTax",
    "outItemList",
    "outMsg",
    "outOrderEntryDate",
    "outOrderId",
    "outOrderItemCount",
    "outTotal",
    "outWarehouseId",
    "outWarehouseTax",
    "stcnum"
})
public class NewOrderOutputInfo
    implements Serializable
{

    /**
	 * Autogenerated UID
	 */
	private static final long serialVersionUID = -4514907715027487467L;
	protected short entityType;
    protected String outCustomerCredit;
    protected double outCustomerDiscount;
    protected short outCustomerId;
    protected String outCustomerLastName;
    protected short outDistrictId;
    protected double outDistrictTax;
    @XmlElement(nillable = true)
    protected List<NewOrderSingleItemOutInfo> outItemList;
    protected String outMsg;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOrderEntryDate;
    protected int outOrderId;
    protected int outOrderItemCount;
    protected double outTotal;
    protected short outWarehouseId;
    protected double outWarehouseTax;
    protected String stcnum;

    /**
     * Gets the value of the entityType property.
     * 
     */
    public short getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     */
    public void setEntityType(short value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the outCustomerCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCredit() {
        return outCustomerCredit;
    }

    /**
     * Sets the value of the outCustomerCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCredit(String value) {
        this.outCustomerCredit = value;
    }

    /**
     * Gets the value of the outCustomerDiscount property.
     * 
     */
    public double getOutCustomerDiscount() {
        return outCustomerDiscount;
    }

    /**
     * Sets the value of the outCustomerDiscount property.
     * 
     */
    public void setOutCustomerDiscount(double value) {
        this.outCustomerDiscount = value;
    }

    /**
     * Gets the value of the outCustomerId property.
     * 
     */
    public short getOutCustomerId() {
        return outCustomerId;
    }

    /**
     * Sets the value of the outCustomerId property.
     * 
     */
    public void setOutCustomerId(short value) {
        this.outCustomerId = value;
    }

    /**
     * Gets the value of the outCustomerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerLastName() {
        return outCustomerLastName;
    }

    /**
     * Sets the value of the outCustomerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerLastName(String value) {
        this.outCustomerLastName = value;
    }

    /**
     * Gets the value of the outDistrictId property.
     * 
     */
    public short getOutDistrictId() {
        return outDistrictId;
    }

    /**
     * Sets the value of the outDistrictId property.
     * 
     */
    public void setOutDistrictId(short value) {
        this.outDistrictId = value;
    }

    /**
     * Gets the value of the outDistrictTax property.
     * 
     */
    public double getOutDistrictTax() {
        return outDistrictTax;
    }

    /**
     * Sets the value of the outDistrictTax property.
     * 
     */
    public void setOutDistrictTax(double value) {
        this.outDistrictTax = value;
    }

    /**
     * Gets the value of the outItemList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outItemList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutItemList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewOrderSingleItemOutInfo }
     * 
     * 
     */
    public List<NewOrderSingleItemOutInfo> getOutItemList() {
        if (outItemList == null) {
            outItemList = new ArrayList<NewOrderSingleItemOutInfo>();
        }
        return this.outItemList;
    }

    /**
     * Gets the value of the outMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMsg() {
        return outMsg;
    }

    /**
     * Sets the value of the outMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMsg(String value) {
        this.outMsg = value;
    }

    /**
     * Gets the value of the outOrderEntryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOrderEntryDate() {
        return outOrderEntryDate;
    }

    /**
     * Sets the value of the outOrderEntryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOrderEntryDate(XMLGregorianCalendar value) {
        this.outOrderEntryDate = value;
    }

    /**
     * Gets the value of the outOrderId property.
     * 
     */
    public int getOutOrderId() {
        return outOrderId;
    }

    /**
     * Sets the value of the outOrderId property.
     * 
     */
    public void setOutOrderId(int value) {
        this.outOrderId = value;
    }

    /**
     * Gets the value of the outOrderItemCount property.
     * 
     */
    public int getOutOrderItemCount() {
        return outOrderItemCount;
    }

    /**
     * Sets the value of the outOrderItemCount property.
     * 
     */
    public void setOutOrderItemCount(int value) {
        this.outOrderItemCount = value;
    }

    /**
     * Gets the value of the outTotal property.
     * 
     */
    public double getOutTotal() {
        return outTotal;
    }

    /**
     * Sets the value of the outTotal property.
     * 
     */
    public void setOutTotal(double value) {
        this.outTotal = value;
    }

    /**
     * Gets the value of the outWarehouseId property.
     * 
     */
    public short getOutWarehouseId() {
        return outWarehouseId;
    }

    /**
     * Sets the value of the outWarehouseId property.
     * 
     */
    public void setOutWarehouseId(short value) {
        this.outWarehouseId = value;
    }

    /**
     * Gets the value of the outWarehouseTax property.
     * 
     */
    public double getOutWarehouseTax() {
        return outWarehouseTax;
    }

    /**
     * Sets the value of the outWarehouseTax property.
     * 
     */
    public void setOutWarehouseTax(double value) {
        this.outWarehouseTax = value;
    }

    /**
     * Gets the value of the stcnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStcnum() {
        return stcnum;
    }

    /**
     * Sets the value of the stcnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStcnum(String value) {
        this.stcnum = value;
    }

}