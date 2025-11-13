package com.luciano.calculadora.operacoes;

import com.luciano.calculadora.interfaces.Operacoes;

public class Subtracao implements Operacoes {

    @Override
    public double executar(double x, double y) {
        return x - y;
    }

    @Override
    public String getNome() {
        return "Subitração";
    }

    @Override
    public String getSimbolosMatematico() {
        return "-";
    }
}
