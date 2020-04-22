package com.example.umwarszawaapp.domain.BusStop.BusStopResult;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "value",
        "key"
})
public class Value {

    @JsonProperty("value")
    private String value;
    @JsonProperty("key")
    private String key;

    /**
     * No args constructor for use in serialization
     *
     */
    public Value() {
    }

    /**
     *
     * @param value
     * @param key
     */
    public Value(String value, String key) {
        super();
        this.value = value;
        this.key = key;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Value{" +
                "value='" + value + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
