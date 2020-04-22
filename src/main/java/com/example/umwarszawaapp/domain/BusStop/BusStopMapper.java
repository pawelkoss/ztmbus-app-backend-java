package com.example.umwarszawaapp.domain.BusStop;

import com.example.umwarszawaapp.infrastructure.umBusStop.BusStopRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
class BusStopMapper {

    private final CreateBusStopRepo createBusStopRepo;


     List<BusStopDB> createBusStopsDB(BusStopResultDTO busStopResultDTO) {

        List<BusStopDB> busStopDB = busStopResultDTO.getResult().stream()
                .map(BusStopDB.BusStopMapBuilder::create)
                .collect(Collectors.toList());

        //BusStopDB item = busStopDB.get(10);
        //System.out.println(item.toString());

        createBusStopRepo.createBusStopRepoInt(busStopDB);
        return busStopDB;


    }
}
