package com.example.umwarszawaapp.domain.BusStop;

import com.example.umwarszawaapp.domain.BusStop.BusStopResult.Value;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BusStopFacade {

    private final BusStopRetrieval busStopRetrieval;
    private final BusStopRetrievalDB busStopRetrievalDB;
    private final CreateBusStopRepo createBusStopRepo;
    private final BusStopMapper busStopMapper;

    public BusStopResultDTO getBusStopByName(String name) {

        return busStopRetrieval.getBusStopByName(name);
    }

/*    public BusStopResultDTO getBusStopAll() {
        return busStopRetrieval.getBusStopAll();
    }*/

    public void getBusStopAll() {
        BusStopResultDTO busStopResultDTO = busStopRetrieval.getBusStopAll();
        busStopMapper.createBusStopsDB(busStopResultDTO);
    }

    public List<String> getBusStopNames() {
        return busStopRetrievalDB.getBusStopNames();
    }

    public List<BusStopDB> getBusStopByNameDB(String street) {

        return busStopRetrievalDB.getBusStopByNameDB(street);
    }

// przeniesiona do busStopMapper
/*    private List<BusStopDB> createBusStopsDB(BusStopResultDTO busStopResultDTO) {

        List<BusStopDB> busStopDB = busStopResultDTO.getResult().stream()
                .map(BusStopDB.BusStopMapper::create)
                .collect(Collectors.toList());
        //BusStopDB item = busStopDB.get(10);
        //System.out.println(item.toString());
        createBusStopRepo.createBusStopRepoInt(busStopDB);
        return busStopDB;
    }*/
}
