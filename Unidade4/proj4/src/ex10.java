import java.util.Scanner;

public class ex10 {
    public ex10(){
        
        /* Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as idades dos filhos e
         exibir quem é o caçula da família; suponha que não haja empates.*/

        Scanner o = new Scanner(System.in);
 
       System.out.println("idade de Marquinhos: ");
        int i1 = o.nextInt();
        System.out.println("idade de Zezinho: ");
        int i2 = o.nextInt();
        System.out.println("idade de Luluzinha: ");
        int i3 = o.nextInt();

       if (i1 <= i2 && i1 <= i3) {
         System.out.println("Marquinhos é o caçula");

       } else if (i2 <= i1 && i2 <= i3) {
        System.out.println("Zezinho é o caçula");
       } else if (i3 <= i1 && i3 <= i2) {
        System.out.println("Luluzinha é a caçula");
       }
       
       o.close();
    }
    public static void main(String[] args) {
        new ex10();
    }
}
