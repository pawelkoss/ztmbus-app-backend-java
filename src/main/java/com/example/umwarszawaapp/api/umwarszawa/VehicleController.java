package com.example.umwarszawaapp.api.umwarszawa;

import com.example.umwarszawaapp.domain.Vehicle.VehicleFacade;
import com.example.umwarszawaapp.domain.Vehicle.VehicleListDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1")
@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
class VehicleController {

    private final VehicleFacade vehicleFacade;

    @GetMapping(path = "/{type}/{line}")
    @ResponseStatus(HttpStatus.CREATED)
    public VehicleListDTO getVehicleList(@PathVariable int type, @PathVariable String line){

        VehicleListDTO vehicleListDTO = vehicleFacade.getVehiclesByLine(type, line);
        return vehicleListDTO;
    }

}
