package br.com.dio;

import java.util.Scanner;

public class Nota {

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        do {
            nota = scan.nextInt();
        }while(nota<0 || nota>10);
    }
}
