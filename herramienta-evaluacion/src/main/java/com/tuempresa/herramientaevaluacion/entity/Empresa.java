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
	    private String genero;
	    private Integer edad;
	    private String departamento;
	    private String municipio;
	    private String sectorEconomico; // opcional
	    private int aniosExperiencia;
	    public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public Integer getEdad() {
			return edad;
		}
		public void setEdad(Integer edad) {
			this.edad = edad;
		}
		public String getDepartamento() {
			return departamento;
		}
		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		public String getMunicipio() {
			return municipio;
		}
		public void setMunicipio(String municipio) {
			this.municipio = municipio;
		}
		public String getSectorEconomico() {
			return sectorEconomico;
		}
		public void setSectorEconomico(String sectorEconomico) {
			this.sectorEconomico = sectorEconomico;
		}
		public Integer getNumeroEmpleados() {
			return numeroEmpleados;
		}
		public void setNumeroEmpleados(Integer numeroEmpleados) {
			this.numeroEmpleados = numeroEmpleados;
		}
		public Boolean getAutorizacionUsoDatos() {
			return autorizacionUsoDatos;
		}
		public void setAutorizacionUsoDatos(Boolean autorizacionUsoDatos) {
			this.autorizacionUsoDatos = autorizacionUsoDatos;
		}
		private Integer numeroEmpleados;
	    private Boolean autorizacionUsoDatos;

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

		public int getAniosExperiencia() {
			return aniosExperiencia;
		}
		public void setAniosExperiencia(int aniosExperiencia) {
			this.aniosExperiencia = aniosExperiencia;
		}

}
