
package boletin.pkg2.pkg1;
import java.util.Scanner;
public class Boletin21 {

    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       int billetes100,billetes20,billetes5,monedas1,dinero;
       System.out.println("teclea billetes de 100");
       billetes100=sc.nextInt();
       System.out.println("teclea billetes de 20");
       billetes20=sc.nextInt();
       System.out.println("teclea billetes de 5");
       billetes5=sc.nextInt();
       System.out.println("teclea monedas de 1");
       monedas1=sc.nextInt();
       dinero=billetes100*100+billetes20*20+billetes5*5+monedas1;
       System.out.println("dinero= "+ dinero);
       
      
    
    }
}
