//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.01 at 02:14:53 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillableStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillableStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Billable"/>
 *     &lt;enumeration value="NotBillable"/>
 *     &lt;enumeration value="HasBeenBilled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillableStatusEnum")
@XmlEnum
public enum BillableStatusEnum {

    @XmlEnumValue("Billable")
    BILLABLE("Billable"),
    @XmlEnumValue("NotBillable")
    NOT_BILLABLE("NotBillable"),
    @XmlEnumValue("HasBeenBilled")
    HAS_BEEN_BILLED("HasBeenBilled");
    private final String value;

    BillableStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillableStatusEnum fromValue(String v) {
        for (BillableStatusEnum c: BillableStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
