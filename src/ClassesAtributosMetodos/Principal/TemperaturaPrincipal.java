package ClassesAtributosMetodos.Principal;

import ClassesAtributosMetodos.Entidades.Temperatura;
import java.util.Locale;

public class TemperaturaPrincipal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        Temperatura sensor1 = new Temperatura("Setor A", 39.2);
        Temperatura sensor2 = new Temperatura("Setor B", 35.8);
        Temperatura sensor3 = new Temperatura("Setor C", 38.5);

        sensor1.exibirTemperatura();
        sensor2.exibirTemperatura();
        sensor3.exibirTemperatura();

    }
}
