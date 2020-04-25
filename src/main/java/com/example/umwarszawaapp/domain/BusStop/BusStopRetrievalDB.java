package com.example.umwarszawaapp.domain.BusStop;

import java.util.List;

public interface BusStopRetrievalDB {

    List<String> getBusStopNames();

    List<BusStopDB> getBusStopByNameDB(String street);
}
