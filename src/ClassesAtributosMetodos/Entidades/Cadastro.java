package ClassesAtributosMetodos.Entidades;

public class Cadastro {
    private String nome;
    private String cargo;
    private int nivelDeAcesso;


    public Cadastro(String nome, String cargo, int nivelDeAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public void alteracaoDeCargo(String novoCargo, int novoNivel) {
        this.cargo = novoCargo;
        this.nivelDeAcesso = novoNivel;
    }

    public void exibirInformacoes() {
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Cargo: %s%n", cargo);
        System.out.printf("Nível de acesso: %d%n", nivelDeAcesso);
    }
}
