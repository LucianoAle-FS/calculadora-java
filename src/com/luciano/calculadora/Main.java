package com.luciano.calculadora;

import com.luciano.calculadora.controller.Calculadora;
import com.luciano.calculadora.controller.OperacaoMatematica;
import com.luciano.calculadora.interfaces.Operacoes;
import com.luciano.calculadora.operacoes.Divisao;
import com.luciano.calculadora.operacoes.Multiplicacao;
import com.luciano.calculadora.operacoes.Soma;
import com.luciano.calculadora.operacoes.Subtracao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora metodo = new Calculadora();
        Scanner dadoDeEntrada = new Scanner(System.in);

        System.out.println("CALCULADORA DO LULU");
        System.out.println("--------------------");

        System.out.println(" Informe o Primeiro Número: ");
        double x = dadoDeEntrada.nextDouble();

        System.out.println(" Informe o Segundo Número: ");
        double y = dadoDeEntrada.nextDouble();

        System.out.println("Escolha a operação Digitando -> (+, -, *, /): ");
        String op = dadoDeEntrada.next();

        try {
            Operacoes simboloDaOperacao = OperacaoMatematica.getOperacao(op);
            double resultant = metodo.calcular(simboloDaOperacao, x, y);
            System.out.println("Resultado da operação : " + resultant);

            System.out.println("--------------------");

        } catch (IllegalArgumentException e) {
            System.out.println("Operação inválida! Digite um dos símbolos: +, -, * ou /");

        } finally {
            dadoDeEntrada.close();
        }

    }
}