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
@Table(name = "ProductModelProductDescription")
public class ProductModelProductDescription implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ProductModelID", nullable = false)
    private Integer productModelID;

    @Column(name = "ProductDescriptionID", nullable = false)
    private Integer productDescriptionID;

    @Column(name = "Culture", nullable = false)
    private String culture;

    @Column(name = "rowguid", nullable = false)
    private String rowguid;

    @Column(name = "ModifiedDate", nullable = false)
    private Date modifiedDate;

}
