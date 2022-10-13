package com.horacioss.cppmsaelectronic.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "faketable", schema = "dbo")
public class FakeEntity implements Serializable {

    @Id
    @Column(name = "FakeID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long fakeId;

    @Column(name = "name", nullable = false)
    @Getter
    @Setter
    private String name;

    @Column(name = "discontinueddate")
    @Getter
    @Setter
    private Date discontinuedDate;

    @Column(name = "listprice", nullable = false)
    @Getter
    @Setter
    private BigDecimal listPrice;

}
