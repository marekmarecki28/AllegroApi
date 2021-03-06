/**
 * DoGetMyWatchItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoGetMyWatchItemsResponse  implements java.io.Serializable {
    private int watchItemsCounter;

    private SandboxWebApi.WatchItemStruct[] watchItemsList;

    public DoGetMyWatchItemsResponse() {
    }

    public DoGetMyWatchItemsResponse(
           int watchItemsCounter,
           SandboxWebApi.WatchItemStruct[] watchItemsList) {
           this.watchItemsCounter = watchItemsCounter;
           this.watchItemsList = watchItemsList;
    }


    /**
     * Gets the watchItemsCounter value for this DoGetMyWatchItemsResponse.
     * 
     * @return watchItemsCounter
     */
    public int getWatchItemsCounter() {
        return watchItemsCounter;
    }


    /**
     * Sets the watchItemsCounter value for this DoGetMyWatchItemsResponse.
     * 
     * @param watchItemsCounter
     */
    public void setWatchItemsCounter(int watchItemsCounter) {
        this.watchItemsCounter = watchItemsCounter;
    }


    /**
     * Gets the watchItemsList value for this DoGetMyWatchItemsResponse.
     * 
     * @return watchItemsList
     */
    public SandboxWebApi.WatchItemStruct[] getWatchItemsList() {
        return watchItemsList;
    }


    /**
     * Sets the watchItemsList value for this DoGetMyWatchItemsResponse.
     * 
     * @param watchItemsList
     */
    public void setWatchItemsList(SandboxWebApi.WatchItemStruct[] watchItemsList) {
        this.watchItemsList = watchItemsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyWatchItemsResponse)) return false;
        DoGetMyWatchItemsResponse other = (DoGetMyWatchItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.watchItemsCounter == other.getWatchItemsCounter() &&
            ((this.watchItemsList==null && other.getWatchItemsList()==null) || 
             (this.watchItemsList!=null &&
              java.util.Arrays.equals(this.watchItemsList, other.getWatchItemsList())));
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
        _hashCode += getWatchItemsCounter();
        if (getWatchItemsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWatchItemsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWatchItemsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetMyWatchItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyWatchItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watchItemsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "watchItemsCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watchItemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "watchItemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "WatchItemStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
