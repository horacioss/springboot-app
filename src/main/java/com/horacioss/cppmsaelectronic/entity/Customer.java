package com.horacioss.cppmsaelectronic.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "Customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CustomerID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerID;

    @Column(name = "NameStyle", nullable = false)
    private Boolean nameStyle;

    @Column(name = "Title")
    private String title;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "MiddleName")
    private String middleName;

    @Column(name = "LastName", nullable = false)
    private String lastName;

    @Column(name = "Suffix")
    private String suffix;

    @Column(name = "CompanyName")
    private String companyName;

    @Column(name = "SalesPerson")
    private String salesPerson;

    @Column(name = "EmailAddress")
    private String emailAddress;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "PasswordHash", nullable = false)
    private String passwordHash;

    @Column(name = "PasswordSalt", nullable = false)
    private String passwordSalt;

    @Column(name = "rowguid", nullable = false)
    private String rowguid;

    @Column(name = "ModifiedDate", nullable = false)
    private Date modifiedDate;

}
