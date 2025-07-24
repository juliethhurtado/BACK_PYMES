package com.tuempresa.herramientaevaluacion.entity;

import java.time.LocalDate;
import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
public class Empresa {
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nombreEmpresa;
	    private String responsable;
	    private String cargo;
	    private String correo;
	    private LocalDate fechaRegistro;

	    // Getters y Setters

	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getNombreEmpresa() { return nombreEmpresa; }
	    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

	    public String getResponsable() { return responsable; }
	    public void setResponsable(String responsable) { this.responsable = responsable; }

	    public String getCargo() { return cargo; }
	    public void setCargo(String cargo) { this.cargo = cargo; }

	    public String getCorreo() { return correo; }
	    public void setCorreo(String correo) { this.correo = correo; }

	    public LocalDate getFechaRegistro() { return fechaRegistro; }
	    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }

}
