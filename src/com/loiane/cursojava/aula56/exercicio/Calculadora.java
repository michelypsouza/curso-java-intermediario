package com.loiane.cursojava.aula56.exercicio;

public class Calculadora {

    public static void main(String[] args) {

        System.out.println("Nova operação com 2 elementos: ");

        double a = 2.0;
        double b = 3.0;

        for (OperacaoMatematica om : OperacaoMatematica.values()) {
            System.out.print(a + " ");
            System.out.print(om.toString() + " ");
            System.out.print(b + " = ");
            System.out.println(om.executarOperacao(a,b));
        }

        System.out.println("Nova operação com 3 elementos: ");

        double x = 6.0;
        double y = 3.0;
        double z = 1.0;

        for (OperacaoMatematica om : OperacaoMatematica.values()) {
            System.out.print(x + " ");
            System.out.print(om.toString() + " ");
            System.out.print(y + " ");
            System.out.print(om + " ");
            System.out.print(z + " = ");
            System.out.println(om.executarOperacao(x,y,z));
        }

    }

}
