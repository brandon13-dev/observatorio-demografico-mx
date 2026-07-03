package mx.brandonarroyo.analizadordemografico.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import mx.brandonarroyo.analizadordemografico.dto.inegi.RespuestaInegiDTO;

@Component
public class InegiClient {
    
    private final String token;
    private final RestClient restClient;
    private static final String ENDPOINT_PRUEBA = "/INDICATOR/1002000001/es/07/false/BISE/2.0/";

    public InegiClient(
        @Value("${inegi.api.token}") String token,
        @Value("${inegi.api.base-url}") String baseUrl
    ) {
        this.token = token;

        this.restClient = RestClient.builder()
                .baseUrl(baseUrl)
                .build();
    }

    // Metodo generico para obtener valores segun los argumentos (indicador y estado)
    public RespuestaInegiDTO obtenerSerieHistorica(String indicador, String estado){
        return new RespuestaInegiDTO(null, null);
    }

    // Metodo de prueba para validar que funcione con datos especificos
    public RespuestaInegiDTO obtenerSerieHistoricaChiapas(){
        // Construimos la URL
        String url = ENDPOINT_PRUEBA + token + "?type=json";

        return this.restClient.get()
                .uri(url)
                .retrieve()
                .body(RespuestaInegiDTO.class);
    }
}
