package HerancaPolimorfismoInterfaces.Principal;

import HerancaPolimorfismoInterfaces.Entidades.GerenciamentoBiblioteca.Ebook;
import HerancaPolimorfismoInterfaces.Entidades.GerenciamentoBiblioteca.Livro;
import HerancaPolimorfismoInterfaces.Entidades.GerenciamentoBiblioteca.Revista;

public class GerenciamentoBibliotecaPrincipal {
    public static void main(String[] args) {
        Livro livro = new Livro("O Hobbit", 1937, "J.R.R. Tolkien");
        Revista revista = new Revista("National Geographic", 2023, 150);
        Ebook ebook = new Ebook("Java para Iniciantes", 2024, "PDF");

        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();
    }
}
