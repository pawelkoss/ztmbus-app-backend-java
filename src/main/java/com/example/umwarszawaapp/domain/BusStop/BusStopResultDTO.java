package com.example.umwarszawaapp.domain.BusStop;

import com.example.umwarszawaapp.domain.BusStop.BusStopResult.Result;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"result"})
public class BusStopResultDTO {

    //@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("result")
    private List<Result> result = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public BusStopResultDTO() {
    }

    /**
     *
     * @param result
     */
    public BusStopResultDTO(List<Result> result) {
        super();
        this.result = result;
    }

    @JsonProperty("result")
    public List<Result> getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(List<Result> result) {
        this.result = result;
    }

}
