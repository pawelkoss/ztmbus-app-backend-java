
package com.example.umwarszawaapp.domain.TimeTable;

import java.util.List;

import com.example.umwarszawaapp.domain.TimeTable.TimeTableResult.Result;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "result"
})
public class TimeTableResultDTO {

    @JsonProperty("result")
    private List<Result> result = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public TimeTableResultDTO() {
    }

    /**
     *
     * @param result
     */
    public TimeTableResultDTO(List<Result> result) {
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
