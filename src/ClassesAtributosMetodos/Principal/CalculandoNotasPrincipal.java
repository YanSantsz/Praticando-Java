package ClassesAtributosMetodos.Principal;
import ClassesAtributosMetodos.Entidades.CalculandoNotas;
import java.util.Locale;
import java.util.Scanner;

public class CalculandoNotasPrincipal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite nota 1: ");
        double notas1 = sc.nextDouble();

        System.out.print("Digite nota 2: ");
        double notas2 = sc.nextDouble();

        CalculandoNotas aluno = new CalculandoNotas(nome, notas1, notas2);

        System.out.println("\n=== RESULTADO ===");
        aluno.exibirNotas();

        sc.close();
    }
}
