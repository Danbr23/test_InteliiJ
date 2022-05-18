package br.com.dio.model;

import java.util.Scanner;

public class NomeEIdade {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        int idade=0;
        String nome;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }


    }

}
