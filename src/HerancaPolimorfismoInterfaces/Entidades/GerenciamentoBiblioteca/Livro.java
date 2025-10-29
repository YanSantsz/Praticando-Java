package HerancaPolimorfismoInterfaces.Entidades.GerenciamentoBiblioteca;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== LIVRO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println();
    }
}
