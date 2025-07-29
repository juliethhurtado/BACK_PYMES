package com.tuempresa.herramientaevaluacion.dto;

import java.util.List;

public class EmpresaRequestDTO {

	private String nombreEmpresa;
    private String responsable;
    private String cargo;
    private String correo;
    private int edad;
    private String genero;
    private String ciudad;
    private String departamento;
    private int numeroEmpleados;
    private int aniosExperiencia;
    private List<Integer> respuestas;

    // Getters y Setters

    public String getNombreEmpresa() { return nombreEmpresa; }
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public String getResponsable() { return responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public int getNumeroEmpleados() { return numeroEmpleados; }
    public void setNumeroEmpleados(int numeroEmpleados) { this.numeroEmpleados = numeroEmpleados; }

    public int getAniosExperiencia() { return aniosExperiencia; }
    public void setAniosExperiencia(int aniosExperiencia) { this.aniosExperiencia = aniosExperiencia; }

    public List<Integer> getRespuestas() { return respuestas; }
    public void setRespuestas(List<Integer> respuestas) { this.respuestas = respuestas; }
	public Boolean getAutorizacionUsoDatos() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getSectorEconomico() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getMunicipio() {
		// TODO Auto-generated method stub
		return null;
	}
}
