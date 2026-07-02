package mx.brandonarroyo.analizadordemografico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.brandonarroyo.analizadordemografico.entity.Observacion;

@Repository
public interface ObservacionRepository extends JpaRepository<Observacion, Long>{
    
}
