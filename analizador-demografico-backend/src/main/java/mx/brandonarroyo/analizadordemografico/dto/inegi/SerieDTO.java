package mx.brandonarroyo.analizadordemografico.dto.inegi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SerieDTO(
    @JsonProperty("INDICADOR") String indicador,
    @JsonProperty("FREQ") String freq,
    @JsonProperty("TOPIC") String topic,
    @JsonProperty("UNIT") String unit,
    @JsonProperty("UNIT_MULT") String unitMult,
    @JsonProperty("NOTE") String note,
    @JsonProperty("SOURCE") String source,
    @JsonProperty("LASTUPDATE") String lastUpdate,
    @JsonProperty("STATUS") String status,
    @JsonProperty("OBSERVATIONS") List<ObservacionDTO> observations
) {
    
}
