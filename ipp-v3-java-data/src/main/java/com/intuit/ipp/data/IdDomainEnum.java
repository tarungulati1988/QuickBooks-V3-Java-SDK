//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.05 at 02:37:37 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for idDomainEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="idDomainEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="NG"/>
 *     &lt;enumeration value="PMT"/>
 *     &lt;enumeration value="QB"/>
 *     &lt;enumeration value="QBO"/>
 *     &lt;enumeration value="QBSDK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "idDomainEnum")
@XmlEnum
public enum IdDomainEnum {

    BM,
    NG,
    PMT,
    QB,
    QBO,
    QBSDK;

    public String value() {
        return name();
    }

    public static IdDomainEnum fromValue(String v) {
        return valueOf(v);
    }

}
