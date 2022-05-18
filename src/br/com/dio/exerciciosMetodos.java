package br.com.dio;

import java.util.Scanner;
public class exerciciosMetodos {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = scan.nextDouble();

        calculadora(x,y,1);
        calculadora(x,y,2);
        calculadora(x,y,3);
        calculadora(x,y,4);

    }

    public static void calculadora(double n1, double n2, int operacao){

        if (operacao == 1){
            System.out.println("Soma: " + (n1 + n2));
        }

        if (operacao == 2){
            System.out.println("Subtração: " + (n1 - n2));
        }

        if (operacao==3){
            System.out.println("Multiplicação: " + (n1 * n2));
        }

        if (operacao==4){
            System.out.println("Divisão: " + (n1 / n2));
        }


    }

}
