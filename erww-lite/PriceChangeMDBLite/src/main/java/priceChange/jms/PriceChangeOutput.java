/**
 * PriceChangeOutput.java
 *
 * This file was auto-generated from WSDL
 * by the IBM WebServices WSDL2Java emitter.
 * 3
 */

package priceChange.jms;

public class PriceChangeOutput  implements java.io.Serializable {
    /**
	 * Autogenerated UID
	 */
	private static final long serialVersionUID = -1483397660029199783L;
	private double itemPrice;
    private int itemId;

    public PriceChangeOutput() {
    }


    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    private java.lang.Object __equalsCalc = null;
    
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof PriceChangeOutput)) return false;
        PriceChangeOutput other = (PriceChangeOutput) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            itemPrice == other.getItemPrice() &&
            itemId == other.getItemId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += Double.valueOf(getItemPrice()).hashCode();
        _hashCode += getItemId();
        __hashCodeCalc = false;
        return _hashCode;
    }


}
