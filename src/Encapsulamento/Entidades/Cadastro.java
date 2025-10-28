package Encapsulamento.Entidades;

public class Cadastro {
    private String nome;
    private float preco;

    public Cadastro(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirValore(){
        if (preco <= 0){
            System.out.println("Preço inválido");
            preco = 0;
        }

        System.out.println("Produto: " + nome);
        System.out.printf("Preço: %.2f", preco);
    }
}
