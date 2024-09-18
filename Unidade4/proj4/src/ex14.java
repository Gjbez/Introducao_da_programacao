import java.util.Scanner;

public class ex14 {
    public ex14(){
        
        /*Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, e se o dia existe naquele mês.
         Note que fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos. */

        Scanner o = new Scanner(System.in);

       System.out.println("Digite o dia");
        int dia = o.nextInt();
        System.out.println("Digite o mês");
        int mes = o.nextInt();
        System.out.println("Digite o ano");
        int ano = o.nextInt();

    
       if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0  ) { 
       
        System.out.println("valida");

       } if (mes == 1 || mes == 3){

        System.out.println("Valida");

       }if (mes != 2 && dia < 31){

       System.out.println("Valida");

       }if ( mes == 2 && dia < 29){

        System.out.println("Valida");

       }if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)){

       System.out.println("Valida");

       }else {

        System.out.println("não valida");
       }
       o.close();
    }
    public static void main(String[] args) {
        new ex14();
    }
}
