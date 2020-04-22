package com.example.umwarszawaapp.domain.Vehicle;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@Setter
class Vehicle {

    private String lines;
    private int type;
    private Double lon;
    private Double lat;
    private String vehicleNumber;
    private LocalDateTime time;
    private int brigade;

}
