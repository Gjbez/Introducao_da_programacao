import java.util.Scanner;

public class ex2 {
    public ex2(){    

        /*Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
        Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma 

        entrada: numero
        saida: tem casa decimal ou não
        processo:
         */

        Scanner o = new Scanner(System.in);

       System.out.println("entre com um valor maior que 0: ");
        int v = o.nextInt();
      
       if ( v % 2 == 0) {
        System.out.println("numero é par");
       } else {
        System.out.println("número é ímpar");
       }
       o.close();
    }
    public static void main(String[] args) {
        new ex2();
    }
}


