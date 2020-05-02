package com.example.umwarszawaapp.api.umwarszawa;

import com.example.umwarszawaapp.domain.BusStop.BusStopFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    private final BusStopFacade busStopFacade;

    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {

        busStopFacade.getBusStopAll();

    }
}
