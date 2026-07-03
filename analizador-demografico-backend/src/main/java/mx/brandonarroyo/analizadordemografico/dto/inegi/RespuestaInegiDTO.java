package mx.brandonarroyo.analizadordemografico.dto.inegi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RespuestaInegiDTO(
    @JsonProperty("Header") HeaderDTO header,
    @JsonProperty("Series") List<SerieDTO> series
) {
}
