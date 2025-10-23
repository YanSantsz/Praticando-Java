package Encapsulamento.Entidades;

public class Carro {
    private String modelo;
    private String placa;
    private float ano;


    public Carro(String modelo, String placa, float ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void especificacao(){
        System.out.printf("Veículo cadastrado: \nModelo: %s \nPlaca: %s \nAno: %.0f", modelo, placa, ano);
    }
}
