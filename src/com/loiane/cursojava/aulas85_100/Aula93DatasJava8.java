package com.loiane.cursojava.aulas85_100;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasJava8 {

    public static void main(String[] args) {

        // data dd MM yyyy apenas para data
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2022,2,1));
        System.out.println(LocalDate.parse("2022-02-01"));
        //System.out.println(LocalDate.parse("2022-13-01"));

        System.out.println(agora.plusDays(30));

        System.out.println(agora.minus(1, ChronoUnit.MONTHS));

        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfYear());
        System.out.println(agora.getDayOfWeek());

        System.out.println(agora.isLeapYear());
        System.out.println(LocalDate.parse("2020-02-01").getDayOfWeek());

        // apenas para horario
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);

        System.out.println(LocalTime.of(20,18));
        System.out.println(LocalTime.parse("20:18"));

        System.out.println(hAgora.plusMinutes(60));
        System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));

        System.out.println(hAgora.getHour());

        // data completa = data + hora
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        System.out.println(LocalDateTime.of(2020,2,17,18,55));
        System.out.println(LocalDateTime.parse("2022-02-17T18:56:09"));
        System.out.println(agoraCompleto.plusYears(20));

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

//        Set<String> fusos = ZoneId.getAvailableZoneIds();
//        for (String f : fusos) {
//            System.out.println(f);
//        }

        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2022-02-17T18:56:09"),sp);
        System.out.println(zdt);
        System.out.println(ZonedDateTime.parse("2022-02-17T18:56:09-03:00[America/Sao_Paulo]"));

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println(offsetdt);

        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
        System.out.println(ldtDate);

        System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));

    }

}
