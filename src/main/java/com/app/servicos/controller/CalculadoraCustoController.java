package com.app.servicos.controller;

import com.app.servicos.service.CalculadoraCustoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/calculo-total")
public class CalculadoraCustoController {private final CalculadoraCustoService calculadoraCustoService;

    public CalculadoraCustoController(CalculadoraCustoService calculadoraCustoService) {
        this.calculadoraCustoService = calculadoraCustoService;
    }

    @GetMapping("/{ordemDeServicoId}")
    public ResponseEntity<BigDecimal> calcularCustoTotal(@PathVariable Long ordemDeServicoId) {
        var custoTotal = calculadoraCustoService.calcularCustoTotal(ordemDeServicoId);
        return ResponseEntity.ok(custoTotal);
    }
}
