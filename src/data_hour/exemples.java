package data_hour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class exemples {
    public static void main(String[] args) {

        // criando um padrão (pattern) de dana e hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now(); // data atual do pc

        LocalDateTime d02 = LocalDateTime.now(); // data e hora atual do pc

        Instant d03 = Instant.now(); // data e hora atual global

        LocalDate d04 = LocalDate.parse("2025-07-24"); // texto para tipo data (ISO)

        LocalDateTime d05 = LocalDateTime.parse("2025-07-24T01:30:26"); // texto para tipo data e hora (ISO)

        Instant d06 = Instant.parse("2025-07-24T01:30:26Z"); // texto para tipo data (ISO) com fuso horário

        Instant d07 = Instant.parse("2025-07-24T01:30:26-03:00"); // texto para tipo data (ISO) com fuso horário (1:30 - 3hrs)

        LocalDate d08 = LocalDate.parse("24/07/2025", formatter);

        LocalDateTime d09 = LocalDateTime.parse("24/07/2025 01:30", formatter2);

        LocalDate d10 = LocalDate.of(2025, 7, 24);

        LocalDateTime d11 = LocalDateTime.of(2024, 7,24, 1, 30);

        System.out.println("D01 = " + d01);
        System.out.println("D02 = " + d02);
        System.out.println("D03 = " + d03);
        System.out.println("D04 = " + d04);
        System.out.println("D05 = " + d05);
        System.out.println("D06 = " + d06);
        System.out.println("D07 = " + d07);
        System.out.println("D08 = " + d08);
        System.out.println("D09 = " + d09);
        System.out.println("D10 = " + d10);
        System.out.println("D11 = " + d11);

        System.out.println();
        // outras formas de usar o formatter
        System.out.println("d4 = " + d04.format(formatter));
        System.out.println("d4 = " + formatter.format(d04));
        System.out.println("d4 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // formatter nos instant (hora global)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        Instant d12 = Instant.parse("2025-07-24T01:30:26Z");
        System.out.println("d12 = " + formatter3.format(d12));


    }
}
