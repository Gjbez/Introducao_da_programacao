import java.util.Scanner;

public class ex19 {
    public ex19(){
        
        /* */

        Scanner o = new Scanner(System.in);

       System.out.println("X= ");
        int x = o.nextInt();
       System.out.println("Y= ");
        int y = o.nextInt();


       if (x == 0 && y == 0 ) {
        
        System.out.println("Quadrante 0");

       } else {
       

       } if (x > 0 && y < 0) {
       
       System.out.println("Quadrante 1");

      } else {
        

      } if (x < 0 && y < 0 ) {

      System.out.println("Quadrante 2");
     
      } else {
        

      }if (x < 0 && y > 0) {

      System.out.println("Quadrante 3");

      } else {
        System.out.println("Quadrante 4");
      }
       o.close();
}  
    public static void main(String[] args) {
        new ex19();
    }
}
