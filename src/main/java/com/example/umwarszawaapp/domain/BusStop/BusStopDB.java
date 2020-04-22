package com.example.umwarszawaapp.domain.BusStop;

import com.example.umwarszawaapp.domain.BusStop.BusStopResult.Result;
import com.example.umwarszawaapp.domain.BusStop.BusStopResult.Value;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Builder
@Entity
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@Setter
@Table(name = "busstops")
public class BusStopDB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String setof;
    private String pistil;
    private String street;
    private String streetId;
    private String lat;
    private String lon;
    private String direction;
    private String valid;


    static class BusStopMapBuilder {
        static BusStopDB create(Result result) {
            return BusStopDB.builder()
                    .setof(result.getValues().get(0).getValue())
                    .pistil(result.getValues().get(1).getValue())
                    .street(result.getValues().get(2).getValue())
                    .streetId(result.getValues().get(3).getValue())
                    .lat(result.getValues().get(4).getValue())
                    .lon(result.getValues().get(5).getValue())
                    .direction(result.getValues().get(6).getValue())
                    .valid(result.getValues().get(7).getValue())
                    .build();
        }


    }

    @Override
    public String toString() {
        return "BusStopDB{" +
                "setof='" + setof + '\'' +
                ", street='" + street + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                '}';
    }
}
