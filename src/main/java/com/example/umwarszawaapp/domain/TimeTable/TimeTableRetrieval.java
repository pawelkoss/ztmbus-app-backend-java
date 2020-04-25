package com.example.umwarszawaapp.domain.TimeTable;

public interface TimeTableRetrieval {


    TimeTableLineResultDTO getTimeTableLines(String setof, String pistill);

    TimeTableResultDTO getTimeTable(String setof, String pistill, String line);

}