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
@Table(name = "ProductCategory")
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductCategoryID", nullable = false)
    private Long productCategoryID;

    @Column(name = "ParentProductCategoryID")
    private Integer parentProductCategoryID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "rowguid", nullable = false)
    private String rowguid;

    @Column(name = "ModifiedDate", nullable = false)
    private Date modifiedDate;

}
