package com.example.umwarszawaapp.domain.BusStop;

public interface BusStopRetrieval {

    BusStopResultDTO getBusStopByName(String name);

    BusStopResultDTO getBusStopAll();
}
