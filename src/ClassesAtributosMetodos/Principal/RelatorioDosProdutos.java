package ClassesAtributosMetodos.Principal;

import ClassesAtributosMetodos.Entidades.ProdutosRelatorio;

public class RelatorioDosProdutos {
    public static void main(String[] args) {
        ProdutosRelatorio produto1 = new ProdutosRelatorio("Mouse Gamer", 159.9, 25);

        produto1.imprimirRelatorio();
    }

}
