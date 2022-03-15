package br.com.meli.entity;

import br.com.meli.entity.Veiculo;
import lombok.Data;

import java.util.List;

@Data
public class Garagem {
    private int id;
    private List<Veiculo> veiculo;

    public Garagem(List<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
}
