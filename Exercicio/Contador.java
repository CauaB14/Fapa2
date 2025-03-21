package Exercicio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        int contador,quantidade;
        System.out.print("\nDigite a quantidade de repetições: ");
        quantidade=ler.nextInt();
        contador = 0;
        while (contador < quantidade){
            System.out.print("\nOlá mundo!");
            contador=contador+1;
        }


    }
}
