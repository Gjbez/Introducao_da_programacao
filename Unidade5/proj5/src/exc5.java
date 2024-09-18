import java.util.Scanner;

public class exc5 {
    public exc5() {

        // Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência
        // de números:
        // 8,10,16,18,32,34,64...
        // O valor n deve ser lido e deve ser maior do que 2.

        Scanner s = new Scanner(System.in);
        System.out.print("Digite a quantidade de números da sequencia: ");
        int n = s.nextInt();

        if (n > 2) {
             int numero1 = 8;
             int numero2 = 0;
             for (int quantidade = 0; quantidade < (n/2); quantidade++) {
                System.out.print(numero1 + " ");
                numero2 = numero1 + 2;
                System.out.print(numero2 + " ");
                numero1 *= 2;
             }   
         
        }

        s.close();
    }

    public static void main(String[] args) {
        new exc5();
    }
}
