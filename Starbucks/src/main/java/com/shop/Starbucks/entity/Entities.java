package com.shop.Starbucks.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@jakarta.persistence.Entity
@Table(name="coustmerdetails")
public class Entities {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Ordername;
    private Long number;
    private String coustmernumber;







    }


