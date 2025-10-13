package DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiferencaDeDatas {
    public static void main(String[] args) {

        LocalDate dataInicio = LocalDate.now();
        LocalDate dataFinal = dataInicio.plusDays(15);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String inicioFormatado = dataInicio.format(formatador);
        String finalFormatado = dataFinal.format(formatador);

        System.out.println("Data do pedido: " + inicioFormatado);
        System.out.println("Data de entrega: " + finalFormatado);
    }
}
