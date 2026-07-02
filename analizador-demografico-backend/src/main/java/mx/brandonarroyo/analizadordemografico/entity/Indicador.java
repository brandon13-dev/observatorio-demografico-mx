package mx.brandonarroyo.analizadordemografico.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Indicador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String claveInegi;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String unidad;

    @OneToMany(mappedBy = "indicador")
    private List<Observacion> observaciones;

    public Indicador() {}

    public Indicador(Long id, String claveInegi, String nombre, String unidad) {
        this.id = id;
        this.claveInegi = claveInegi;
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getClaveInegi() { return claveInegi; }
    public void setClaveInegi(String claveInegi) { this.claveInegi = claveInegi; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUnidad() { return unidad; }
    public void setUnidad(String unidad) { this.unidad = unidad; }

    public List<Observacion> getObservaciones() { return observaciones; }
    public void setObservaciones(List<Observacion> observaciones) { this.observaciones = observaciones; }
}
