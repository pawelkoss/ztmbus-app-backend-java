package com.example.umwarszawaapp.domain.BusStop;

import java.util.List;

public interface BusStopRetrieval {

    BusStopResultDTO getBusStopByName(String name);

    BusStopResultDTO getBusStopAll();



}
