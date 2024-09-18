
        import java.util.Scanner;

public class exc31 {
    public exc31() {

        /*
         * Dado um número inteiro positivo, determine a sua decomposição em fatores
         * primos. A saída do programa deve ser semelhante ao exemplo abaixo:
         * 
         * número decomposição
         * 180 2
         * 90 2
         * 45 3
         * 15 3
         * 5 5
         * 1
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("Digite um número inteiro positivo:");
         int numero = sc.nextInt();
 
         int decompositor = 2;
 
         System.out.println("Decompositores do número: \nNúmero | Decomposição");
         while (numero != 1) {
             if (numero % decompositor == 0) {
             System.out.println(numero + " | " + decompositor);
             numero = numero / decompositor;
         } else{
         decompositor += 1;
         }
         }
 
 
         sc.close();
     }
    public static void main(String[] args) {
        new exc31();
    }
}
