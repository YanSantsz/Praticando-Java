package Encapsulamento.Principal;

import Encapsulamento.Entidades.Contato;

import java.util.ArrayList;

public class ContatoPrincipal {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("João Silva", "(11) 99999-0000"));
        contatos.add(new Contato("Pedro Siqueira", "(11) 88888-0000"));
        contatos.add(new Contato("Caio Barbosa", "(21) 77777-4444"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (Contato agenda : contatos){
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    agenda.getNome(),
                    agenda.getTelefone());
        }
    }
}
