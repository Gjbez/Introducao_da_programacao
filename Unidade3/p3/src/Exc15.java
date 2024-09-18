import java.util.Scanner;

public class Exc15 {
    public Exc15(){

        /*Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
         * 
         * X centena(s)  Y dezena(s) K unidade(s)  
         * 
         *  Exemplo, se for submetido o número 384, o programa deverá exibir:
         * 
         * 3 centena(s)  8 dezena(s) 4 unidade(s)  
         * 
         * Analise:ok
         * Entrada: ler numero inteiro de 3 digitos
         * Saida: formato em centena dezena e unidade
         * Processo
         * Teste1:
         */
     
         Scanner ct = new Scanner(System.in);

         System.out.println("Digite numero inteiro de 3 digitos");
         int it = ct.nextInt();
          
         int vc = (it/100);
         int vd = (it/10)%100;
         int vu = (it)%10;

         System.out.println("Valor de centena: " + vc);
         System.out.println("valor de dezena: " + vd);
         System.out.println("valor de unidade: " + vu);
         ct.close();
    }
    public static void main(String[] args) {
        new Exc15();
    }
}


