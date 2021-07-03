import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        fizzbuzz();
    }

    public static int fizzbuzz(){
        Scanner s = new Scanner(System.in);
        System.out.println("What number bitch");
        int i =Integer.parseInt(s.nextLine());
        for( int j = 1; j <= i; j++){
            if(j  % 3 == 0 && j % 5 == 0){
                System.out.println("FizzBuzz");
            }else if( j % 3 == 0){
                System.out.println("Fizz");
            }else if(j % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(j);
            }
        }
        return i;
    }
}
