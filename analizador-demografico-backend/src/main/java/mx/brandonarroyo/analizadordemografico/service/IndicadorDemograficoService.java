package mx.brandonarroyo.analizadordemografico.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.brandonarroyo.analizadordemografico.client.InegiClient;
import mx.brandonarroyo.analizadordemografico.dto.inegi.ObservacionDTO;
import mx.brandonarroyo.analizadordemografico.dto.inegi.RespuestaInegiDTO;

@Service
public class IndicadorDemograficoService {
    
    private final InegiClient inegiClient;

    public IndicadorDemograficoService(InegiClient inegiClient) {
        this.inegiClient = inegiClient;
    }

    public List<ObservacionDTO> obtenerObservacionesChiapas(){
        // Obtenemos todos los datos en forma de RespuestaInegiDTO
        RespuestaInegiDTO response = inegiClient.obtenerSerieHistoricaChiapas();

        return response.series()
                        .getFirst()
                        .observations();
    }
}
