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
 * <p>Java class for MonthEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonthEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="January"/>
 *     &lt;enumeration value="February"/>
 *     &lt;enumeration value="March"/>
 *     &lt;enumeration value="April"/>
 *     &lt;enumeration value="May"/>
 *     &lt;enumeration value="June"/>
 *     &lt;enumeration value="July"/>
 *     &lt;enumeration value="August"/>
 *     &lt;enumeration value="September"/>
 *     &lt;enumeration value="October"/>
 *     &lt;enumeration value="November"/>
 *     &lt;enumeration value="December"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonthEnum")
@XmlEnum
public enum MonthEnum {

    @XmlEnumValue("January")
    JANUARY("January"),
    @XmlEnumValue("February")
    FEBRUARY("February"),
    @XmlEnumValue("March")
    MARCH("March"),
    @XmlEnumValue("April")
    APRIL("April"),
    @XmlEnumValue("May")
    MAY("May"),
    @XmlEnumValue("June")
    JUNE("June"),
    @XmlEnumValue("July")
    JULY("July"),
    @XmlEnumValue("August")
    AUGUST("August"),
    @XmlEnumValue("September")
    SEPTEMBER("September"),
    @XmlEnumValue("October")
    OCTOBER("October"),
    @XmlEnumValue("November")
    NOVEMBER("November"),
    @XmlEnumValue("December")
    DECEMBER("December");
    private final String value;

    MonthEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthEnum fromValue(String v) {
        for (MonthEnum c: MonthEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
