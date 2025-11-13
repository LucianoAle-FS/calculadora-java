package com.luciano.calculadora.controller;

import com.luciano.calculadora.interfaces.Operacoes;
import com.luciano.calculadora.operacoes.*;
import java.util.HashMap;
import java.util.Map;

public class OperacaoMatematica {
    // Cria a Tabela chave-Valor
    private static Map<String, Operacoes> operacoes = new HashMap<>();

    static {
        Operacoes[] lista = {new Soma(), new Subtracao(), new Multiplicacao(), new Divisao()};
        // Faremos o registro aqui no Map
        for (Operacoes op : lista) {
            operacoes.put(op.getSimbolosMatematico(), op);
        }
    }

    public static Operacoes getOperacao(String simbolo) {
        Operacoes operacao = operacoes.get(simbolo);
        if (operacao == null) {
            throw new IllegalArgumentException("Operação inválida: " + simbolo);
        }
        return operacao;
    }
}