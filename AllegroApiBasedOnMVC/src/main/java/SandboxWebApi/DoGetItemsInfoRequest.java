/**
 * DoGetItemsInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoGetItemsInfoRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long[] itemsIdArray;

    private java.lang.Integer getDesc;

    private java.lang.Integer getImageUrl;

    private java.lang.Integer getAttribs;

    private java.lang.Integer getPostageOptions;

    private java.lang.Integer getCompanyInfo;

    private java.lang.Integer getProductInfo;

    public DoGetItemsInfoRequest() {
    }

    public DoGetItemsInfoRequest(
           java.lang.String sessionHandle,
           long[] itemsIdArray,
           java.lang.Integer getDesc,
           java.lang.Integer getImageUrl,
           java.lang.Integer getAttribs,
           java.lang.Integer getPostageOptions,
           java.lang.Integer getCompanyInfo,
           java.lang.Integer getProductInfo) {
           this.sessionHandle = sessionHandle;
           this.itemsIdArray = itemsIdArray;
           this.getDesc = getDesc;
           this.getImageUrl = getImageUrl;
           this.getAttribs = getAttribs;
           this.getPostageOptions = getPostageOptions;
           this.getCompanyInfo = getCompanyInfo;
           this.getProductInfo = getProductInfo;
    }


    /**
     * Gets the sessionHandle value for this DoGetItemsInfoRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetItemsInfoRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the itemsIdArray value for this DoGetItemsInfoRequest.
     * 
     * @return itemsIdArray
     */
    public long[] getItemsIdArray() {
        return itemsIdArray;
    }


    /**
     * Sets the itemsIdArray value for this DoGetItemsInfoRequest.
     * 
     * @param itemsIdArray
     */
    public void setItemsIdArray(long[] itemsIdArray) {
        this.itemsIdArray = itemsIdArray;
    }


    /**
     * Gets the getDesc value for this DoGetItemsInfoRequest.
     * 
     * @return getDesc
     */
    public java.lang.Integer getGetDesc() {
        return getDesc;
    }


    /**
     * Sets the getDesc value for this DoGetItemsInfoRequest.
     * 
     * @param getDesc
     */
    public void setGetDesc(java.lang.Integer getDesc) {
        this.getDesc = getDesc;
    }


    /**
     * Gets the getImageUrl value for this DoGetItemsInfoRequest.
     * 
     * @return getImageUrl
     */
    public java.lang.Integer getGetImageUrl() {
        return getImageUrl;
    }


    /**
     * Sets the getImageUrl value for this DoGetItemsInfoRequest.
     * 
     * @param getImageUrl
     */
    public void setGetImageUrl(java.lang.Integer getImageUrl) {
        this.getImageUrl = getImageUrl;
    }


    /**
     * Gets the getAttribs value for this DoGetItemsInfoRequest.
     * 
     * @return getAttribs
     */
    public java.lang.Integer getGetAttribs() {
        return getAttribs;
    }


    /**
     * Sets the getAttribs value for this DoGetItemsInfoRequest.
     * 
     * @param getAttribs
     */
    public void setGetAttribs(java.lang.Integer getAttribs) {
        this.getAttribs = getAttribs;
    }


    /**
     * Gets the getPostageOptions value for this DoGetItemsInfoRequest.
     * 
     * @return getPostageOptions
     */
    public java.lang.Integer getGetPostageOptions() {
        return getPostageOptions;
    }


    /**
     * Sets the getPostageOptions value for this DoGetItemsInfoRequest.
     * 
     * @param getPostageOptions
     */
    public void setGetPostageOptions(java.lang.Integer getPostageOptions) {
        this.getPostageOptions = getPostageOptions;
    }


    /**
     * Gets the getCompanyInfo value for this DoGetItemsInfoRequest.
     * 
     * @return getCompanyInfo
     */
    public java.lang.Integer getGetCompanyInfo() {
        return getCompanyInfo;
    }


    /**
     * Sets the getCompanyInfo value for this DoGetItemsInfoRequest.
     * 
     * @param getCompanyInfo
     */
    public void setGetCompanyInfo(java.lang.Integer getCompanyInfo) {
        this.getCompanyInfo = getCompanyInfo;
    }


    /**
     * Gets the getProductInfo value for this DoGetItemsInfoRequest.
     * 
     * @return getProductInfo
     */
    public java.lang.Integer getGetProductInfo() {
        return getProductInfo;
    }


    /**
     * Sets the getProductInfo value for this DoGetItemsInfoRequest.
     * 
     * @param getProductInfo
     */
    public void setGetProductInfo(java.lang.Integer getProductInfo) {
        this.getProductInfo = getProductInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetItemsInfoRequest)) return false;
        DoGetItemsInfoRequest other = (DoGetItemsInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            ((this.itemsIdArray==null && other.getItemsIdArray()==null) || 
             (this.itemsIdArray!=null &&
              java.util.Arrays.equals(this.itemsIdArray, other.getItemsIdArray()))) &&
            ((this.getDesc==null && other.getGetDesc()==null) || 
             (this.getDesc!=null &&
              this.getDesc.equals(other.getGetDesc()))) &&
            ((this.getImageUrl==null && other.getGetImageUrl()==null) || 
             (this.getImageUrl!=null &&
              this.getImageUrl.equals(other.getGetImageUrl()))) &&
            ((this.getAttribs==null && other.getGetAttribs()==null) || 
             (this.getAttribs!=null &&
              this.getAttribs.equals(other.getGetAttribs()))) &&
            ((this.getPostageOptions==null && other.getGetPostageOptions()==null) || 
             (this.getPostageOptions!=null &&
              this.getPostageOptions.equals(other.getGetPostageOptions()))) &&
            ((this.getCompanyInfo==null && other.getGetCompanyInfo()==null) || 
             (this.getCompanyInfo!=null &&
              this.getCompanyInfo.equals(other.getGetCompanyInfo()))) &&
            ((this.getProductInfo==null && other.getGetProductInfo()==null) || 
             (this.getProductInfo!=null &&
              this.getProductInfo.equals(other.getGetProductInfo())));
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
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        if (getItemsIdArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemsIdArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsIdArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGetDesc() != null) {
            _hashCode += getGetDesc().hashCode();
        }
        if (getGetImageUrl() != null) {
            _hashCode += getGetImageUrl().hashCode();
        }
        if (getGetAttribs() != null) {
            _hashCode += getGetAttribs().hashCode();
        }
        if (getGetPostageOptions() != null) {
            _hashCode += getGetPostageOptions().hashCode();
        }
        if (getGetCompanyInfo() != null) {
            _hashCode += getGetCompanyInfo().hashCode();
        }
        if (getGetProductInfo() != null) {
            _hashCode += getGetProductInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetItemsInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoGetItemsInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsIdArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemsIdArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "getDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "getImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAttribs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "getAttribs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPostageOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "getPostageOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCompanyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "getCompanyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "getProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
