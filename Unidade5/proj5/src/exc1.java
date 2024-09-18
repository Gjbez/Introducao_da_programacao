

public class exc1 {
    public exc1() {

        // Descreva um algoritmo que leia 20 números inteiros e escreva, para cada
        // número lido, se o mesmo é par ou ímpar.

        
        for (int quantidade = 0; quantidade <= 20; quantidade++) {
            

            System.out.println(quantidade);
            
            if (quantidade % 2 == 0) {
                System.out.println("par");
            } else {
                System.out.println("impar");
            }

            
        }
      
    }

    public static void main(String[] args) {
        new exc1();
    }
}
