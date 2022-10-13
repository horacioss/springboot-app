package com.horacioss.cppmsaelectronic.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "CustomerAddress")
public class CustomerAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CustomerID", nullable = false)
    private Integer customerID;

    @Column(name = "AddressID", nullable = false)
    private Integer addressID;

    @Column(name = "AddressType", nullable = false)
    private String addressType;

    @Column(name = "rowguid", nullable = false)
    private String rowguid;

    @Column(name = "ModifiedDate", nullable = false)
    private Date modifiedDate;

}
