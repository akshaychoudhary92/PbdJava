import java.util.Random;
import java.util.Scanner;

public class PickCup {
    public void start() {
//        int winCount = 0;
//        int lossCount = 0;

        Scanner s = new Scanner(System.in);
        String input;

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                    "He glances at you out of the corner of his eye and starts shuffling.\n" +
                    "He lays down three cards.");

        System.out.println("");


do{
    System.out.println("do you wanna play?");
    input = s.nextLine();
    if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yea")) {

        System.out.println("Which one is the Ace?");

        System.out.println("## ## ##");
        System.out.println("## ## ##");
        System.out.println("1  2  3");


        int a = Integer.parseInt(s.nextLine());

    int playerAnwser = shuffle();
    playGame(playerAnwser, a);


    }else{
        System.out.println("see ya");
        break;
    }
        }while(true);


    }






























        public Integer shuffle(){
            Random rand = new Random();
            int x = rand.nextInt(3) + 1;
//        System.out.println(x);
            return x;
        }

        public Integer playGame(int playerAnwser, int a){
            int winCount = 0;
            int lossCount = 0;
            if (playerAnwser == a && a == 1) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.println("");
                System.out.println("AA ## ##");
                System.out.println("AA ## ##");
                System.out.println("1  2  3");
                 winCount++;
            } else if (playerAnwser == a && a == 2) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.println("");
                System.out.println("## AA ##");
                System.out.println("## AA ##");
                System.out.println("1  2  3");
                winCount++;
            } else if (playerAnwser == a && a == 3) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.println("");
                System.out.println("## ## AA");
                System.out.println("## ## AA");
                System.out.println("1  2  3");
                winCount++;
            } else {
                System.out.println("Ha! Fast Eddie wins! The ace was card number " + playerAnwser);
                if (playerAnwser == 1) {
                    System.out.println("AA ## ##");
                    System.out.println("AA ## ##");
                    System.out.println("1  2  3");
                    lossCount++;
                } else if (playerAnwser == 2) {
                    System.out.println("## AA ##");
                    System.out.println("## AA ##");
                    System.out.println("1  2  3");
                    lossCount++;
                } else {
                    System.out.println("## ## AA");
                    System.out.println("## ## AA");
                    System.out.println("1  2  3");
                    lossCount++;
                }
            }
//            System.out.println("you have won " + winCount + " games");
//            System.out.println("You have lost " + lossCount + " games");
            return a;
        }
}
