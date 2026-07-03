package mx.brandonarroyo.analizadordemografico.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.brandonarroyo.analizadordemografico.dto.inegi.ObservacionDTO;
import mx.brandonarroyo.analizadordemografico.service.IndicadorDemograficoService;

@Configuration
public class StartupRunner {
    
    @Bean
    public CommandLineRunner ejecutar(IndicadorDemograficoService service){
        return args -> {
            System.out.println("Consultando INEGI...");

            List<ObservacionDTO> observaciones = service.obtenerObservacionesChiapas();

            for (ObservacionDTO obs : observaciones) {
                System.out.println(
                    "Año: " + obs.timePeriod()
                    + " -> "
                    + obs.obsValue()
                );   
            }
        };
    }
}
