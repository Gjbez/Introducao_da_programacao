import java.util.Scanner;

public class ex16 {
    public ex16(){
        
        /*Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre 
        serão diferentes). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades 
        do homem mais novo com a mulher mais velha.*/

        Scanner o = new Scanner(System.in);

       System.out.println("idade de homem 1");
          int h1 = o.nextInt();
          System.out.println("idade de homem 2");
          int h2 = o.nextInt();
       System.out.println("idade da mulher 1");
          int f1 = o.nextInt();
          System.out.println("idade da mulher 2");
          int f2 = o.nextInt();

       
        int homi = Math.max(h1, h2);
        int muie = Math.min(f1, f2);
        int soma = homi + muie;
        int homi2 = Math.min(h1, h2);
        int muie2 = Math.max(f1, f2);
        int mult = homi2 * muie2;
        System.out.println("soma das idades: " + soma);
        System.out.println("produto das idades: " + mult);


       
       
       o.close();
    }
    public static void main(String[] args) {
        new ex16();
    }
}
