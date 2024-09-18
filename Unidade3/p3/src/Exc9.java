import java.util.Scanner;

public class Exc9 {
    public Exc9(){

        /*Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
        volume=II*raio^2*altura
         Quantas casas decimais devo usar para o número Pi?
         * 
         * 
         * Analise:ok
         * Entrada:ler pi e formula
         * Saida:valor do calculo
         * Processo
         * ler pi
         * ler raio
         * ler altura
         * formula do volume
         * escrever valor do calculo
         * Teste1:
         * pi=3,1
         * raio=2
         * altura=3
         * volume= 3,3*2^2*3
         * valor=39,9
         */
     
         Scanner vl = new Scanner(System.in);

         System.out.println("digite valor de pi: ");
         double p = vl.nextDouble();
         System.out.println("digite valor de raio: ");
         double raio = vl.nextDouble();
         System.out.println("digite valor de altura: ");
         double altura = vl.nextDouble();

         double volume = p * (raio*raio) * altura;

         System.out.println("valor do volume: " + volume);

         vl.close();
    }
    public static void main(String[] args) {
        new Exc9();
    }
}
