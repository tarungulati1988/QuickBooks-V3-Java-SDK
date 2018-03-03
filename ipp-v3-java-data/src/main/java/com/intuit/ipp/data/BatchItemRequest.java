//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.01 at 02:14:53 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * QueryResponse entity describing the response of query
 * 
 * <p>Java class for BatchItemRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchItemRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://schema.intuit.com/finance/v3}IntuitObject"/>
 *           &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="ReportQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="CDCQuery" type="{http://schema.intuit.com/finance/v3}CDCQuery" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="bId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operation" type="{http://schema.intuit.com/finance/v3}OperationEnum" />
 *       &lt;attribute name="optionsData" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchItemRequest", propOrder = {
    "intuitObject",
    "query",
    "reportQuery",
    "cdcQuery"
})
public class BatchItemRequest implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "IntuitObject", namespace = "http://schema.intuit.com/finance/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends IntuitEntity> intuitObject;
    @XmlElement(name = "Query")
    protected String query;
    @XmlElement(name = "ReportQuery")
    protected String reportQuery;
    @XmlElement(name = "CDCQuery")
    protected CDCQuery cdcQuery;
    @XmlAttribute(name = "bId")
    protected String bId;
    @XmlAttribute(name = "operation")
    protected OperationEnum operation;
    @XmlAttribute(name = "optionsData")
    protected String optionsData;

    /**
     * Gets the value of the intuitObject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Payment }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumberTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasterAccount }{@code >}
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Company }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReimburseCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link DateTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmailDeliveryInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link Preferences }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}
     *     {@link JAXBElement }{@code <}{@link SyncActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesRep }{@code >}
     *     {@link JAXBElement }{@code <}{@link Budget }{@code >}
     *     {@link JAXBElement }{@code <}{@link Department }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventorySite }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxReturn }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxAgency }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceLevel }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntuitEntity }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatementCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherName }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Attachable }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Estimate }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserAlert }{@code >}
     *     {@link JAXBElement }{@code <}{@link Employee }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link QbdtEntityIdMapping }{@code >}
     *     {@link JAXBElement }{@code <}{@link TDSMetadata }{@code >}
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyCurrency }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxService }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bill }{@code >}
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     {@link JAXBElement }{@code <}{@link Class }{@code >}
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     {@link JAXBElement }{@code <}{@link FixedAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link Purchase }{@code >}
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link Term }{@code >}
     *     
     */
    public JAXBElement<? extends IntuitEntity> getIntuitObject() {
        return intuitObject;
    }

    /**
     * Sets the value of the intuitObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Payment }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumberTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasterAccount }{@code >}
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Company }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReimburseCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link DateTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmailDeliveryInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link Preferences }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}
     *     {@link JAXBElement }{@code <}{@link SyncActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesRep }{@code >}
     *     {@link JAXBElement }{@code <}{@link Budget }{@code >}
     *     {@link JAXBElement }{@code <}{@link Department }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventorySite }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxReturn }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxAgency }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceLevel }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntuitEntity }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatementCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherName }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Attachable }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Estimate }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserAlert }{@code >}
     *     {@link JAXBElement }{@code <}{@link Employee }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link QbdtEntityIdMapping }{@code >}
     *     {@link JAXBElement }{@code <}{@link TDSMetadata }{@code >}
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyCurrency }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxService }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bill }{@code >}
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     {@link JAXBElement }{@code <}{@link Class }{@code >}
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     {@link JAXBElement }{@code <}{@link FixedAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link Purchase }{@code >}
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link Term }{@code >}
     *     
     */
    public void setIntuitObject(JAXBElement<? extends IntuitEntity> value) {
        this.intuitObject = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the reportQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportQuery() {
        return reportQuery;
    }

    /**
     * Sets the value of the reportQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportQuery(String value) {
        this.reportQuery = value;
    }

    /**
     * Gets the value of the cdcQuery property.
     * 
     * @return
     *     possible object is
     *     {@link CDCQuery }
     *     
     */
    public CDCQuery getCDCQuery() {
        return cdcQuery;
    }

    /**
     * Sets the value of the cdcQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDCQuery }
     *     
     */
    public void setCDCQuery(CDCQuery value) {
        this.cdcQuery = value;
    }

    /**
     * Gets the value of the bId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBId() {
        return bId;
    }

    /**
     * Sets the value of the bId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBId(String value) {
        this.bId = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationEnum }
     *     
     */
    public OperationEnum getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationEnum }
     *     
     */
    public void setOperation(OperationEnum value) {
        this.operation = value;
    }

    /**
     * Gets the value of the optionsData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionsData() {
        return optionsData;
    }

    /**
     * Sets the value of the optionsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionsData(String value) {
        this.optionsData = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BatchItemRequest that = ((BatchItemRequest) object);
        {
            JAXBElement<? extends IntuitEntity> lhsIntuitObject;
            lhsIntuitObject = this.getIntuitObject();
            JAXBElement<? extends IntuitEntity> rhsIntuitObject;
            rhsIntuitObject = that.getIntuitObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intuitObject", lhsIntuitObject), LocatorUtils.property(thatLocator, "intuitObject", rhsIntuitObject), lhsIntuitObject, rhsIntuitObject, (this.intuitObject!= null), (that.intuitObject!= null))) {
                return false;
            }
        }
        {
            String lhsQuery;
            lhsQuery = this.getQuery();
            String rhsQuery;
            rhsQuery = that.getQuery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "query", lhsQuery), LocatorUtils.property(thatLocator, "query", rhsQuery), lhsQuery, rhsQuery, (this.query!= null), (that.query!= null))) {
                return false;
            }
        }
        {
            String lhsReportQuery;
            lhsReportQuery = this.getReportQuery();
            String rhsReportQuery;
            rhsReportQuery = that.getReportQuery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportQuery", lhsReportQuery), LocatorUtils.property(thatLocator, "reportQuery", rhsReportQuery), lhsReportQuery, rhsReportQuery, (this.reportQuery!= null), (that.reportQuery!= null))) {
                return false;
            }
        }
        {
            CDCQuery lhsCDCQuery;
            lhsCDCQuery = this.getCDCQuery();
            CDCQuery rhsCDCQuery;
            rhsCDCQuery = that.getCDCQuery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdcQuery", lhsCDCQuery), LocatorUtils.property(thatLocator, "cdcQuery", rhsCDCQuery), lhsCDCQuery, rhsCDCQuery, (this.cdcQuery!= null), (that.cdcQuery!= null))) {
                return false;
            }
        }
        {
            String lhsBId;
            lhsBId = this.getBId();
            String rhsBId;
            rhsBId = that.getBId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bId", lhsBId), LocatorUtils.property(thatLocator, "bId", rhsBId), lhsBId, rhsBId, (this.bId!= null), (that.bId!= null))) {
                return false;
            }
        }
        {
            OperationEnum lhsOperation;
            lhsOperation = this.getOperation();
            OperationEnum rhsOperation;
            rhsOperation = that.getOperation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operation", lhsOperation), LocatorUtils.property(thatLocator, "operation", rhsOperation), lhsOperation, rhsOperation, (this.operation!= null), (that.operation!= null))) {
                return false;
            }
        }
        {
            String lhsOptionsData;
            lhsOptionsData = this.getOptionsData();
            String rhsOptionsData;
            rhsOptionsData = that.getOptionsData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optionsData", lhsOptionsData), LocatorUtils.property(thatLocator, "optionsData", rhsOptionsData), lhsOptionsData, rhsOptionsData, (this.optionsData!= null), (that.optionsData!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            JAXBElement<? extends IntuitEntity> theIntuitObject;
            theIntuitObject = this.getIntuitObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intuitObject", theIntuitObject), currentHashCode, theIntuitObject, (this.intuitObject!= null));
        }
        {
            String theQuery;
            theQuery = this.getQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "query", theQuery), currentHashCode, theQuery, (this.query!= null));
        }
        {
            String theReportQuery;
            theReportQuery = this.getReportQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportQuery", theReportQuery), currentHashCode, theReportQuery, (this.reportQuery!= null));
        }
        {
            CDCQuery theCDCQuery;
            theCDCQuery = this.getCDCQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdcQuery", theCDCQuery), currentHashCode, theCDCQuery, (this.cdcQuery!= null));
        }
        {
            String theBId;
            theBId = this.getBId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bId", theBId), currentHashCode, theBId, (this.bId!= null));
        }
        {
            OperationEnum theOperation;
            theOperation = this.getOperation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operation", theOperation), currentHashCode, theOperation, (this.operation!= null));
        }
        {
            String theOptionsData;
            theOptionsData = this.getOptionsData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optionsData", theOptionsData), currentHashCode, theOptionsData, (this.optionsData!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
