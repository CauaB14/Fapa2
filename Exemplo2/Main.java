package Exemplo2;
import javax.swing.JOptionPane;
import java.util.Scanner;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;// INT 4 bytes e dobuble
        double numero_real, total;
        String nome;

        System.out.print("Digite um nome: ");
        nome = ler.nextLine();


       System.out.print("Digite um numero: ");
        numero = ler.nextInt();

        System.out.print("Digite um numero real: ");
       numero_real = ler.nextDouble();


        total = numero + numero_real;


        System.out.println("\nNumero: " + numero +" \nNumero Real: " + numero_real + "\nNome: "+ nome + "\nTotal: " + total);


    }
}
