package com.example.umwarszawaapp.infrastructure.umBusStop;

import com.example.umwarszawaapp.domain.BusStop.BusStopResultDTO;
import com.example.umwarszawaapp.domain.BusStop.BusStopRetrieval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
class RestGetBusStopRepo implements BusStopRetrieval {

    private final RestTemplate restTemplate;
    private final String apikey = "46657b26-69bc-489e-8985-e7e2c0422f72";

    @Autowired
    public RestGetBusStopRepo(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public BusStopResultDTO getBusStopByName(String name) {
        String url = "https://api.um.warszawa.pl/api/action/dbtimetable_get/?id=b27f4c17-5c50-4a5b-89dd-236b282bc499&apikey=" + apikey + "&name=" + name;

        ResponseEntity<BusStopResultDTO> exchange = restTemplate.exchange(
                url,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                BusStopResultDTO.class);
        return exchange.getBody();

    }

    @Override
    public BusStopResultDTO getBusStopAll() {
        String url = "https://api.um.warszawa.pl/api/action/dbstore_get/?id=ab75c33d-3a26-4342-b36a-6e5fef0a3ac3&sortBy=id&apikey=" + apikey;
        ResponseEntity<BusStopResultDTO> exchange = restTemplate.exchange(
                url,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                BusStopResultDTO.class);
        return exchange.getBody();

    }


}
