import java.util.Scanner;

public class ex5 {
    public ex5(){ 
        
        /*Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”,
        caso a resposta seja true, ou “Não”, caso seja false.Para resolver este problema pode se utilizar do algoritmo 
        descrito no fluxograma: */

        Scanner o = new Scanner(System.in);
      System.out.println("A cor é azul?");
        boolean resposta = o.nextBoolean();
          
       
       if ( resposta) {
        System.out.println("sim");
       } else {
        System.out.println("não");
       }
       o.close();
    }
    public static void main(String[] args) {
        new ex5();
    }
}


