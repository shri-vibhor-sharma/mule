
package com.Students;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.Students package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MyEMP_QNAME = new QName("http://www.example.org", "myEMP");
    private final static QName _EmployeesDepartmentId_QNAME = new QName("http://www.example.org", "departmentId");
    private final static QName _EmployeesFirstName_QNAME = new QName("http://www.example.org", "firstName");
    private final static QName _EmployeesPhoneNumber_QNAME = new QName("http://www.example.org", "phoneNumber");
    private final static QName _EmployeesSalary_QNAME = new QName("http://www.example.org", "salary");
    private final static QName _EmployeesCommissionPct_QNAME = new QName("http://www.example.org", "commissionPct");
    private final static QName _EmployeesManagerId_QNAME = new QName("http://www.example.org", "managerId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.Students
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Employees }
     * 
     */
    public Employees createEmployees() {
        return new Employees();
    }

    /**
     * Create an instance of {@link EmployeeRequest }
     * 
     */
    public EmployeeRequest createEmployeeRequest() {
        return new EmployeeRequest();
    }

    /**
     * Create an instance of {@link EmployeeResponse }
     * 
     */
    public EmployeeResponse createEmployeeResponse() {
        return new EmployeeResponse();
    }

    /**
     * Create an instance of {@link com.Students.EmployeesCollection }
     * 
     */
    public com.Students.EmployeesCollection createEmployeesCollection() {
        return new com.Students.EmployeesCollection();
    }

    /**
     * Create an instance of {@link Employees.EmployeesCollection }
     * 
     */
    public Employees.EmployeesCollection createEmployeesEmployeesCollection() {
        return new Employees.EmployeesCollection();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org", name = "myEMP")
    public JAXBElement<String> createMyEMP(String value) {
        return new JAXBElement<String>(_MyEMP_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org", name = "departmentId", scope = Employees.class)
    public JAXBElement<Integer> createEmployeesDepartmentId(Integer value) {
        return new JAXBElement<Integer>(_EmployeesDepartmentId_QNAME, Integer.class, Employees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org", name = "firstName", scope = Employees.class)
    public JAXBElement<String> createEmployeesFirstName(String value) {
        return new JAXBElement<String>(_EmployeesFirstName_QNAME, String.class, Employees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org", name = "phoneNumber", scope = Employees.class)
    public JAXBElement<String> createEmployeesPhoneNumber(String value) {
        return new JAXBElement<String>(_EmployeesPhoneNumber_QNAME, String.class, Employees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org", name = "salary", scope = Employees.class)
    public JAXBElement<BigDecimal> createEmployeesSalary(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeesSalary_QNAME, BigDecimal.class, Employees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org", name = "commissionPct", scope = Employees.class)
    public JAXBElement<BigDecimal> createEmployeesCommissionPct(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeesCommissionPct_QNAME, BigDecimal.class, Employees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org", name = "managerId", scope = Employees.class)
    public JAXBElement<String> createEmployeesManagerId(String value) {
        return new JAXBElement<String>(_EmployeesManagerId_QNAME, String.class, Employees.class, value);
    }

}
