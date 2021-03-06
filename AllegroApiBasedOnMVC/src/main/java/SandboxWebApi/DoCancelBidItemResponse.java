/**
 * DoCancelBidItemResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoCancelBidItemResponse  implements java.io.Serializable {
    private int cancelBidValue;

    private int[] cancelledBids;

    private int[] notCancelledBids;

    public DoCancelBidItemResponse() {
    }

    public DoCancelBidItemResponse(
           int cancelBidValue,
           int[] cancelledBids,
           int[] notCancelledBids) {
           this.cancelBidValue = cancelBidValue;
           this.cancelledBids = cancelledBids;
           this.notCancelledBids = notCancelledBids;
    }


    /**
     * Gets the cancelBidValue value for this DoCancelBidItemResponse.
     * 
     * @return cancelBidValue
     */
    public int getCancelBidValue() {
        return cancelBidValue;
    }


    /**
     * Sets the cancelBidValue value for this DoCancelBidItemResponse.
     * 
     * @param cancelBidValue
     */
    public void setCancelBidValue(int cancelBidValue) {
        this.cancelBidValue = cancelBidValue;
    }


    /**
     * Gets the cancelledBids value for this DoCancelBidItemResponse.
     * 
     * @return cancelledBids
     */
    public int[] getCancelledBids() {
        return cancelledBids;
    }


    /**
     * Sets the cancelledBids value for this DoCancelBidItemResponse.
     * 
     * @param cancelledBids
     */
    public void setCancelledBids(int[] cancelledBids) {
        this.cancelledBids = cancelledBids;
    }


    /**
     * Gets the notCancelledBids value for this DoCancelBidItemResponse.
     * 
     * @return notCancelledBids
     */
    public int[] getNotCancelledBids() {
        return notCancelledBids;
    }


    /**
     * Sets the notCancelledBids value for this DoCancelBidItemResponse.
     * 
     * @param notCancelledBids
     */
    public void setNotCancelledBids(int[] notCancelledBids) {
        this.notCancelledBids = notCancelledBids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCancelBidItemResponse)) return false;
        DoCancelBidItemResponse other = (DoCancelBidItemResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cancelBidValue == other.getCancelBidValue() &&
            ((this.cancelledBids==null && other.getCancelledBids()==null) || 
             (this.cancelledBids!=null &&
              java.util.Arrays.equals(this.cancelledBids, other.getCancelledBids()))) &&
            ((this.notCancelledBids==null && other.getNotCancelledBids()==null) || 
             (this.notCancelledBids!=null &&
              java.util.Arrays.equals(this.notCancelledBids, other.getNotCancelledBids())));
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
        _hashCode += getCancelBidValue();
        if (getCancelledBids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCancelledBids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCancelledBids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotCancelledBids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotCancelledBids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotCancelledBids(), i);
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
        new org.apache.axis.description.TypeDesc(DoCancelBidItemResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doCancelBidItemResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelBidValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "cancelBidValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledBids");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "cancelledBids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notCancelledBids");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "notCancelledBids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
