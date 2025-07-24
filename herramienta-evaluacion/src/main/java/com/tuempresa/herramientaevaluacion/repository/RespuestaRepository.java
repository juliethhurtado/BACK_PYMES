package com.tuempresa.herramientaevaluacion.repository;

import com.tuempresa.herramientaevaluacion.entity.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    List<Respuesta> findByEmpresaId(Long empresaId);
}
