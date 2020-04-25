package com.example.umwarszawaapp.infrastructure.umBusStop;

import com.example.umwarszawaapp.domain.BusStop.BusStopDB;
import com.example.umwarszawaapp.domain.BusStop.BusStopName;
import com.example.umwarszawaapp.domain.BusStop.BusStopResultDTO;
import com.example.umwarszawaapp.domain.BusStop.BusStopRetrievalDB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
class BusStopRetrievalSQLImpl implements BusStopRetrievalDB {

    private final BusStopRepo busStopRepo;

    @Override
    public List<String> getBusStopNames() {

        //return busStopRepo.findAll().stream().map(item -> item.getStreet()).collect(Collectors.toList());
        return busStopRepo.getAllNames();
    }

    @Override
    public List<BusStopDB> getBusStopByNameDB(String street) {
        return busStopRepo.findByStreet(street);
    }


}
