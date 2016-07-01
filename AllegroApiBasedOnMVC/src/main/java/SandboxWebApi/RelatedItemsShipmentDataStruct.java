/**
 * RelatedItemsShipmentDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class RelatedItemsShipmentDataStruct  implements java.io.Serializable {
    private SandboxWebApi.SellerShipmentDataStruct[] sellerShipmentData;

    public RelatedItemsShipmentDataStruct() {
    }

    public RelatedItemsShipmentDataStruct(
           SandboxWebApi.SellerShipmentDataStruct[] sellerShipmentData) {
           this.sellerShipmentData = sellerShipmentData;
    }


    /**
     * Gets the sellerShipmentData value for this RelatedItemsShipmentDataStruct.
     * 
     * @return sellerShipmentData
     */
    public SandboxWebApi.SellerShipmentDataStruct[] getSellerShipmentData() {
        return sellerShipmentData;
    }


    /**
     * Sets the sellerShipmentData value for this RelatedItemsShipmentDataStruct.
     * 
     * @param sellerShipmentData
     */
    public void setSellerShipmentData(SandboxWebApi.SellerShipmentDataStruct[] sellerShipmentData) {
        this.sellerShipmentData = sellerShipmentData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedItemsShipmentDataStruct)) return false;
        RelatedItemsShipmentDataStruct other = (RelatedItemsShipmentDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellerShipmentData==null && other.getSellerShipmentData()==null) || 
             (this.sellerShipmentData!=null &&
              java.util.Arrays.equals(this.sellerShipmentData, other.getSellerShipmentData())));
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
        if (getSellerShipmentData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellerShipmentData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellerShipmentData(), i);
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
        new org.apache.axis.description.TypeDesc(RelatedItemsShipmentDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "RelatedItemsShipmentDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerShipmentData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sellerShipmentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "SellerShipmentDataStruct"));
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
