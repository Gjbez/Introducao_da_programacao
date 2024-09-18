import java.util.Scanner;

public class Exc11 {
    public Exc11(){

        /*Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
         * °F = (9/5) °C + 32
         * 
         * Analise:ok
         * Entrada: informe temp em C
         * Saida: valor em F
         * Processo
         * ler c
         * double f = (9*c)/5 + 32
         * escrever valor em F
         * Teste1:
         */
     
         Scanner prog = new Scanner(System.in);

         System.out.println("temperatura em celsius");
         double c = prog.nextDouble();

         double f = (9* c)/5 + 32;

         System.out.println("Temperatura: " + f + " F");

         prog.close();
    }
    public static void main(String[] args) {
        new Exc11();
    }
}
