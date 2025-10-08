package ForWhile;

import java.util.Scanner;

public class TentativasLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        boolean acessoPermitido = false;

        for (int i = 2; i >= 0; i--) {
            System.out.print("Digite sua senha: ");
            senha = sc.nextInt();
            if (senha == 1234) {
                System.out.println("Senha Correta! Acesso concedido!");
                acessoPermitido = true;
                break;
            } else if (i > 0) {
                System.out.println("Senha incorreta. Você tem " + i + " tentativas restantes.");
            }
        }

        if (!acessoPermitido) {
            System.out.println("Conta bloqueada temporariamente.");
        }
        sc.close();
    }
}
