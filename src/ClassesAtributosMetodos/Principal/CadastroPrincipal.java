package ClassesAtributosMetodos.Principal;

import ClassesAtributosMetodos.Entidades.Cadastro;

import java.util.Scanner;

public class CadastroPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Cargo Atual:");
        String cargoAtual = sc.nextLine();

        System.out.print("Nível de acesso atual:");
        int nivelDeAcesso = sc.nextInt();
        sc.nextLine();

        Cadastro funcionario = new Cadastro(nome, cargoAtual, nivelDeAcesso);

        System.out.print("Novo cargo: ");
        String novoCargo = sc.nextLine();

        System.out.print("Novo nível de acesso:");
        int novoNivel = sc.nextInt();

        funcionario.alteracaoDeCargo(novoCargo, novoNivel);

        System.out.println("\n--- Antes da atualização ---");
        funcionario.exibirInformacoes();

        System.out.println("\n--- Depois da atualização ---");
        funcionario.exibirInformacoes();

        sc.close();
    }
}
