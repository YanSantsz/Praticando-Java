package HerancaPolimorfismoInterfaces.Entidades.GerenciamentoBiblioteca;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    public void exibirInfo() {
        System.out.println("=== EBOOK ===");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Formato: " + formato);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println();
    }
}
