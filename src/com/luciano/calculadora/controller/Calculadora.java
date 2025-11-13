package com.luciano.calculadora.controller;
import com.luciano.calculadora.interfaces.Operacoes;

public class Calculadora {

    public double calcular (Operacoes operacoes, double x, double y){

        System.out.println("Executando a operação de " + operacoes.getNome());
        return operacoes.executar(x, y);
    }


}
