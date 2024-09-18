import java.util.Scanner;

public class exc1 {
    public exc1(){

         /*
     * Descreva um algoritmo que leia 10 números inteiros e os coloque
     * em um vetor
     * de 10 posições do tipo inteiro. Escreva na ordem inversa em que
     * foram lidos.
     * Faça um método para ler e outro para escrever.
     * 
     */
     
     int[] v = new int[10];
     int tamanho = 10;
     v = lervetor(tamanho);
     escrever(v);

     Scanner o = new Scanner(System.in);

     o.close();
    }

    public int[] lervetor(int tamanho){
        Scanner e = new Scanner(System.in);
        int[] vetor = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
        System.out.println("Digite valor [" + i + "]");
        vetor[i] = e.nextInt();
        }
        e.close();
        return vetor;
    }

    public void escrever(int[]vetor){
        for(int i = vetor.length -1; i>=0; i--){
        System.out.println(vetor[i] + " ");
        }
    }

    public static void main(String[] args) {
        new exc1();
    }
    
}
