package ClassesAtributosMetodos.Classes;

public class ProdutosRelatorio {
    String produto = "Mouse Gamer";
    double preco = 159.9;
    int quantidade = 25;


    public ProdutosRelatorio(String produto, double preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void imprimirRelatorio(){
        System.out.println("=== RELATÓRIO DO PRODUTO ===");
        System.out.println("Produto: " + produto);
        System.out.printf("Preço: %.2f%n", preco);
        System.out.println("Quantidade " + quantidade);
    }
}
