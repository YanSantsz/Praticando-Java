package ForWhile;

import java.util.Scanner;

public class ContadorPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int numero = 0;
        String entrada;

        do {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            entrada = sc.nextLine();

            if (!entrada.equals("fim")){
                numero = Integer.parseInt(entrada);
            }

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }while (!entrada.equals("fim"));

        System.out.print("Numeros positivos: " + positivos);
        System.out.print("\nNumeros negativos: " + negativos);
    }
}
