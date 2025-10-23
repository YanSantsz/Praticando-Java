package Encapsulamento.Principal;

import Encapsulamento.Entidades.Carro;

public class CarroPrincipal {
    public static void main(String[] args) {
        Carro carro = new Carro("Gol", "ABD-CD", 2004);
        carro.especificacao();
    }
}
