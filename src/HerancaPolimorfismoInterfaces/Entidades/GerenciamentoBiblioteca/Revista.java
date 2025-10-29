package HerancaPolimorfismoInterfaces.Entidades.GerenciamentoBiblioteca;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== REVISTA ===");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Edição: " + edicao);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println();
    }
}
