package ClassesAtributosMetodos.Classes;

public class Saldo {
    public  double valor;

    public Saldo(double valor) {
        this.valor = valor;
    }

    public void exibir(){
        System.out.printf("Saldo Atual: R$%.2f%n", valor);
    }

    public void zerar(){
        valor = 0;
    }
}
