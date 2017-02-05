
package com.Students;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Employees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employees">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="commissionPct" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="managerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeesCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Employees" type="{http://www.example.org}Employees" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employees", propOrder = {
    "employeeId",
    "firstName",
    "lastName",
    "email",
    "phoneNumber",
    "hireDate",
    "jobId",
    "salary",
    "commissionPct",
    "departmentId",
    "managerId",
    "employeesCollection"
})
public class Employees {

    protected int employeeId;
    @XmlElementRef(name = "firstName", namespace = "http://www.example.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    protected String lastName;
    protected String email;
    @XmlElementRef(name = "phoneNumber", namespace = "http://www.example.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hireDate;
    protected String jobId;
    @XmlElementRef(name = "salary", namespace = "http://www.example.org", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> salary;
    @XmlElementRef(name = "commissionPct", namespace = "http://www.example.org", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> commissionPct;
    @XmlElementRef(name = "departmentId", namespace = "http://www.example.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> departmentId;
    @XmlElementRef(name = "managerId", namespace = "http://www.example.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> managerId;
    protected Employees.EmployeesCollection employeesCollection;

    /**
     * Gets the value of the employeeId property.
     * 
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     */
    public void setEmployeeId(int value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHireDate(XMLGregorianCalendar value) {
        this.hireDate = value;
    }

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalary(JAXBElement<BigDecimal> value) {
        this.salary = value;
    }

    /**
     * Gets the value of the commissionPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCommissionPct() {
        return commissionPct;
    }

    /**
     * Sets the value of the commissionPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCommissionPct(JAXBElement<BigDecimal> value) {
        this.commissionPct = value;
    }

    /**
     * Gets the value of the departmentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the value of the departmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDepartmentId(JAXBElement<Integer> value) {
        this.departmentId = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManagerId(JAXBElement<String> value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the employeesCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Employees.EmployeesCollection }
     *     
     */
    public Employees.EmployeesCollection getEmployeesCollection() {
        return employeesCollection;
    }

    /**
     * Sets the value of the employeesCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employees.EmployeesCollection }
     *     
     */
    public void setEmployeesCollection(Employees.EmployeesCollection value) {
        this.employeesCollection = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Employees" type="{http://www.example.org}Employees" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employees"
    })
    public static class EmployeesCollection {

        @XmlElement(name = "Employees")
        protected List<Employees> employees;

        /**
         * Gets the value of the employees property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employees property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployees().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Employees }
         * 
         * 
         */
        public List<Employees> getEmployees() {
            if (employees == null) {
                employees = new ArrayList<Employees>();
            }
            return this.employees;
        }

        /**
         * Sets the value of the employees property.
         * 
         * @param employees
         *     allowed object is
         *     {@link Employees }
         *     
         */
        public void setEmployees(List<Employees> employees) {
            this.employees = employees;
        }

    }

}
