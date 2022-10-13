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
@Table(name = "ProductModel")
public class ProductModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ProductModelID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productModelID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "rowguid", nullable = false)
    private String rowguid;

    @Column(name = "ModifiedDate", nullable = false)
    private Date modifiedDate;

    @Column(name = "CatalogDescription")
    private String catalogDescription;

}
