package HerancaPolimorfismoInterfaces.Entidades;

public class EstudanteAluno {
    protected String nome;
    protected String tipo;

    public EstudanteAluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void identificar(){
        System.out.printf("Aluno: %s Tipo: %s\n", nome, tipo);
    }
}
