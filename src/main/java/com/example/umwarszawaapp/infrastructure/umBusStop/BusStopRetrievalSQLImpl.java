package com.example.umwarszawaapp.infrastructure.umBusStop;

import com.example.umwarszawaapp.domain.BusStop.BusStopName;
import com.example.umwarszawaapp.domain.BusStop.BusStopRetrievalDB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class BusStopRetrievalSQL implements BusStopRetrievalDB {

    private final BusStopRepo busStopRepo;

    @Override
    public List<BusStopName> getBusStopNames() {
        return busStopRepo.getAllNames();
    }




}
