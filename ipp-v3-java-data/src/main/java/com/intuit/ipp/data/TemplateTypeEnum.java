//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.05 at 02:37:37 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemplateTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BuildAssembly"/>
 *     &lt;enumeration value="CreditMemo"/>
 *     &lt;enumeration value="Estimate"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="PurchaseOrder"/>
 *     &lt;enumeration value="SalesOrder"/>
 *     &lt;enumeration value="SalesReceipt"/>
 *     &lt;enumeration value="StatementCharge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemplateTypeEnum")
@XmlEnum
public enum TemplateTypeEnum {

    @XmlEnumValue("BuildAssembly")
    BUILD_ASSEMBLY("BuildAssembly"),
    @XmlEnumValue("CreditMemo")
    CREDIT_MEMO("CreditMemo"),
    @XmlEnumValue("Estimate")
    ESTIMATE("Estimate"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("PurchaseOrder")
    PURCHASE_ORDER("PurchaseOrder"),
    @XmlEnumValue("SalesOrder")
    SALES_ORDER("SalesOrder"),
    @XmlEnumValue("SalesReceipt")
    SALES_RECEIPT("SalesReceipt"),
    @XmlEnumValue("StatementCharge")
    STATEMENT_CHARGE("StatementCharge");
    private final String value;

    TemplateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemplateTypeEnum fromValue(String v) {
        for (TemplateTypeEnum c: TemplateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
