/**
 * DoGetMyWatchedItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoGetMyWatchedItemsResponse  implements java.io.Serializable {
    private int watchedItemsCounter;

    private SandboxWebApi.WatchedItemStruct[] watchedItemsList;

    public DoGetMyWatchedItemsResponse() {
    }

    public DoGetMyWatchedItemsResponse(
           int watchedItemsCounter,
           SandboxWebApi.WatchedItemStruct[] watchedItemsList) {
           this.watchedItemsCounter = watchedItemsCounter;
           this.watchedItemsList = watchedItemsList;
    }


    /**
     * Gets the watchedItemsCounter value for this DoGetMyWatchedItemsResponse.
     * 
     * @return watchedItemsCounter
     */
    public int getWatchedItemsCounter() {
        return watchedItemsCounter;
    }


    /**
     * Sets the watchedItemsCounter value for this DoGetMyWatchedItemsResponse.
     * 
     * @param watchedItemsCounter
     */
    public void setWatchedItemsCounter(int watchedItemsCounter) {
        this.watchedItemsCounter = watchedItemsCounter;
    }


    /**
     * Gets the watchedItemsList value for this DoGetMyWatchedItemsResponse.
     * 
     * @return watchedItemsList
     */
    public SandboxWebApi.WatchedItemStruct[] getWatchedItemsList() {
        return watchedItemsList;
    }


    /**
     * Sets the watchedItemsList value for this DoGetMyWatchedItemsResponse.
     * 
     * @param watchedItemsList
     */
    public void setWatchedItemsList(SandboxWebApi.WatchedItemStruct[] watchedItemsList) {
        this.watchedItemsList = watchedItemsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyWatchedItemsResponse)) return false;
        DoGetMyWatchedItemsResponse other = (DoGetMyWatchedItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.watchedItemsCounter == other.getWatchedItemsCounter() &&
            ((this.watchedItemsList==null && other.getWatchedItemsList()==null) || 
             (this.watchedItemsList!=null &&
              java.util.Arrays.equals(this.watchedItemsList, other.getWatchedItemsList())));
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
        _hashCode += getWatchedItemsCounter();
        if (getWatchedItemsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWatchedItemsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWatchedItemsList(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetMyWatchedItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetMyWatchedItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watchedItemsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "watchedItemsCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watchedItemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "watchedItemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "WatchedItemStruct"));
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
