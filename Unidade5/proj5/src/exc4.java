import java.util.Scanner;

public class exc4 {
    public exc4() {

        //Descreva um algoritmo para calcular o valor de S dado por:
        //S= 3/2 + 5/6 + 7/12 + 9/20 + 11/30 +...
        //Considere os 20 primeiros termos da série.

        double s = 0;
        int numerador = 3;
        double denominador = 2;
        int auxiliar = 2;
        for (int i = 1; i <= 20; i++) {
            System.out.println(numerador + "/" + denominador);
            s += (numerador/denominador);

            numerador += 2;
            auxiliar += 2;
            denominador += auxiliar;
            
        }
        System.out.println("Soma = " + s);
    }


    public static void main(String[] args) {
        new exc4();
    }
}
