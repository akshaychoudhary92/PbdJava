import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    Scanner s = new Scanner(System.in);
    String userInput;
    int playerCard1 = dealingCard();
    int playerCard2 = dealingCard();
    int dealerCard1 = dealingCard();
    int hitCard = hitCard();
    int secondHitCard = hitCard();
    int firstHandTotal = playerTotal(playerCard1, playerCard2);
    int secondHandTotal;

    boolean wouldYouLikeToHit = false;
    public void start(){
        System.out.println("Welcome to Frank and Akshay's BlackJack Game!!");


        System.out.println("You get a "+ playerCard1 + " and a "+ playerCard2 + System.lineSeparator());
        System.out.println("Your total is " + firstHandTotal);
        System.out.println("The dealer has a "+ dealerCard1+ " showing, and a hidden card");
        System.out.println("Would you like to stay or hit?");
        userInput = s.nextLine().toLowerCase();

        if(userInput.equals("hit")){
            hitMe();
            hitOrStay();
            userInput = s.nextLine();
            if(wouldYouLikeToHit == true){
                secondHitMe();
                hitOrStay();
                userInput = s.nextLine();
            }else{
               // do nothing
            };

            System.out.println(wouldYouLikeToHit);
        }else{
            System.out.println("didnt work");
        }

    }

    public int dealingCard(){
        Random rand = new Random();
        int hand1 = rand.nextInt(11)+1;
        return hand1;
    };

    public int hitCard(){
        int hit = 0;
        for(int i = 0; i <1; i++){
        Random rand = new Random();
         hit = rand.nextInt(11)+1;
        }
        return hit;
    }

    public int hitMe() {
        int testing = 0;
        System.out.println("you drew a " + hitCard);
        System.out.println("your total is " + (hitCard + firstHandTotal));
        secondHandTotal = hitCard + firstHandTotal;
        return testing;
    }

    public void secondHitMe(){

        System.out.println("you drew a " + secondHitCard);
        System.out.println("your total is " + (secondHitCard + secondHandTotal));
        wouldYouLikeToHit = false;

    }

    public int playerTotal(int hand1, int hand2){
        int playTotal = hand1 + hand2;
        return playTotal;
    }

    public void hitOrStay(){
        System.out.println("Would you like to stay or hit?");
        if(userInput.equals("hit")){
            wouldYouLikeToHit = true;
        }else{
            wouldYouLikeToHit = false;
        }

    }


}
