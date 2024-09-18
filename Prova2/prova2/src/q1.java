import java.util.Scanner;

public class q1 {
    public q1() {

        /*
         * Você é um aventureiro que possui uma mochila com capacidade limitada de carga
         * informada oelo usuário. Você deseja levar a maior quantidade de itens
         * possíveis na mochila,sem exceder a capacidade máxima.Cada item possui um peso
         * (int) e um valor (String).Faça uma solução em java utilizando vetores
         * unidimensionais,seguindo os seguintes métodos
         */

        Scanner o = new Scanner(System.in);

        System.out.println("digite quantos itens sua mochila consegue carregar:");
        int m = o.nextInt();
        int[] vet = new int[m];
        System.out.println("Quanto ela consegue carregar?(kg):");
        int c = o.nextInt();
        int n = 0;

        do {
            System.out.println("seleciona uma opção:");
            System.out
                    .println(" 1.inserir\n 2.imprimir\n 3.valor mais pesado\n 4.ordenar\n 5.excluir item\n6.finalizar");
            n = o.nextInt();

            switch (n) {
                case 1:
                   inserir(o, vet, c);

                    break;

                case 2:
                    imprimirMochila(vet, n);
                    break;

                case 3:
                    valoritemMaisPesado(vet, n);
                    break;

                case 4:
                    ordenarMochila(vet, n);
                    break;

                case 5:
                    System.out.print("Digite um número para excluir: ");
                    int r = o.nextInt();
                    int tamanho = excluir(vet, r, n);
                    if (tamanho != -1) {
                        n = tamanho;
                        System.out.println("Número excluído");
                    } else {
                        System.out.println("Número inválido");
                    }

                    break;

                case 6:
                    System.out.println("fim");

                default:
                    System.out.println("número inválido");
                    break;
            }
        } while (n != 6);

        o.close();
    }

    public int[] inserir(Scanner o, int[] vet, int c) {

        int qdt = 0;

        for (int i = 0; i < vet.length; i++) {

            System.out.println("digite o nome do item:");
            String nome = o.next();
            System.out.println("Digite seu peso:");
            int peso = o.nextInt();

            qdt += 1;

            if ( vet[i] < qdt) {
                System.out.println("mochila cheia");
                System.out.println();
                System.out.println(nome + " " + peso);
            }
        }
        return vet;

    }

    public void imprimirMochila(int[] vet, int tamanho) {
        int inv = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int x = 0; x < i; x++) {
                inv = vet[i];
                vet[i] = vet[x];
                vet[x] = inv;
            }
        }System.out.println(inv);
    }

    public int valoritemMaisPesado(int[] vet, int itens) {
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < vet.length; i++) {
            if (itens < maior) {
                maior = itens;
            }
        }
        return itens;
    }

    public void ordenarMochila(int[] vet, int tamanho) {
        int a = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < i; j++) {

                a = vet[i];
                vet[i] = vet[j];
                vet[j] = a;
            }
        }
    }

    private int excluir(int[] vetor, int numero, int tamanho) {
        int indice = pesquisar(vetor, numero, tamanho);
        if (indice != -1) {
            for (int i = indice; i < tamanho - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            tamanho--;
            return tamanho;
        } else {
            return -1;
        }
    }

    private int pesquisar(int[] vetor, int numero, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new q1();
    }
}
