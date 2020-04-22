package com.example.umwarszawaapp.domain.Vehicle;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleFacade {

    private final VehicleRetrieval vehicleRetrieval;

    public VehicleListDTO getVehiclesByLine(int type, String line) {
        return vehicleRetrieval.getVehiclesByLine(type, line);
    }


}
