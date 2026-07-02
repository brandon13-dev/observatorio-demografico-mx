package mx.brandonarroyo.analizadordemografico.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Observacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String periodo;

    @Column(nullable = false)
    private String valor;

    @ManyToOne
    @JoinColumn(name = "municipio_id")
    private Municipio municipio;

    @ManyToOne
    @JoinColumn(name = "indicador_id")
    private Indicador indicador;

    public Observacion() {}

    public Observacion(Long id, Municipio municipio, Indicador indicador, String periodo, String valor) {
        this.id = id;
        this.municipio = municipio;
        this.indicador = indicador;
        this.periodo = periodo;
        this.valor = valor;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Municipio getMunicipio() { return municipio; }
    public void setMunicipio(Municipio municipio) { this.municipio = municipio; }

    public Indicador getIndicador() { return indicador; }
    public void setIndicador(Indicador indicador) { this.indicador = indicador; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }
}