/**
 * DoGetPaymentDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoGetPaymentDataResponse  implements java.io.Serializable {
    private SandboxWebApi.BillingDataType[] paymentList;

    public DoGetPaymentDataResponse() {
    }

    public DoGetPaymentDataResponse(
           SandboxWebApi.BillingDataType[] paymentList) {
           this.paymentList = paymentList;
    }


    /**
     * Gets the paymentList value for this DoGetPaymentDataResponse.
     * 
     * @return paymentList
     */
    public SandboxWebApi.BillingDataType[] getPaymentList() {
        return paymentList;
    }


    /**
     * Sets the paymentList value for this DoGetPaymentDataResponse.
     * 
     * @param paymentList
     */
    public void setPaymentList(SandboxWebApi.BillingDataType[] paymentList) {
        this.paymentList = paymentList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetPaymentDataResponse)) return false;
        DoGetPaymentDataResponse other = (DoGetPaymentDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentList==null && other.getPaymentList()==null) || 
             (this.paymentList!=null &&
              java.util.Arrays.equals(this.paymentList, other.getPaymentList())));
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
        if (getPaymentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentList(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetPaymentDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPaymentDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "paymentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "BillingDataType"));
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
