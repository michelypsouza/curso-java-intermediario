package com.loiane.cursojava.aula56.exercicio;

import java.util.Arrays;
import java.util.List;

public enum OperacaoMatematica {

    SOMA('+') {
        @Override
        public Double executarOperacao(Double... variaveis) {
            List<Double> listaVariaveis = converterParaLista(variaveis);
            Double resultado = 0.0;
            for (Double var : listaVariaveis) {
                int indice = listaVariaveis.indexOf(var);
                resultado = (indice == 0) ? var : resultado + var;
            }
            return resultado;
        }
    }, SUBTRACAO('-') {
        @Override
        public Double executarOperacao(Double... variaveis) {
            List<Double> listaVariaveis = converterParaLista(variaveis);
            Double resultado = 0.0;
            /*
            for (int i = 0; i < listaVariaveis.size(); i++) {
                Double var = listaVariaveis.get(i);
                if (i == 0) {
                    resultado = var;
                } else {
                    resultado = resultado - var;
                }
            }
            */
            for (Double var : listaVariaveis) {
                int indice = listaVariaveis.indexOf(var);
                resultado = (indice == 0) ? var : resultado - var;
            }
            return resultado;
        }
    }, MULTIPLICACAO('*') {
        @Override
        public Double executarOperacao(Double... variaveis) {
            List<Double> listaVariaveis = converterParaLista(variaveis);
            Double resultado = 0.0;
            for (Double var : listaVariaveis) {
                int indice = listaVariaveis.indexOf(var);
                resultado = (indice == 0) ? var : resultado * var;
            }
            return resultado;
        }
    }, DIVISAO('/') {
        @Override
        public Double executarOperacao(Double... variaveis) {
            List<Double> listaVariaveis = converterParaLista(variaveis);
            Double resultado = 0.0;
            for (Double var : listaVariaveis) {
                int indice = listaVariaveis.indexOf(var);
                resultado = (indice == 0) ? var : resultado / var;
            }
            return resultado;
        }
    };

    private final char simbolo;

    OperacaoMatematica(char simbolo) {
        this.simbolo = simbolo;
    }

    public abstract Double executarOperacao(Double... variaveis);

    @Override
    public String toString() {
        return String.valueOf(this.simbolo);
    }

    private static List<Double> converterParaLista(Double... variaveis) {
        return Arrays.asList(variaveis);
    }
}
