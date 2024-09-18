

public class exc3 {
    public exc3() {

        //Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
        // 1/1 + 1/2 + 1/3 + 1/4 ... 1/100
        

        float soma = 0;

        for (int i = 1; i < 100; i++) {
            soma = soma + 1f/1;
            System.out.println("1/"+ i + ", ");
        }
        System.out.println();
        System.out.println("Soma = " + soma);
        
    }

    public static void main(String[] args) {
        new exc3();
    }
}
