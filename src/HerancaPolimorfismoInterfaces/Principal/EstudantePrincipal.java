package HerancaPolimorfismoInterfaces.Principal;

import HerancaPolimorfismoInterfaces.Entidades.Estudantes.Aluno;
import HerancaPolimorfismoInterfaces.Entidades.Estudantes.Bolsista;

public class EstudantePrincipal {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Rafael", "regular");
        Bolsista bolsista = new Bolsista("Pedro");

        aluno.identificar();
        bolsista.identificar();
    }
}
