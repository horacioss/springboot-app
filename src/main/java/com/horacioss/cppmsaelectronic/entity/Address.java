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
@Table(name = "Address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "AddressID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressID;

    @Column(name = "AddressLine1", nullable = false)
    private String addressLine1;

    @Column(name = "AddressLine2")
    private String addressLine2;

    @Column(name = "City", nullable = false)
    private String city;

    @Column(name = "StateProvince", nullable = false)
    private String stateProvince;

    @Column(name = "CountryRegion", nullable = false)
    private String countryRegion;

    @Column(name = "PostalCode", nullable = false)
    private String postalCode;

    @Column(name = "rowguid", nullable = false)
    private String rowguid;

    @Column(name = "ModifiedDate", nullable = false)
    private Date modifiedDate;

}
