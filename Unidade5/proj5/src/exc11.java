import java.text.DecimalFormat;
import java.util.Scanner;

public class exc11 {
    public exc11() {

        /*Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito,
        na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos
         quebrados na hora anterior, e assim por diante. Faça um algoritmo que calcule quantos biscoitos são 
         quebrados no final de cada dia (a máquina opera 16 horas por dia).
         */ 


         int prod = 1;
         int somaprod = 1;
        
        System.out.println("hora[1] " + somaprod);
        for (int hora = 1; hora < 16; hora++) {
            prod *=3;
            somaprod += prod;

        System.out.println("hora[" + (hora + 1) + "]" + somaprod);
    }
}

    public static void main(String[] args) {
        new exc11();
    }
}
