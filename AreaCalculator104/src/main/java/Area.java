import java.util.Scanner;

public class Area {
    Scanner s = new Scanner(System.in);
    String userInput;
    Boolean shouldBreak = true;
    boolean playAgain;

    public void start(){

            System.out.println("1) Circle\n" +
                    "2) Rectangle\n" +
                    "3) Square\n" +
                    "4) Triangle\n" +
                    "5) Quit\n" +
                    "Which shape:");

            userInput = s.nextLine();

            switch (userInput) {
                case "1":
                    System.out.println("Radius\n");
                    int radius = Integer.parseInt(s.nextLine());
                    area_circle(radius);
                    break;
                case "2":
                    System.out.println("length\n");
                    int length = Integer.parseInt(s.nextLine());
                    System.out.println("width\n");
                    int width = Integer.parseInt(s.nextLine());
                    area_rectangle(length, width);
                    break;
                case "3":
                    System.out.println("Side\n");
                    int side = Integer.parseInt(s.nextLine());

                area_square(side);
                    break;
                case "4":
                    System.out.println("base\n");
                    int base = Integer.parseInt(s.nextLine());
                    System.out.println("height\n");
                    int height = Integer.parseInt(s.nextLine());
                area_triangle(base, height);
                break;
                case "5":
                    shouldBreak = false;
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Please choose options 1-5!\n");
            }


    }

    public  double area_circle(int radius){
        double area = 0;
        area = Math.PI * (Math.pow(radius, 2));
        System.out.println(area + System.lineSeparator());
        wouldYouLikeToPlayAgain();
        return area;

    }
    public int area_rectangle(int length, int width){
        int area = 0;
        area = length * width;
        System.out.println(area + System.lineSeparator());
        wouldYouLikeToPlayAgain();
        return area;

    }
    public int area_square(int side){
        int area = 0;
        area = side << 2;
        System.out.println(area + System.lineSeparator());
        wouldYouLikeToPlayAgain();
        return area;
    }
    public double area_triangle(int base, int height){
        double area = 0;
        area = 0.5 * (base * height);
        System.out.println(area + System.lineSeparator());
        wouldYouLikeToPlayAgain();
        return area;

    }

    public void wouldYouLikeToPlayAgain(){
        if(playAgain == true){
            start();
        }
    }
}
