import java.util.Scanner;

public class Exc13{
    public Exc13(){

        /*Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
         Faça um programa para ler o comprimento e altura de uma parede (em metros),
         e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.
         * 
         * 
         * Analise:ok
         * Entrada: comprimento e altura,9 azulejo por m2
         * Saida: valor a ser pago
         * Processo
         * ler comprimento
         * ler altura
         * ler azul= 9*12,50
         * area= (comp*alt)*azul
         * escrever valor a ser pago
         * Teste1:
         */
     
         Scanner azu = new Scanner(System.in);

         System.out.println("Digite comprimento: ");
         double cp = azu.nextDouble();
         System.out.println("Digite altura: ");
         double al = azu.nextDouble();
        
         double azul = 12.50;

         double area = cp*al;
         
         double m2 = 9*azul;
        
         double valor = area*m2;

         System.out.println("valor de gato:" +valor);

         azu.close();
    }
    public static void main(String[] args) {
        new Exc13();
    }
}