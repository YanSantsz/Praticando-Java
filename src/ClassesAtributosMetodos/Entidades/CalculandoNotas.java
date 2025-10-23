package ClassesAtributosMetodos.Entidades;

public class CalculandoNotas {
    private String nome;
    private double nota1;
    private double nota2;

    public CalculandoNotas(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    private double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void exibirNotas() {
        double media = calcularMedia();
        System.out.println("Nome: " + nome);
        System.out.printf("Média: %.1f%n", media);

        if (media >= 7){
            System.out.println("Situação: Aprovado");
        } else {System.out.println("Situação: Reprovado");}
        System.out.println();
    }
}
