package mx.brandonarroyo.analizadordemografico.dto.inegi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record HeaderDTO(
    @JsonProperty("Name") String name,
    @JsonProperty("Email") String email
) {
}
