package com.tuempresa.herramientaevaluacion.entity;

import jakarta.persistence.*;

@Entity
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer nivelMadurez;
    private String mensaje;

    @OneToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    // Getters y Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getNivelMadurez() { return nivelMadurez; }
    public void setNivelMadurez(Integer nivelMadurez) { this.nivelMadurez = nivelMadurez; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public Empresa getEmpresa() { return empresa; }
    public void setEmpresa(Empresa empresa) { this.empresa = empresa; }
}
