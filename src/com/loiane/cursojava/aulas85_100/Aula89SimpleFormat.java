package com.loiane.cursojava.aulas85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleFormat {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");

        Calendar data = new GregorianCalendar(2022,3,17,14,30, 22);

        System.out.println(sdf.format(data.getTime()));

        Date hoje = new Date();
        System.out.println(sdf.format(hoje));
        String d = sdf.format(hoje);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "17/02/2022";

        try {
            Date minhaDataEmDate = sdf1.parse(minhaData);
            System.out.println(minhaDataEmDate);
            System.out.println(sdf.format(minhaDataEmDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
