package com.example.umwarszawaapp.domain.TimeTable;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimeTableFacade {

    private final TimeTableRetrieval timeTableRetrieval;



    public TimeTableResultDTO getTimeTableLines(String setof, String pistill) {

        return timeTableRetrieval.getTimeTableLines(setof, pistill);
    }

}
