package ForWhile;

import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 1;
        System.out.print("Digite um numero: " );
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        sc.close();
    }
}
