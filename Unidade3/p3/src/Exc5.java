import java.util.Scanner;

public class Exc5 {

    public Exc5(){
    
/*Uma granja possui um controle automatizado de cada frango da sua produção. 
No pé direito do frango há um anel com um chip de identificação; 
no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50,
faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.

* Analise:ok
 * Entrada: numero de galinhas e aneis
 * Saida: preço
* Processo
ler numero de galinhas
ler numero de aneis
preço anel1
preço anel2
custo = n de galinhas * (anel1+anl2)
 *escrever valor a ser pago
*/

   Scanner auto = new Scanner(System.in);

   System.out.println("Digite o número de frangos ");
   int frangos = auto.nextInt();
   
   double anelc = 4.00;
   double aneli = 3.50*2;

   double custo = frangos * (anelc + aneli);

    System.out.println("O custo total é de R$" + custo);
   
   auto.close();
    }
    public static void main(String[] args) {
        new Exc5();
    }
}


