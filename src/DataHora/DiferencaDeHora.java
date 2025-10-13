package DataHora;
import java.time.Duration;
import java.time.LocalTime;


public class DiferencaDeHora {
    public static void main(String[] args) {

        LocalTime inicio = LocalTime.of(14, 30);
        LocalTime fim = LocalTime.of(16, 45);

        Duration duracao = Duration.between(inicio, fim);

        long hora = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;

        System.out.println("Diferença de tempo: " + hora + " horas e " + minutos + " minutos");
    }
}
