import java.text.DecimalFormat;
import java.util.Scanner;

public class exc6 {
    public exc6() {

        // Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

        Scanner o = new Scanner(System.in);


        float media = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite altura da pessoa : ");
            int n = o.nextInt();
            media = media + n;
        }
        System.out.println("média = " + media/20);
        
        o.close();
    }

    public static void main(String[] args) {
        new exc6();
    }
}
