import java.util.Scanner;

public class Exc16 {
    public Exc16(){

        /*Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. 
        Considerando que alguém está pagando uma compra, faça um programa que 
        determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. 
        Escreva também o número de cada tipo de nota a ser fornecido como troco.
        Suponha que o sistema monetário não utilize centavos.
         * 
         * 
         * Analise:ok
         * Entrada: notas de 3 tipos e quantidades diferentes
         * Saida: quantidade minimo de cada nota
         * Processo
         * ler n nt1
         * ler n nt2
         * ler n nt3
         * escrever quantidade e valor de cada nota
         * Teste1:
         */
     
         Scanner nt = new Scanner(System.in);

         System.out.println("digite valor final da compra: R$");
         int vf = nt.nextInt();
         System.out.println("digite valor que dispoem: R$");
         int valor = nt.nextInt();
         
         int vltrc1 = (valor - vf);
         int valorC = (vltrc1/100);
         vltrc1 -=valorC*100;
         int valorD = (vltrc1/10);
         vltrc1 -= valorD*10;
         int vU = (vltrc1/1);
         vltrc1 -= vU*1;
         int vT = (valorC+valorD+vU);

         int vlrt2 = (valor - vf);
         int notas100 = (vlrt2/100);
         vlrt2 -= notas100*100;
         int notas10 = (vlrt2/10);
         vlrt2 -= notas10*10;
         int notas1 = (vlrt2/1);
         vlrt2 -= notas1*1;
         
         System.out.println("O número minimo de notas que o caixa deve oferecer como troco é: " + vT);
         System.out.println("o número de notas R$100,00 a ser fornecido como troco é: " + notas100);
         System.out.println("o número de notas R$10,00 a ser fornecido como troco é: " + notas10);
         System.err.println("o número de notas R$1,00 a ser fornecido como troco é: " + notas1);

         nt.close();
    }
    public static void main(String[] args) {
        new Exc16();
    }
}