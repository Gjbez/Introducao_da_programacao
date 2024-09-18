import java.text.DecimalFormat;
import java.util.Scanner;

public class Unid6Exe09 {
    public Unid6Exe09() {

        Scanner s = new Scanner(System.in);

        int respostas[] = new int[30];
        int sexo[] = new int[30];
        int nota[] = new int[30];
        int idade[] = new int[30];

        System.out.println("Pesquisa de avaliação do cinema");
        for (int i = 0; i < respostas.length; i++) {
            System.out.println(i + 1 + "º ENTREVISTADO");
            System.out.println("Qual seu sexo? (1- feminino, 2-masculino)");
            sexo[i] = s.nextInt();
            if (sexo[i] < 1 || sexo[i] > 2) {
                System.out.println("Por favor digite um valor válido");
                i--;
            } else {
                System.out.println("De 0 a 10 qual sua nota para o cinema? ");
                nota[i] = s.nextInt();
                if (nota[i] < 0 || nota[i] > 10) {
                    System.out.println("Por favor digite um valor válido");
                    i--;
                } else {
                    System.out.println("Qual sua idade? ");
                    idade[i] = s.nextInt();
                    if (sexo[i] == 1) {

                    }
                }

            }
        }

        int menor = Integer.MAX_VALUE;
        int notaMMaisJovem = 0;
        float somaNota = 0;
        float somaNotaH = 0;
        int contagem = 0;

        for (int i = 0; i < respostas.length; i++) {
            somaNota += nota[i];

            if (sexo[i] == 2) {
                somaNotaH += nota[i];
            }
            if (sexo[i] == 1) {
                if (idade[i] < menor) {
                    menor = idade[i];
                    notaMMaisJovem = nota[i];
                }
            }
            if (sexo[i] == 1 && idade[i] > 50) {
                if (nota[i] > somaNota / respostas.length) {
                    contagem++;
                }
            }
        }

        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Nota média recebida pelo cinema: " + df.format(somaNota / respostas.length));
        System.out.println("A nota média atribuida pelos homens é: " + df.format(somaNotaH / respostas.length));
        System.out.println("A nota da mulher mais jovem é " + notaMMaisJovem);
        System.out.println(
                "As mulheres acima de 50 anos que deram nota superior a média recebida pelo cinema é: " + contagem);

        s.close();
    }

    public static void main(String[] args) {
        new Unid6Exe09();
    }

}