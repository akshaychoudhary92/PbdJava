import java.util.Random;
import java.util.Scanner;

public class PickCup {
    public void start(){
        Scanner s = new Scanner(System.in);
        int playerAnwser = shuffle();



        //I need 3 random numbers
//            int x = rand.nextInt(4) + 1;





        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.");


        System.out.println("");

        System.out.println("Which one is the Ace?");

        System.out.println("## ## ##");
        System.out.println("## ## ##");
        System.out.println("1  2  3");


        Integer a = s.nextInt();

        if(playerAnwser == a && a == 1){
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            System.out.println("");
            System.out.println("AA ## ##");
            System.out.println("AA ## ##");
            System.out.println("1  2  3");
        }else if(playerAnwser == a && a == 2){
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            System.out.println("");
            System.out.println("## AA ##");
            System.out.println("## AA ##");
            System.out.println("1  2  3");
        }else if(playerAnwser == a && a == 3){
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            System.out.println("");
            System.out.println("## ## AA");
            System.out.println("## ## AA");
            System.out.println("1  2  3");
        }else{
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + playerAnwser);
            if(playerAnwser == 1){
                System.out.println("AA ## ##");
                System.out.println("AA ## ##");
                System.out.println("1  2  3");
            }else if(playerAnwser == 2){
                System.out.println("## AA ##");
                System.out.println("## AA ##");
                System.out.println("1  2  3");
            }else{
                System.out.println("## ## AA");
                System.out.println("## ## AA");
                System.out.println("1  2  3");
            }
        }




    }

    public Integer shuffle(){
        Random rand = new Random();
        int x = rand.nextInt(3) + 1;
//        System.out.println(x);
        return x;
    }


}
