package com.example.umwarszawaapp.api.umwarszawa;

import com.example.umwarszawaapp.domain.BusStop.BusStopDB;
import com.example.umwarszawaapp.domain.BusStop.BusStopFacade;
import com.example.umwarszawaapp.domain.BusStop.BusStopName;
import com.example.umwarszawaapp.domain.BusStop.BusStopResult.Value;
import com.example.umwarszawaapp.domain.BusStop.BusStopResultDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1")
@RestController
@RequestMapping("/bus-stop")
@RequiredArgsConstructor
class BusStopController {

    private final BusStopFacade busStopFacade;


    @GetMapping(path = "/name-mza/{name}")
    @ResponseStatus(HttpStatus.CREATED)
    public BusStopResultDTO busStop(@PathVariable String name) {

        BusStopResultDTO busStopDTO = busStopFacade.getBusStopByName(name);

/*        busStop.getResult().stream().forEach(System.out::println);
        System.out.println(busStop.getResult().get(0).getValues().size());
        String value = busStop.getResult().get(0).getValues().get(1).getKey();
        String zespolKey = busStop.getResult().get(0).getValues().get(1).getValue();
        System.out.println(value);
        System.out.println(zespolKey);*/
        return busStopDTO;
    }


    @GetMapping(path = "/name-db/{street}")
    @ResponseStatus(HttpStatus.CREATED)
    public List<BusStopDB> busStopByStreet(@PathVariable String street) {

        List<BusStopDB> busStopDBList = busStopFacade.getBusStopByNameDB(street);

        return busStopDBList;
    }



    @GetMapping(path = "/all")
    @ResponseStatus(HttpStatus.CREATED)
    public void busStopAll() {

        busStopFacade.getBusStopAll();

        //busStopFacade.createBusStopsDB(busStopResultDTO);
    }

    @GetMapping(path = "/names")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity <List<String>> busStopNames() {
        try {
            //List<OrderResponseDTO> orderResponseDTO = orderFacade.getOrdersByStatus(status);
            List<String> nameList =  busStopFacade.getBusStopNames();
            return ResponseEntity.ok(nameList);
        } catch (Exception ex) {
            return ResponseEntity.notFound().build();
        }
    }






}
