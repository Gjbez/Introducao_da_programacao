import java.util.Scanner;

public class Exc10 {
    public Exc10(){

        /*Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e
          calcule o comprimento da hipotenusa.Fórmula:
          hipotenusa^2=cateto1^2 + cateto^2
         * 
         * 
         * Analise:ok
         * Entrada: ler catetos e formula
         * Saida:calcular hipotenuza
         * Processo
         *ler cat1
         ler cat2
        formula = hip^2=cat1^2 + cat2^2
         ler fm = hip*hip
         escrever valor
         * Teste1:
         */
     
         Scanner cp = new Scanner(System.in);

         System.out.println("digite valor de cateto1: ");
         double cat1 = cp.nextDouble();
         System.out.println("digite valor de cateto");
         double cat2 = cp.nextDouble();

         double hip = (cat1*cat1) + (cat2*cat2);

         double fm = hip*hip;
         
         System.out.println("valor da hipo: " + fm);

         cp.close();
    }
    public static void main(String[] args) {
        new Exc10();
    }
}
