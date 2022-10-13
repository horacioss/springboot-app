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
@Table(name = "ProductDescription")
public class ProductDescription implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductDescriptionID", nullable = false)
    private Long productDescriptionID;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "rowguid", nullable = false)
    private String rowguid;

    @Column(name = "ModifiedDate", nullable = false)
    private Date modifiedDate;

}
