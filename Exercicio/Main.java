package Exercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1,n2,n3,média,temp,mm;
        int contador;
        temp=0;
        contador=0;
        while ( contador < 1000){

            System.out.print("\n\nAluno "+contador);

            System.out.print("\nNota 01:");
            n1=ler.nextInt();
            System.out.print("\nNota 02:");
            n2=ler.nextInt();
            System.out.print("\nNota 03:");
            n3=ler.nextInt();

            média=(n1+n2+n3)/3;
            System.out.print("Sua média é:"+média);

            if (média>6){
                System.out.print("\nAprovado\n");
            } else if (média>=4) {
                System.out.print("\nRecuperação\n");
            }else if (média<4){
                System.out.print("\nReprovado!\n");
            }

            temp=temp+média;

            contador= contador+1;
            mm=(temp)/contador;
            System.out.print("A média da média dos alunos é:"+mm);
        }

    }
}




