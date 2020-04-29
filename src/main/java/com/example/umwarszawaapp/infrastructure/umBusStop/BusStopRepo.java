package com.example.umwarszawaapp.infrastructure.umBusStop;

import com.example.umwarszawaapp.domain.BusStop.BusStopDB;
import com.example.umwarszawaapp.domain.BusStop.BusStopName;
import com.example.umwarszawaapp.domain.BusStop.BusStopResultDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BusStopRepo extends JpaRepository<BusStopDB, Long> {

   @Query(value = "SELECT DISTINCT street FROM busstops ORDER BY street ASC", nativeQuery = true)
    List<String> getAllNames();

    List<BusStopDB> findByStreetIgnoreCase(String street);

    //List<BusStopDB> findAll();
}
