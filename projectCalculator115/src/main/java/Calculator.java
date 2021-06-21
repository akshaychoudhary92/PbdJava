import java.util.Scanner;

public class Calculator extends Numeric {
    Scanner s = new Scanner(System.in);
    String a;
    String b;
    String c;
    double x;
    double y;
    double z;

    public void start(){

        System.out.println("<");
        a = s.next();

        z = 0;

        if(Numeric.isNumeric(a) ==true){
            c = s.next();
            x = Double.valueOf(a);
            if(c.equals("+")){
                y = s.nextDouble();
                z = x + y;
                System.out.println(z);
            }
        }else{
            System.out.println("wrong");
        }





    }

}
