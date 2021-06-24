import java.util.Random;
import java.util.Scanner;

public class PickCup {

    Scanner s = new Scanner(System.in);
    String input;
    boolean playAgain;

    public void startverb(){
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.");

        System.out.println("");

    }

    public void start() {
//        int winCount = 0;
//        int lossCount = 0;





    System.out.println("do you wanna play?");
    input = s.nextLine().toLowerCase();
    if (input.equals("yes")) {

        System.out.println("Which one is the Ace?");

        System.out.println("## ## ##");
        System.out.println("## ## ##");
        System.out.println("1  2  3");


        int a = Integer.parseInt(s.nextLine());

    int playerAnwser = shuffle();
    playGame(playerAnwser, a);


    }else{
        System.out.println("see ya");

    }





    }

    public void wouldyouliketoplayagain(){
            if(input.equals("yes")){
                playAgain = true;
                start();
            }else{
                playAgain = false;
            }
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
                 wouldyouliketoplayagain();
            } else if (playerAnwser == a && a == 2) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.println("");
                System.out.println("## AA ##");
                System.out.println("## AA ##");
                System.out.println("1  2  3");
                winCount++;
                wouldyouliketoplayagain();
            } else if (playerAnwser == a && a == 3) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.println("");
                System.out.println("## ## AA");
                System.out.println("## ## AA");
                System.out.println("1  2  3");
                winCount++;
                wouldyouliketoplayagain();
            } else {
                System.out.println("Ha! Fast Eddie wins! The ace was card number " + playerAnwser);
                if (playerAnwser == 1) {
                    System.out.println("AA ## ##");
                    System.out.println("AA ## ##");
                    System.out.println("1  2  3");
                    lossCount++;
                    wouldyouliketoplayagain();
                } else if (playerAnwser == 2) {
                    System.out.println("## AA ##");
                    System.out.println("## AA ##");
                    System.out.println("1  2  3");
                    lossCount++;
                    wouldyouliketoplayagain();
                } else {
                    System.out.println("## ## AA");
                    System.out.println("## ## AA");
                    System.out.println("1  2  3");

                    lossCount++;
                    wouldyouliketoplayagain();
                }
            }
//            System.out.println("you have won " + winCount + " games");
//            System.out.println("You have lost " + lossCount + " games");
            return a;
        }
}
