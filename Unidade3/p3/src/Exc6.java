import java.util.Scanner;

public class Exc6 {

    public Exc6(){

    /*Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente
    (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.
    
    
    * Analise:ok
    * Entrada:peso do prato,preço por kg
    * Saida: valor a ser pago
    * Processo
    ler peso do prato
    ler preço por kg
    valor = peso * preço
    escrever valor a ser pago
    * 
    */

    Scanner ret = new Scanner(System.in);

    System.out.println("Digite peso do prato kg");
    double peso = ret.nextDouble();

    double preço = 25.00 * peso;

    double valor = peso * preço;

    System.out.println("valor a pagar R$" + valor);

    ret.close();

    }
    
    public static void main(String[] args){
        new Exc6();
}
}
