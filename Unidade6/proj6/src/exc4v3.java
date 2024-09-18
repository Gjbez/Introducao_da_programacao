import java.util.Scanner;

public class exc4v3 {
    public exc4v3() {

        /*
         * Uni6Exe04.java - Faça um programa para ler os valores de dois
         * vetores de
         * inteiros, cada um contendo 10 elementos. Crie um terceiro vetor
         * em que cada
         * elemento é a soma dos valores contidos nas posições respectivas
         * dos vetores
         * originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6]
         * vetor3 = [2,7,9].
         * Exiba, ao final, os três vetores na tela. Faça três métodos:
         * um método para
         * ler valores dos vetores, outro para somar e outro para escrever
         * os vetores.
         */

        Scanner s = new Scanner(System.in);
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        

        ler(s, vetor1);
        ler(s, vetor2);
        int[] v3 = soma(vetor1, vetor2);
        escrever(v3);
        

    
        s.close();
    
    }

    public void ler(Scanner o, int[] v){
        for(int i = 0; i < v.length; i++){
        System.out.println("digite o valor [" + i +"]");
        v[i] = o.nextInt();
        }
    }

    public int[] soma(int[] v, int[] v2){
        int[] v3 = new int[4];
        for(int i = 0; i < v.length; i++){
            v3[i] = v[i] + v2[i];
        }return v3;
    }

    public void escrever(int[] v){
        for(int i = 0; i<v.length; i++){
            System.out.println(v[i]);
        }
    }

    public static void main(String[] args) {
        new exc4v3();
    }

}
