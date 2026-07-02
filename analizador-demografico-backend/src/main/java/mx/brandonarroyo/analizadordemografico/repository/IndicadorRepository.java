package mx.brandonarroyo.analizadordemografico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.brandonarroyo.analizadordemografico.entity.Indicador;

@Repository
public interface IndicadorRepository extends JpaRepository<Indicador, Long>{
    
}
