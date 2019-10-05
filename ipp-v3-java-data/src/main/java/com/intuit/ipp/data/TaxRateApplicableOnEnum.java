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
 * <p>Java class for TaxRateApplicableOnEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxRateApplicableOnEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sales"/>
 *     &lt;enumeration value="Purchase"/>
 *     &lt;enumeration value="Adjustment"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxRateApplicableOnEnum")
@XmlEnum
public enum TaxRateApplicableOnEnum {

    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TaxRateApplicableOnEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxRateApplicableOnEnum fromValue(String v) {
        for (TaxRateApplicableOnEnum c: TaxRateApplicableOnEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
