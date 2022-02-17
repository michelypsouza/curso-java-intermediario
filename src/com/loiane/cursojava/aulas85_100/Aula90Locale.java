package com.loiane.cursojava.aulas85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

    public static void main(String[] args) {

        //dd/MM/yyyy
        //MM/dd/yyyy

        //1.000,02
        //1,000.02

        Locale locale = Locale.getDefault();

        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale loc : locales) {
            System.out.println("Nome: "+loc.getDisplayName());
            System.out.println("Código da língua: "+loc.getLanguage());
            System.out.println("Língua: "+loc.getDisplayLanguage());
            System.out.println("País: "+loc.getDisplayCountry());
            System.out.println("------------------------");
        }

        Locale en = new Locale("en");
        System.out.println(en);
        Locale.setDefault(en);
        System.out.println(Locale.getDefault());

        Locale br = new Locale("pt","Brazil");
        System.out.println(br);
        Locale.setDefault(br);
        System.out.println(Locale.getDefault());

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(5000000000d));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(5000000000d));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(nf.format(5000000000d));

    }

}
