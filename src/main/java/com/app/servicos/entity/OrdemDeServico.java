package com.app.servicos.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "ordem_servico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdemDeServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao_servico")
    private String descricaoServico;

    @Column(name = "data_servico")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataServico;

    @Column(name =  "custo_servico")
    private double custoServico;

    @Column(name =  "custo_adicional")
    private double custoAdicional;

    @Column(name =  "custo_total")
    private double custoTotal;

}
