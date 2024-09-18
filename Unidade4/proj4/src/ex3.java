import java.util.Scanner;

public class ex3 {
    public ex3(){ 
        
        //Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.
        
        Scanner o = new Scanner(System.in);

       System.out.println("Digite valor inteiro");
        int n = o.nextInt();
      System.out.println("Digite segundo valor inteiro");
        int n2 = o.nextInt();
       
       if ( n < n2 ) {
        System.out.println("o segundo valor maior que primeiro valor");
       } else if (n == n2) {
        System.out.println("são iguais");
       } else {
        System.out.println("o primeiro valor é maior que segundo valor");
       }
       o.close();
    }
    public static void main(String[] args) {
        new ex3();
    }
}


