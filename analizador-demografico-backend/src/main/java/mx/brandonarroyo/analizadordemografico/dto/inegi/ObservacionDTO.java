package mx.brandonarroyo.analizadordemografico.dto.inegi;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ObservacionDTO(
    @JsonProperty("TIME_PERIOD") Integer timePeriod,
    @JsonProperty("OBS_VALUE") BigDecimal obsValue,
    @JsonProperty("OBS_EXCEPTION") String obsException,
    @JsonProperty("OBS_STATUS") String obsStatus,
    @JsonProperty("OBS_SOURCE") String obsSource,
    @JsonProperty("OBS_NOTE") String obsNote,
    @JsonProperty("COBER_GEO") String coberGeo
) {
    
}
