package mx.brandonarroyo.analizadordemografico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.brandonarroyo.analizadordemografico.entity.Municipio;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long>{
    
}
