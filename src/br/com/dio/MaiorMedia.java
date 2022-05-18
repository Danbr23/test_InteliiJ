package br.com.dio;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        int numero;
        int count=0;
        int maior=0;
        int media=0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count+=1;
            if (numero>maior)  maior = numero;
            media+=numero;
        }while(count<5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + media/5);
    }
}
