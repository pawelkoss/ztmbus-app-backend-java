package com.example.umwarszawaapp.infrastructure.umVehicle;

import com.example.umwarszawaapp.domain.Vehicle.VehicleListDTO;
import com.example.umwarszawaapp.domain.Vehicle.VehicleRetrieval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
class RestGetVehicles implements VehicleRetrieval {

    private final RestTemplate restTemplate;
    private final String apikey = "46657b26-69bc-489e-8985-e7e2c0422f72";

    @Autowired
    public RestGetVehicles(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public VehicleListDTO getVehiclesByLine(int type, String line) {


        ResponseEntity<VehicleListDTO> exchange = restTemplate.exchange(
                "https://api.um.warszawa.pl/api/action/busestrams_get/?resource_id=f2e5503e927d-4ad3-9500-4ab9e55deb59&apikey=" + apikey + "&type=" + type + "&line=" + line,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                VehicleListDTO.class);
        return exchange.getBody();


        //vehicleList.getResult().stream().forEach(System.out::println);
        //System.out.println(vehicleList.size());
    }
}
