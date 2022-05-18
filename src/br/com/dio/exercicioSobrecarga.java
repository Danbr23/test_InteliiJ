package br.com.dio;

public class exercicioSobrecarga {

    public static void main(String []args){

        calcularAreaQuadrados(5);
        calcularAreaQuadrados(4,10);
        calcularAreaQuadrados(10,5,7);

    }

    public static void calcularAreaQuadrados(double lado){
        System.out.println(lado * lado);
    }

    public static void calcularAreaQuadrados(double lado1, double lado2){
        System.out.println(lado1 * lado2);
    }

    public static void calcularAreaQuadrados(double baseMaior, double baseMenor, double altura){
        System.out.println(((baseMaior+baseMenor)*altura)/2);

    }
}
