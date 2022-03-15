package br.com.meli;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculos = List.of(new Veiculo("Ford", "Fiesta", BigDecimal.valueOf(1000)),
                new Veiculo("Ford", "Focus",  BigDecimal.valueOf(1200)),
                new Veiculo("Ford", "Explorer",  BigDecimal.valueOf(2500)),
                new Veiculo("Fiat", "Uno",  BigDecimal.valueOf(500)),
                new Veiculo("Fiat", "Cronos",  BigDecimal.valueOf(1000)),
                new Veiculo("Fiat", "Torino",  BigDecimal.valueOf(1250)),
                new Veiculo("Chevrolet", "Aveo",  BigDecimal.valueOf(1250)),
                new Veiculo("Chevrolet", "Spint",  BigDecimal.valueOf(2500)),
                new Veiculo("Toyota", "Corola",  BigDecimal.valueOf(1200)),
                new Veiculo("Toyota", "Fortuner",  BigDecimal.valueOf(3000)),
                new Veiculo("Renault", "Logan",  BigDecimal.valueOf(950))
        );

        System.out.println("Ordenados por preço:");
        veiculos.stream().sorted(Comparator.comparing(Veiculo::getPreço))
                .forEach(System.out::println);

        System.out.println("Ordenados por marca:");
        veiculos.stream().sorted(Comparator.comparing(Veiculo::getMarca))
                .forEach(System.out::println);

        System.out.println("Veículos com preço menor ou igual a 1000");
        BigDecimal preçoLimitante = BigDecimal.valueOf(1000);
        veiculos.stream().filter(veiculo -> {
            if (veiculo.getPreço().compareTo(preçoLimitante) <= 0) {
                return true;
            }
            return false;
        }).forEach(System.out::println);

        System.out.println("Veículos com preço maior que 1000");
        veiculos.stream().filter(veiculo -> {
            if (veiculo.getPreço().compareTo(preçoLimitante) > 0) {
                return true;
            }
            return false;
        }).forEach(System.out::println);


        BigDecimal divisor = BigDecimal.valueOf(veiculos.size());
        BigDecimal precoMedio = veiculos.stream().map(Veiculo::getPreço)
                .reduce(BigDecimal.ZERO, (media, preco) -> media.add(preco.divide(divisor, RoundingMode.HALF_EVEN)));
        System.out.printf("Preço médio dos veículos: %s", precoMedio);
    }
}
