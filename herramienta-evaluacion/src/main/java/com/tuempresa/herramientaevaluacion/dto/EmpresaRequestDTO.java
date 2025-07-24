package com.tuempresa.herramientaevaluacion.dto;

import java.util.List;

public class EmpresaRequestDTO {

    private String nombreEmpresa;
    private String responsable;
    private String cargo;
    private String correo;
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

    public List<Integer> getRespuestas() { return respuestas; }
    public void setRespuestas(List<Integer> respuestas) { this.respuestas = respuestas; }
}
