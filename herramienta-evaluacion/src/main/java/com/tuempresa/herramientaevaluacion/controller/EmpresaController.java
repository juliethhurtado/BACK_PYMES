package com.tuempresa.herramientaevaluacion.controller;

import com.tuempresa.herramientaevaluacion.dto.EmpresaRequestDTO;
import com.tuempresa.herramientaevaluacion.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/empresa")
@CrossOrigin(origins = "*") // permite conexión desde frontend Angular
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping("/registrar")
    public ResponseEntity<String> registrarEmpresa(@RequestBody EmpresaRequestDTO dto) {
        empresaService.registrarEmpresa(dto);
        return ResponseEntity.ok("Registro exitoso. Gracias por participar.");
    }

    @PostMapping("/enviarResultados")
    public ResponseEntity<String> enviarResultados(@RequestBody EmpresaRequestDTO dto) {
        empresaService.registrarEmpresa(dto);  // o llama otro método si lo separas
        return ResponseEntity.ok("Resultados enviados correctamente.");
    }
}
