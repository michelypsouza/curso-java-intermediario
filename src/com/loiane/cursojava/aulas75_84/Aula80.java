package com.loiane.cursojava.aulas75_84;

public class Aula80 {

    public static void main(String[] args) {

        String teste = "Isso é um teste.";

        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10,15));

        String ola = "olá ";
        String mundo = "mundo";
        String olaMundo = ola.concat(mundo); // mesma coisa que = ola + mundo
        System.out.println(olaMundo);

        String espacos = "i s p a ç o";
        String semEspacoes = espacos.replace('i','e');
        System.out.println(semEspacoes);

        semEspacoes = semEspacoes.replaceAll(" ", "");
        System.out.println(semEspacoes);

        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());

        //web services

    }

}
