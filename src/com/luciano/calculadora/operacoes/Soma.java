package com.luciano.calculadora.operacoes;

import com.luciano.calculadora.interfaces.Operacoes;

public class Soma implements Operacoes {
    @Override
    public double executar(double x, double y) {
        return x + y;
    }

    @Override
    public String getNome() {
        return "Soma";
    }

}
