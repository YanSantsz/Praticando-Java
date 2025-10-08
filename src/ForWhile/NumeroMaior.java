package ForWhile;

import java.util.Scanner;

public class NumeroMaior {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite os números separados por espaço: ");
            String entrada = sc.nextLine();

            String[] numerosTexto = entrada.split(" ");

            int maior = Integer.parseInt(numerosTexto[0]);

            for (int i = 1; i < numerosTexto.length; i++) {
                int numeroAtual = Integer.parseInt(numerosTexto[i]);

                if (numeroAtual > maior) {
                    maior = numeroAtual;
                }
            }

            System.out.println("O maior número é: " + maior);
            sc.close();
        }
    }
