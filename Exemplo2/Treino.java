package ProjetoNatação;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double[] tempos = new double[];
        double soma = 0,melhorTempo, piorTempo;
        //marca os tempos do atleta

        System.out.println("Digite os tempos do nadador");
        for(int i= 0; i<10; i++){
            System.out.printf("Tempo %d:",i+1);
            tempos[i] = sc.nextDouble();

        }
        sc.close();
        piorTempo= tempos [0];
        melhorTempo= tempos [0];
        for(int i= 0; i<10; i++){
            soma +=tempos[i];
            if (tempos[i] > melhorTempo){
                melhorTempo= tempos [i];
            }
             if (tempos[i] < piorTempo){
                piorTempo= tempos[i];
            }
        } double média = soma /10;
        System.out.println("************\nResultado do treino\n**********");
        System.out.printf("Média dos tempos: %.2f segundos%n", média);
        System.out.printf("Melhor tempo: %.2f segundos%n", melhorTempo);
        System.out.printf("Pior Tempo: %.2f segundos%n", piorTempo);

    }
    //calcular a média



}
