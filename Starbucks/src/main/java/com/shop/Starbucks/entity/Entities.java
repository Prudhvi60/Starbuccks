package com.shop.Starbucks.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@jakarta.persistence.Entity
@Table(name="coustmerdetails")
public class Entities {

    @jakarta.persistence.Id
    private Long Id;
    private String Ordername;
    private Double number;
    private String coustmernumber;







    }


