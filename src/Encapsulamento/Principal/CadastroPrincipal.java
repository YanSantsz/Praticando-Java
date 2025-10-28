package Encapsulamento.Principal;

import Encapsulamento.Entidades.Cadastro;

import java.util.Locale;

public class CadastroPrincipal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Cadastro cadastro = new Cadastro("Mouse", 0);
        cadastro.exibirValore();
    }
}
