
public class exc2 {
    public exc2 (){

        //Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.

        int somaPar = 0;
        int somaimpar = 0;

        for (int n = 1; n < 100; n++) {
           
            System.out.println(n);
            if (n % 2 == 0) {
                somaPar += n;
            } else {
                somaimpar += n;   
            }
        }
            System.out.println("Soma dos pares = " + somaPar);
            System.out.println("Soma dos impares = " + somaimpar);

    }

    public static void main(String[] args) {
        new exc2();
    }
}
