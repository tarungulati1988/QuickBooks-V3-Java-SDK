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
 * <p>Java class for AccountClassificationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountClassificationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Asset"/>
 *     &lt;enumeration value="Equity"/>
 *     &lt;enumeration value="Expense"/>
 *     &lt;enumeration value="Liability"/>
 *     &lt;enumeration value="Revenue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountClassificationEnum")
@XmlEnum
public enum AccountClassificationEnum {

    @XmlEnumValue("Asset")
    ASSET("Asset"),
    @XmlEnumValue("Equity")
    EQUITY("Equity"),
    @XmlEnumValue("Expense")
    EXPENSE("Expense"),
    @XmlEnumValue("Liability")
    LIABILITY("Liability"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue");
    private final String value;

    AccountClassificationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountClassificationEnum fromValue(String v) {
        for (AccountClassificationEnum c: AccountClassificationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
