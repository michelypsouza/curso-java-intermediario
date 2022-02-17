package com.loiane.cursojava.aulas75_84;

public class Aula82 {

    public static void main(String[] args) {

        String alfabeto = String.join(", ", "A","B","C","D");
        System.out.println(alfabeto);
        System.out.println();

        String[] letras = alfabeto.split(", ");
        for (String letra : letras) {
            System.out.println(letra);
        }
        System.out.println();

        String doArquivo = "1;Antônio;30;";
        String[] infos = doArquivo.split(";");
        for (String info: infos) {
            System.out.println(info);
        }
        System.out.println();

        Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]),
                infos[1], Integer.parseInt(infos[2]));
        System.out.println(pessoa);

    }

}
