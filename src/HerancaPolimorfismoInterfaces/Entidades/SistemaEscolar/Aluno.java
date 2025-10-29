package HerancaPolimorfismoInterfaces.Entidades.SistemaEscolar;

public class Aluno extends Pessoa{
    protected double nota;


    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno: " + nome + "- Idade: " + idade + " - Nota: " + nota);
    }
}
