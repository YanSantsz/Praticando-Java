package DataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataHoraAtual {
    public static void main(String[] args) {
        LocalDateTime momentoDaCriacao = LocalDateTime.now();

        LocalDate dataAtual = momentoDaCriacao.toLocalDate();
        LocalTime horaAtual = momentoDaCriacao.toLocalTime();

        System.out.println("Data atual: " + dataAtual);
        System.out.println("Hora atual: " + horaAtual);
    }
}
