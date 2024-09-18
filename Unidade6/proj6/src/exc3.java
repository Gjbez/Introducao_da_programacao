import java.util.Scanner;

public class exc3 {
    public exc3() {

        /*
         * Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
         * 12 posições do tipo real. Em seguida, modifique o vetor de modo que os
         * valores das posições ímpares sejam aumentados em 5% e os das posições pares
         * sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler
         * os valores, outro para ajustar os valores dentro do vetor e outro para
         * escrever os valores atualizados do vetor.
         */

         double[] v = new double[12];

        Scanner o = new Scanner(System.in);

        ler(o, v);
        alterar(v);
        imprimir(v);


        o.close();
    }
    public void ler(Scanner o, double[] v){
        for (int n = 0; n < v.length; n++) {
            System.out.print("Digite um número (" + n + "): ");
            v[n] = o.nextInt(); 
        } 
    }
    public double[] alterar(double[] v){
        for (int n = 0; n < v.length; n++) { 
           
            if (v[n] % 2 == 0) {
                v[n] = v[n] + (v[n] * 0.02);
            } else {
                v[n] = v[n] + (v[n] * 0.05); 
            }
        }
        return v;
    }

    public void imprimir(double[] v){
        for (int n = 0; n < v.length; n++) {
        System.out.println(v[n]);
        }
    }

    public static void main(String[] args) {
        new exc3();
    }
}
