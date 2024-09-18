import java.util.Scanner;

public class exc30 {
    /*
     * Implemente o problema da mochila. Tendo-se uma sequência
     * decrescente de números inteiros positivos que inicia em N,
     * com decremento inteiro positivo
     * K, deseja-se empacotá-los em uma mochila com tamanho M, de
     * forma que se coloque dentro dela preferencialmente os maiores
     * valores, até que ela esteja cheia. N e K são inteiros e devem
     * ser definidos pelo usuário. Faça um algoritmo que imprima:
     * 
     * os elementos a serem colocados na mochila;
     * os elementos que entraram na mochila;
     * os que ficaram fora da mochila;
     * qual é a soma dos elementos que entraram na mochila;
     * qual a soma dos elementos que não entraram na mochila.
     */
    public exc30() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para iniciar a sequência (N):");
        int n = sc.nextInt();
        while (n < 0) {
            System.out.println("Valor incorreto: número deve ser maior que 0");
            System.out.println("Digite um número para iniciar a sequência (N):");
            n = sc.nextInt();
        }

        int k = 0;
        do {
            System.out.println("Digite o decremento (K):");
            k = sc.nextInt();
            if (k < 0) {
                System.out.println("Valor incorreto: número deve ser maior que 0");
        }
        } while (k < 0);

        int m = 0;
        do {
            System.out.println("Digite o tamanho da mochila (M):");
            m = sc.nextInt();
        } while (m < 0);

        String elementosNaMochila = "";
        String elementosForaMochila = "";
        int somaMochila = 0;
        int somaForaMochila = 0;

        System.out.print("Os elementos a serem colocados na mochila são: ");
        while (n > 0) {
            System.out.print(n + " ");
            n -= k;
            
            if (m > 0) {
                elementosNaMochila += n + ", ";
                somaMochila += n;
                m--;
            } else {
                elementosForaMochila += n + ", ";
                somaForaMochila += n;
            }
        }

        System.out.println("Elementos na mochila: " + elementosNaMochila);
        System.out.println("Soma da mochila: " + somaMochila);
        System.out.println("Não couberam na mochila: " + elementosForaMochila);
        System.out.println("Soma fora da mochila: " + somaForaMochila);

        sc.close();
    }
        public static void main(String[] args) {
        new exc30();
    }
}