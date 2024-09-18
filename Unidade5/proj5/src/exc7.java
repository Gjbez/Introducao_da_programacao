import java.util.Scanner;

public class exc7{
    public exc7() {

        //Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.

           float menor = Float.MAX_VALUE; //maior número possível
        float maior = Float.MIN_VALUE;  //menor número possível
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a quantidade de números a ser informado: ");
        int n = s.nextInt();

        for (int quantidade = 0; quantidade < n; quantidade++) {
            System.out.print("Digite o número: ");
            float numero = s.nextFloat();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior número é " + maior + " e o Menor número é " + menor);
        s.close();
    }

    /*Scanner entrada = new Scanner(System.in);
        double numero = 0;
        double maior = 0;
        double menor = 0;

             System.out.println("Digite a quantidade de numeros a ser informado: ");
             int quantidade = entrada.nextInt();

        for (int contador = 1; contador < quantidade; contador++) {
             System.out.println("Digite um numero aleatorio: ");
             numero = entrada.nextDouble();

             if (contador == 1) {
                maior = numero;
                menor = maior;
             } else if (numero > maior) {
                maior = numero;
             } else if (numero < menor) {
                menor = numero;
             }
        }
        System.out.println("O menor valor é: " + menor + ". O maior valor é: " + maior);
        entrada.close();
    
    } */

    public static void main(String[] args) {
        new exc7();
    }
}
