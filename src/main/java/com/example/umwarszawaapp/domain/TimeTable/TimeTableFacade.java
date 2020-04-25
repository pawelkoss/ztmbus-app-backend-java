package com.example.umwarszawaapp.domain.TimeTable;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimeTableFacade {

    private final TimeTableRetrieval timeTableRetrieval;



    public TimeTableLineResultDTO getTimeTableLines(String setof, String pistill) {

        return timeTableRetrieval.getTimeTableLines(setof, pistill);
    }

    public TimeTableResultDTO getTimeTable(String setof, String pistill, String line) {

        return timeTableRetrieval.getTimeTable(setof, pistill, line);
    }



}
