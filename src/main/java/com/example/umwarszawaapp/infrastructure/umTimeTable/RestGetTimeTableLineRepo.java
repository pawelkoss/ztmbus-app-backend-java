package com.example.umwarszawaapp.infrastructure.umTimeTable;

import com.example.umwarszawaapp.domain.TimeTable.TimeTableResultDTO;
import com.example.umwarszawaapp.domain.TimeTable.TimeTableRetrieval;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
class RestGetTimeTableLineRepo implements TimeTableRetrieval {
    private final RestTemplate restTemplate;
    private final String apikey;

    RestGetTimeTableLineRepo(RestTemplate restTemplate, @Value("${umwarszawa.apikey}") String apikey) {
        this.restTemplate = restTemplate;
        this.apikey = apikey;
    }


    @Override
    public TimeTableResultDTO getTimeTableLines(String setof, String pistill) {
        return null;
    }
}
