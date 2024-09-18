import java.text.DecimalFormat;
import java.util.Scanner;

public class exc22 {
    public exc22() {

        /*Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. 
        Em 1996 recebeu aumento de 1.5%. A partir de 1997, os aumentos sempre correspondem 
        ao dobro do ano anterior. Faça programa que determine o salário atual do funcionário.
         */
  
         float ano = 1996;
         double salario = 2000;
         double aumento = salario * 1.5f / 100;
 
         while (ano < 2024) {
             salario = salario + aumento;
             aumento = aumento * 2;
             ano++;
         }
 
         System.out.println("O salário atual do funcionario é de: R$ " + salario);
 
     }
        public static void main(String[] args) {
        new exc22();
    }
}
