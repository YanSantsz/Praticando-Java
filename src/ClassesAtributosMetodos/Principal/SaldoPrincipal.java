package ClassesAtributosMetodos.Principal;
import ClassesAtributosMetodos.Classes.Saldo;
import java.util.Locale;

public class SaldoPrincipal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Saldo conta = new Saldo(1500.20);

        conta.exibir();
        conta.zerar();
        conta.exibir();
    }
}
