/**
 * DoMyAccountItemsCountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoMyAccountItemsCountRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private java.lang.String accountType;

    private long[] itemsArray;

    public DoMyAccountItemsCountRequest() {
    }

    public DoMyAccountItemsCountRequest(
           java.lang.String sessionHandle,
           java.lang.String accountType,
           long[] itemsArray) {
           this.sessionHandle = sessionHandle;
           this.accountType = accountType;
           this.itemsArray = itemsArray;
    }


    /**
     * Gets the sessionHandle value for this DoMyAccountItemsCountRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoMyAccountItemsCountRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the accountType value for this DoMyAccountItemsCountRequest.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this DoMyAccountItemsCountRequest.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the itemsArray value for this DoMyAccountItemsCountRequest.
     * 
     * @return itemsArray
     */
    public long[] getItemsArray() {
        return itemsArray;
    }


    /**
     * Sets the itemsArray value for this DoMyAccountItemsCountRequest.
     * 
     * @param itemsArray
     */
    public void setItemsArray(long[] itemsArray) {
        this.itemsArray = itemsArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoMyAccountItemsCountRequest)) return false;
        DoMyAccountItemsCountRequest other = (DoMyAccountItemsCountRequest) obj;
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
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.itemsArray==null && other.getItemsArray()==null) || 
             (this.itemsArray!=null &&
              java.util.Arrays.equals(this.itemsArray, other.getItemsArray())));
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getItemsArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemsArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsArray(), i);
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
        new org.apache.axis.description.TypeDesc(DoMyAccountItemsCountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoMyAccountItemsCountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "itemsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
