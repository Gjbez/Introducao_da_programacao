import java.util.Scanner;

public class exc2 {

    public exc2() {
        Scanner o = new Scanner(System.in);
        /*
         * Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
         * 12 posições do tipo real. Imprima quais valores desses informados são maiores
         * que a média dos valores. Faça um método para ler os valores, outro para
         * calcular a média e outro para informar os valores maiores que a média.
         */

        float valores[] = new float[12];
        int tamanho = 12;

        valores = ler(o, tamanho);
         media(valores, tamanho);
        
        o.close();
    }
    public float[] ler(Scanner o, int tamanho ){
        float[] vetor = new float[tamanho];
        for(int i = 0; i < 11; i++){
            System.out.println("digite ["+i+"]");
            vetor[i] = o.nextFloat();
        }
        return vetor;
    }

    public void media(float[] valores, int tamanho){
        int soma = 0;
        for(int i = 0; i < 11; i++){
            soma += valores[i];
        }
        int media = soma / tamanho;
        for(int i = 0; i < 11; i++){
            if(valores[i] > media){
                float maior = valores[i];
                System.out.println( maior);
            }
            
        } 
        System.out.println("media: " + media);
    }

    public static void main(String[] args) {
        new exc2();
    }

}