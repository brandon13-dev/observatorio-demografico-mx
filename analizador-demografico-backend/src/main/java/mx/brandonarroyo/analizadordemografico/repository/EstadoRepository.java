package mx.brandonarroyo.analizadordemografico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.brandonarroyo.analizadordemografico.entity.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{
    
}
