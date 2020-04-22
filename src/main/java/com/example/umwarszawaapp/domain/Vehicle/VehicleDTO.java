package com.example.umwarszawaapp.domain.Vehicle;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class VehicleDTO {

    @JsonProperty("Lines")
    private String lines;
    @JsonProperty("Lon")
    private double lon;
    @JsonProperty("VehicleNumber")
    private String vehicleNumber;
    @JsonProperty("Time")
    private String time;
    @JsonProperty("Lat")
    private double lat;
    @JsonProperty("Brigade")
    private String brigade;

    public VehicleDTO() {
    }

    public VehicleDTO(String lines, Double lon, String vehicleNumber, String time, Double lat, String brigade) {
        this.lines = lines;
        this.lon = lon;
        this.vehicleNumber = vehicleNumber;
        this.time = time;
        this.lat = lat;
        this.brigade = brigade;
    }


    @Override
    public String toString() {
        return "VehicleDTO{" +
                "lines='" + lines + '\'' +
                ", lon=" + lon +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", lat=" + lat +
                '}';
    }
}
