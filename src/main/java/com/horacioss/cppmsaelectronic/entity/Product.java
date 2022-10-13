package com.horacioss.cppmsaelectronic.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Product", schema = "SalesLT")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "productID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long productID;

    @Column(name = "name", nullable = false)
    @Getter
    @Setter
    private String name;

    @Column(name = "productnumber", nullable = false)
    @Getter
    @Setter
    private String productNumber;

    @Column(name = "color")
    @Getter
    @Setter
    private String color;

    @Column(name = "standardcost", nullable = false)
    @Getter
    @Setter
    private BigDecimal standardCost;

    @Column(name = "listprice", nullable = false)
    @Getter
    @Setter
    private BigDecimal listPrice;

    @Column(name = "size")
    @Getter
    @Setter
    private String size;

    @Column(name = "weight")
    @Getter
    @Setter
    private BigDecimal weight;

    @Column(name = "productcategoryID")
    @Getter
    @Setter
    private Integer productCategoryID;

    @Column(name = "productmodelID")
    @Getter
    @Setter
    private Integer productModelID;

    @Column(name = "sellstartdate", nullable = false)
    @Getter
    @Setter
    private Date sellStartDate;

    @Column(name = "sellenddate")
    @Getter
    @Setter
    private Date sellEndDate;

    @Column(name = "discontinueddate")
    @Getter
    @Setter
    private Date discontinuedDate;

    @Column(name = "rowguid", nullable = false)
    @Getter
    @Setter
    private String rowguid;

    @Column(name = "modifieddate", nullable = false)
    @Getter
    private Date modifiedDate;

}
