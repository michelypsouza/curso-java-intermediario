package com.loiane.cursojava.aula74.exercicio;

import java.util.Scanner;

public class Semaforo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de variação do semáforo: ");
        int qtde = scanner.nextInt();

        ThreadSemaforo semaforo = new ThreadSemaforo();

        for (int i = 0; i < qtde; i++) {
            System.out.println(semaforo.getCor());
            semaforo.aguardarAlteracaoDeCor();
        }
        semaforo.parar();

    }

}
