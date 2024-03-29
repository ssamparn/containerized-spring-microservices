package com.containerize.web.appliance.entity;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name="HOUSEHOLD_APPLIANCES")
public class ApplianceEntity {

    @Id
    @Column(name = "SERIAL_NUMBER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serialnumber;

    @Column(name="BRAND_NAME")
    private String brand;

    @Column(name="MODEL_NAME")
    private String model;

    @Column(name="STATUS_NAME")
    private String status;

    @Column(name="DATE")
    private LocalDate date;

}
