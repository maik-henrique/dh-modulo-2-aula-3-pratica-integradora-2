package br.com.meli;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class Garagem {
    private int id;
    private List<Veiculo> veiculo;

    public Garagem(List<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
}
