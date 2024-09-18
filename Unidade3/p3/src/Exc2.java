import java.util.Scanner;

public class Exc2 {
    public Exc2(){
        
    /*Análise: ok
     Entradas:valor do sapato
     Saída:valor do desconto, valor final do sapato
    Testes:
    Algoritmo:
    ler valorSapato
    desconto = (valorSapato * (12/100f) => desconto = (valorSapato * (12/100.0))
    valorFinal = valorSapato - desconto
    escrever valor do desconto é de R$ desconto
    escrever preço do par de sapatos com desconto é R$ valorFinal
    */ 
     Scanner desc = new Scanner(System.in);

     System.out.println("Digite valor do sapato");
     double valorSapato = desc.nextDouble();
     double desconto = (valorSapato * (12/100f));
     double valorFinal = valorSapato - desconto;

    System.out.println("valor do desconto é de R$:" + desconto); 
    System.out.println(" preço do par de sapatos com desconto é R$" + valorFinal);

     desc.close();   
    }
    public static void main(String[] args){
        new Exc2();
    }
}
