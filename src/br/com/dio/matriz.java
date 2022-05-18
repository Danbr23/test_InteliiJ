package br.com.dio;

import java.util.Random;

public class matriz {
    public static void main(String []args){
        Random rand = new Random();
        int[][] m = new int[4][4];

        for(int i=0;i<=m.length-1;i++){
            for(int j=0;j<=m.length-1;j++){
                m[i][j] = rand.nextInt(9);
            }
        }
        for(int[] i:m){
            for(int j:i){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
