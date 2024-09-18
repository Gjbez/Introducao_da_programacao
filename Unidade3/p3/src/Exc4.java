import java.util.Scanner;

public class Exc4 {
 
    public Exc4(){

    //Faça um programa para ler
    // três notas de um aluno em uma disciplina e imprimira sua média ponderada 
    //(as notas tem pesos respectivos de 5, 3 e 2).

    /*
     * Analise: ok
     * Entradas 3 notas
     * Saida: média
     * Processo:
     * ler nota1
     * ler nota2
     * ler nota3
     * media = (nota1 * 5 + nota2 * 3 + nota3 * 2)/10
     * 
     * Teste1:
     * nota1=8
     * nota2=8
     * nota3=8
     * media=8
     * 
     * Teste2:
     * nota1=7
     * nota2=6
     * nota3=8
     * media=6,9
     */
    
    Scanner pg = new Scanner(System.in);

    System.out.println("Digite nota1 ");
    double nota1 = pg.nextDouble();
    System.out.println("Digite nota2 ");
    double nota2 = pg.nextDouble();
    System.out.println("Digite nota3 ");
    double nota3 = pg.nextDouble();

    double media = (nota1*0.5) + (nota2*0.3) + (nota3*0.2);
    
    System.out.println("media do aluno: " + media);

    pg.close();
    }

public static void main(String[] args) {
    new Exc4();
}
}