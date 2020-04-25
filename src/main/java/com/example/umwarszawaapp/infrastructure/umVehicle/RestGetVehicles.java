package com.example.umwarszawaapp.infrastructure.umVehicle;

import com.example.umwarszawaapp.domain.Vehicle.VehicleListDTO;
import com.example.umwarszawaapp.domain.Vehicle.VehicleRetrieval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
class RestGetVehicles implements VehicleRetrieval {

    private final RestTemplate restTemplate;
    private final String apikey;

    @Autowired
    public RestGetVehicles(RestTemplate restTemplate, @Value("${umwarszawa.apikey}") String apikey) {
        this.restTemplate = restTemplate;
        this.apikey = apikey;
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
