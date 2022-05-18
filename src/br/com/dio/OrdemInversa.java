package br.com.dio;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        int[] vetor = {1,2,3,4,5,4};
        int count=vetor.length-1;
        while(count>=0){
            System.out.println(vetor[count]);
            count--;
        }
    }


}
