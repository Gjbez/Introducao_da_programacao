import java.util.Scanner;
public class if1 {
    public if1(){

    Scanner o = new Scanner(System.in);
     
    int teste = o.nextInt();
    int resto = teste % 2;

    //se não tem resto é par
    if (resto == 0) {
    // if (condição) {
        //comandos que funcionarão somente se for verdadeiro
        System.out.println("numero é par");
    }   

    // se tem resto é impart
    if (resto !=0) { //<> => !=
       System.out.println("número é impar");   
    }

    boolean tdengue = o.nextBoolean();

    //se o teste for verdadeiro é dengue
    if (tdengue) { //XXXXXXif (tdengue == true)XXXXXX
        System.out.println("tá com dengue");
    }

    if (!tdengue) { //tdengue == false
         System.out.println("não é dengue");
    }

    o.close();
    }
     public static void main(String[] args){
        new if1();
     }
    }

