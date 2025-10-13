package ClassesAtributosMetodos.Classes;

import java.util.Locale;

public class Temperatura {
    public String setor;
    private double temperaturaAtual;

    public Temperatura(String setor, double temperaturaAtual) {
        this.setor = setor;
        this.temperaturaAtual = temperaturaAtual;
    }

    public void exibirTemperatura(){
        Locale.setDefault(Locale.US);

        System.out.println("Sensor no local: " + setor);
        System.out.printf("Temperatura: %.1fºC%n", temperaturaAtual);

        if (temperaturaAtual >= 37.5){
            System.out.printf("Alerta: Temperatura acima do limite!%n");
        }
        System.out.println();
    }

    public String getSetor() {
        return setor;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }
}
