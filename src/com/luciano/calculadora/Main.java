package com.luciano.calculadora;

import com.luciano.calculadora.controller.Calculadora;
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

        // no java precisa iniciar a variavel
        double resultado = 0;

        switch (op) {
            case "+":
                resultado = metodo.calcular(new Soma(), x,y);
                break;
            case "-":
                resultado = metodo.calcular(new Subtracao(), x,y);
                break;
            case "*":
                resultado = metodo.calcular(new Multiplicacao(), x,y);
                break;
            case "/":
                resultado = metodo.calcular(new Divisao(), x,y);
                break;
            default:
                System.out.println("Operação inválida!");
                System.exit(0);
        }

        System.out.println("Resultado da operação : " + resultado);

        System.out.println("--------------------");

        dadoDeEntrada.close();

    }
}