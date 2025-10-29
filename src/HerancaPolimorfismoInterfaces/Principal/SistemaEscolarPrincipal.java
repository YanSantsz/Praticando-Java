package HerancaPolimorfismoInterfaces.Principal;

import HerancaPolimorfismoInterfaces.Entidades.SistemaEscolar.Aluno;
import HerancaPolimorfismoInterfaces.Entidades.SistemaEscolar.Docente;

public class SistemaEscolarPrincipal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", 21, 8.5);
        Aluno aluno2 = new Aluno("Cao", 20, 7.5);

        Docente docente1 = new Docente("Maria", 42, "Matemática");
        Docente docente2 = new Docente("André", 38, "História");

        aluno1.exibirDados();
        aluno2.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
