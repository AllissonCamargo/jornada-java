package data_hour;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calc_local_dates {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");


        // operações com dia/mes e hora
        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        LocalDate plusYearsLocalDate = d01.plusYears(7);


        System.out.println("operações com dia e mes (LocalDate)");
        System.out.println();
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("plusYearsLocalDate = " + plusYearsLocalDate);
        System.out.println();


        System.out.println("operações com dia, mes e hora (LocalDateTime)");

        System.out.println();
        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
        LocalDateTime plusYearsLocalDateTime = d02.plusYears(7);
        LocalDateTime plusHoursLocalDateTime = d02.plusHours(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("plusYearsLocalDateTime = " + plusYearsLocalDateTime);
        System.out.println("plusHoursLocalDateTime = " + plusHoursLocalDateTime);
        System.out.println();
        System.out.println("operações com data global (Instant)");
        System.out.println();

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);


        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        System.out.println();

        // descobrindo duração de uma data até a outra

        // não é possível comparar duas dates LocalDate,
        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
        // forma de usar com LocalDate:
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay()); // começa a contar como se fosse meia noite


        System.out.println("T1 dias = " + t1.toDays());
        System.out.println("T2 dias = " + t2.toDays());



    }
}
