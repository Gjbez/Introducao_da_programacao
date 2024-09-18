import java.util.Scanner;

public class Exc14{
    public Exc14(){

        /*Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista 
          durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, 
          sabendo que o automóvel faz 12 km por litro.
         * 
         * 
         * Analise:ok
         * Entrada:distancia e tempo,12km litro
         * Saida:velocidade media e combustivel gasto
         * Processo
         * ler deslocamento1
         * ler deslocamento2
         * ler tempo1
         * ler tempo2
         * velocidade media= dl2-dl1/tp2-tp1
         * vl=12*velocidade media
         * escrever valor
         * Teste1:
         */
     
         Scanner mt = new Scanner(System.in);

         System.out.println("digite valor de deslocamento1: ");
         double dl = mt.nextDouble();
         System.out.println("digite valor de deslocamento2: ");
         double dl2 = mt.nextDouble();
         System.out.println("digite numero de tempo1:  ");
         double tp = mt.nextDouble();
         System.out.println("digite numero de tempo2:  ");
         double tp2 = mt.nextDouble();

         double X = dl2 - dl;
         double t = tp2 - tp;
         double vel = X/t;
         double vl = 12;
         double l = vel * vl;

         System.out.println("velocidade média: " + vel + " combustivel gasto: " + l);

         mt.close();
    }
    public static void main(String[] args) {
        new Exc14();
    }
}