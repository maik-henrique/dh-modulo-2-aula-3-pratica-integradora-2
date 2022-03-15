package br.com.meli.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class Veiculo {
    private String marca;
    private String modelo;
    private BigDecimal preço;
}
