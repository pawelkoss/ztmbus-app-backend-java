package com.example.umwarszawaapp;

import com.example.umwarszawaapp.domain.BusStop.BusStopFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequiredArgsConstructor
public class UmWarszawaAppApplication {

	private static BusStopFacade busStopFacade;

	public static void main(String[] args) {

		SpringApplication.run(UmWarszawaAppApplication.class, args);

		//busStopFacade.getBusStopAll();

	}

		@RequestMapping(path = "/", method = RequestMethod.GET)
		public String indexPage(){
			return "Lokalizacji komunikacji miejsckiej i przystanków. Endpointy:";
		}


}
