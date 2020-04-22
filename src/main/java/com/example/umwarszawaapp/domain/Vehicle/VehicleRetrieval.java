package com.example.umwarszawaapp.domain.Vehicle;

public interface VehicleRetrieval {

    VehicleListDTO getVehiclesByLine(int type, String line);
}
