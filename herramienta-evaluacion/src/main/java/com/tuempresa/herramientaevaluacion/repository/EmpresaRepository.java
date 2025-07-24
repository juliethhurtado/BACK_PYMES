package com.tuempresa.herramientaevaluacion.repository;

import com.tuempresa.herramientaevaluacion.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
