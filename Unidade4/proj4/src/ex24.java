import java.util.Scanner;

public class ex24 {
  public ex24() {

    /*
     * Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem
     * a partir de um menu de opções:
     * 
     * se opção = 1, escreva os 3 valores em ordem crescente
     * se opção = 2, escreva os 3 valores em ordem decrescente
     * se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
     */

    Scanner o = new Scanner(System.in);
    System.out.println("digite 3 valores: ");
    int v1 = o.nextInt();
    int v2 = o.nextInt();
    int v3 = o.nextInt();

    System.out.println(
        "digite '1' para escrver valores em ordem crescente,'2' para decrescente,'3' para que o maior valor fique no meio");
    int resposta = o.nextInt();

    int maior = 0;
    int menor = 0;
    int medio = 0;

    if (v1 > v2 && v1 > v3) {

      maior = v1;

    } else if (v2 > v3) {

      maior = v2;

    } else {

      maior = v3;

    }

    if (v1 < v2 && v1 < v3) {

      menor = v1;

    } else if (v2 < v3) {

      menor = v2;

    } else {

      menor = v3;
    }

    if (v1 < v2 && v1 > v3 || v1 > v2 && v1 < v3) {

      medio = v1;

    } else if (v2 < v1 && v2 > v3 || v2 > v1 && v2 < v3) {

      medio = v2;

    } else if (v3 < v1 && v3 > v2 || v3 > v1 && v3 < v2) {

      medio = v3;

    }
    switch (resposta) {
      case 1: System.out.println("ordem crescente:" + menor +" "+ medio + " " + maior);
        break;
      case 2: System.out.println("Ordem descrescente: " + maior +" "+ medio +" "+ menor);
        break;
      case 3: System.out.println("maior valor aparece no meio: " + menor +" "+ maior +" "+ medio);
        break;

    }
    o.close();
  }

  public static void main(String[] args) {
    new ex24();
  }
}
