package com.example.umwarszawaapp.infrastructure.umTimeTable;

import com.example.umwarszawaapp.domain.TimeTable.TimeTableLineResultDTO;
import com.example.umwarszawaapp.domain.TimeTable.TimeTableResultDTO;
import com.example.umwarszawaapp.domain.TimeTable.TimeTableRetrieval;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
class RestGetTimeTableRepo implements TimeTableRetrieval {
    private final RestTemplate restTemplate;
    private final String apikey;

    RestGetTimeTableRepo(RestTemplate restTemplate, @Value("${umwarszawa.apikey}") String apikey) {
        this.restTemplate = restTemplate;
        this.apikey = apikey;
    }

    //https://api.um.warszawa.pl/api/action/dbtimetable_get/?id=88cd555f-6f31-43ca-9de4-66c479ad5942&busstopId=3027&busstopNr=03&apikey=46657b26-69bc-489e-8985-e7e2c0422f72
    @Override
    public TimeTableLineResultDTO getTimeTableLines(String setof, String pistill) {
        ResponseEntity<TimeTableLineResultDTO> exchange = restTemplate.exchange(
                "https://api.um.warszawa.pl/api/action/dbtimetable_get/?id=88cd555f-6f31-43ca-9de4-66c479ad5942&apikey=" + apikey + "&busstopId=" + setof + "&busstopNr=" + pistill,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                TimeTableLineResultDTO.class);
        return exchange.getBody();
    }

   //https://api.um.warszawa.pl/api/action/dbtimetable_get/?id=e923fa0e-d96c-43f9-ae6e-60518c9f3238&busstopId=3027&busstopNr=03&line=141&apikey=46657b26-69bc-489e-8985-e7e2c0422f72
    @Override
    public TimeTableResultDTO getTimeTable(String setof, String pistill, String line) {
        ResponseEntity<TimeTableResultDTO> exchange = restTemplate.exchange(
                "https://api.um.warszawa.pl/api/action/dbtimetable_get/?id=e923fa0e-d96c-43f9-ae6e-60518c9f3238&apikey=" + apikey + "&busstopId=" + setof + "&busstopNr=" + pistill + "&line=" + line,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                TimeTableResultDTO.class);
        return exchange.getBody();
    }



}
