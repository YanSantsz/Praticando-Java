package HerancaPolimorfismoInterfaces.Entidades.SistemaEscolar;

public class Docente extends Pessoa{
    protected String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.println("Docente: " + nome + " - Idade: " + idade + " - Disciplina: " + disciplina);
    }

}
