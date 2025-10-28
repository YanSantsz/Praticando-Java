package HerancaPolimorfismoInterfaces.Principal;

import HerancaPolimorfismoInterfaces.Entidades.EstudanteAluno;
import HerancaPolimorfismoInterfaces.Entidades.EstudanteBolsista;

public class estudantePrincipal {
    public static void main(String[] args) {

        EstudanteAluno aluno = new EstudanteAluno("Rafael", "regular");
        EstudanteBolsista bolsista = new EstudanteBolsista("Pedro");

        aluno.identificar();
        bolsista.identificar();
    }
}
