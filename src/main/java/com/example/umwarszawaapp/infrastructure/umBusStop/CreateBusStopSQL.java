package com.example.umwarszawaapp.infrastructure.umBusStop;

import com.example.umwarszawaapp.domain.BusStop.BusStopDB;
import com.example.umwarszawaapp.domain.BusStop.CreateBusStopRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
class CreateBusStopSQL implements CreateBusStopRepo {

    private final BusStopRepo busStopRepo;


    @Override
    public void createBusStopRepoInt(List<BusStopDB> busStopDB) {

        busStopRepo.saveAll(busStopDB);
    }
}
