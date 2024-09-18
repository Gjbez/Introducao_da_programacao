import java.util.Scanner;

public class exc7 {
    public exc7() {

        /*
         * Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base
         * neste valor, crie um vetor do tipo inteiro. Em seguida, solicite ao usuário
         * para digitar um número inteiro várias vezes, até preencher o vetor. Esse
         * número deverá ser armazenado no vetor caso ainda não exista, e se o valor já
         * existir deve ser pedido um novo valor. Isto é, se o usuário informar o número
         * 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser
         * adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo
         * deve ser ordenado. Para isso reordene os elementos internos do vetor de modo
         * que este fique em ordem crescente, conforme no exemplo:
         * 
         * Vetor origem: [0][4][2][6][3]
         * Vetor ordenado: [0][2][3][4][6]
         * 
         * Crie um método para inserir os valores no vetor, outro para ordenar o vetor e
         * outro para informar o vetor resultante. Para "método ordenar" se pode usar o
         * "método bolha"
         */

        int[] v = new int[20];

        Scanner o = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("Digite o tamanho do vetor: ");
            n = o.nextInt();
        } while (n >= 20);
        float numeros[] = new float[n];

        popular(numeros, o);
        bolha(numeros);
        impri(numeros);


        o.close();
    }

    private void popular(float[] vetor, Scanner leitor) {
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print("Digite um número inteiro [" + posicao + "]: ");
            float c = leitor.nextFloat();
        
            while( comparar(c, vetor)){
                System.out.println("iguais,digite outro número:");
                c = leitor.nextFloat();
            }
            vetor[posicao] = c;
        }
    }

    private boolean comparar(float n, float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                return true;
            }
        }
        return false;

    }

    private void bolha(float[] v) {
        for (int j = 0; j < v.length-1; j++) {
        for (int i = 0; i < v.length -1-j; i++) {
            if (v[i] > v[i + 1]) {
                float bolha = v[i];
                v[i] = v[i + 1];
                v[i+1] = bolha;
                i = 0;
            } else {i = i + 1;}
        }
    }
    }

    private void impri(float[] vetor){
    System.out.println("ordem crescente:");
      for(int j = 0; j < vetor.length; j++){
        System.out.println(vetor[j]);
    
      }
      
    }

    public static void main(String[] args) {
        new exc7();
    }
}
