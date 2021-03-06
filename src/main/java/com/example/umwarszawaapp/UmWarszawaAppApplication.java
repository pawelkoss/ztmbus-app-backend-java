package com.example.umwarszawaapp;

import com.example.umwarszawaapp.domain.BusStop.BusStopFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UmWarszawaAppApplication {



	public static void main(String[] args) {

		SpringApplication.run(UmWarszawaAppApplication.class, args);

	}

		@RequestMapping(path = "/", method = RequestMethod.GET)
		public String indexPage(){
			return "<html><h3>Api lokalizacji komunikacji miejskiej i przystanków</h3>. Interfejs mapy pod linkiem: <a href='http://plutioidtx.cluster029.hosting.ovh.net/dist/'>MAPY >> </a>";
		}


}
