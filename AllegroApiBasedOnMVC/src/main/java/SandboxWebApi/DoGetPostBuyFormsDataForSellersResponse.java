/**
 * DoGetPostBuyFormsDataForSellersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoGetPostBuyFormsDataForSellersResponse  implements java.io.Serializable {
    private SandboxWebApi.PostBuyFormDataStruct[] postBuyFormData;

    public DoGetPostBuyFormsDataForSellersResponse() {
    }

    public DoGetPostBuyFormsDataForSellersResponse(
           SandboxWebApi.PostBuyFormDataStruct[] postBuyFormData) {
           this.postBuyFormData = postBuyFormData;
    }


    /**
     * Gets the postBuyFormData value for this DoGetPostBuyFormsDataForSellersResponse.
     * 
     * @return postBuyFormData
     */
    public SandboxWebApi.PostBuyFormDataStruct[] getPostBuyFormData() {
        return postBuyFormData;
    }


    /**
     * Sets the postBuyFormData value for this DoGetPostBuyFormsDataForSellersResponse.
     * 
     * @param postBuyFormData
     */
    public void setPostBuyFormData(SandboxWebApi.PostBuyFormDataStruct[] postBuyFormData) {
        this.postBuyFormData = postBuyFormData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetPostBuyFormsDataForSellersResponse)) return false;
        DoGetPostBuyFormsDataForSellersResponse other = (DoGetPostBuyFormsDataForSellersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postBuyFormData==null && other.getPostBuyFormData()==null) || 
             (this.postBuyFormData!=null &&
              java.util.Arrays.equals(this.postBuyFormData, other.getPostBuyFormData())));
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
        if (getPostBuyFormData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostBuyFormData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostBuyFormData(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetPostBuyFormsDataForSellersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetPostBuyFormsDataForSellersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "postBuyFormData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "PostBuyFormDataStruct"));
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
