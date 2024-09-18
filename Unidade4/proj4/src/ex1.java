import java.util.Scanner;

public class ex1 {
    public ex1(){

        /*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá 
        hora extra,cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia 
        o número de horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário, que deverá ser acrescido 
        das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/
        
        Scanner o = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês");
        int horasmes = o.nextInt();
        
        System.out.println("Entre com o valor pago por hora");
        float horasvalor = o.nextFloat();
         
        double salariototal = (horasmes*horasvalor);

        if (horasmes > 160) {
            float salarioextra = (horasmes - 160)*(horasvalor/2);
            salariototal += salarioextra;
        }
        System.out.println("O salário total é:" + salariototal);
         
        o.close();
    }
    public static void main(String[] args) {
        new ex1();
    }
}

