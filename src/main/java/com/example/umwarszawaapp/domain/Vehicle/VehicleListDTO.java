package com.example.umwarszawaapp.domain.Vehicle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"result"})
public class VehicleListDTO {

    @JsonProperty("result")
    private List<VehicleDTO> result = null;

    public VehicleListDTO() {
        super();
        result = new ArrayList<>();
    }

    public VehicleListDTO(List<VehicleDTO> result) {
        this.result = result;
    }

    @JsonProperty("result")
    public List<VehicleDTO> getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(List<VehicleDTO> result) {
        this.result = result;
    }


}
