import java.util.Scanner;

public class exc8 {
    public exc8() {

        /*Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:

         escreva o menor valor negativo;
         escreva a média dos números positivos.
         */ 

         Scanner o = new Scanner(System.in);
         System.out.println("Digite a quantidade de números a ser informado");
         int n = o.nextInt();

        float nnegativo = 0;
        float med = 0;
        float numerador = 0;

        for (int quantidade = 0; quantidade < n ; quantidade++) {
            System.out.println("Digite um numero: ");
            float numero = o.nextInt();

            if (numero < 0) 
            {
                nnegativo = numero;
            } 
            numerador += numero;

        }
        med = numerador/n;
        System.out.println("menor valor negativo: " + nnegativo);
        System.out.println("a media dos numeros descritos acima é: " + med);    
        o.close();
    }

    public static void main(String[] args) {
        new exc8();
    }
}
