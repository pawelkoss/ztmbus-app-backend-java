package com.example.umwarszawaapp.infrastructure.umBusStop;

import com.example.umwarszawaapp.domain.BusStop.BusStopDB;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusStopRepo extends JpaRepository<BusStopDB, Long> {

}
