import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    Scanner s = new Scanner(System.in);
    String userInput;
    int playerCard1 = dealingCard();
    int playerCard2 = dealingCard();
    int dealerCard1 = dealingCard();
    int dealerCard2 = hitCard();
    int dealerCardTotal = dealerCard1 + dealerCard2;
    int hitCard = hitCard();
    int secondHitCard = hitCard();
    int firstHandTotal = playerTotal(playerCard1, playerCard2);
    int secondHandTotal;
    int thirdHandTotal;
    int forthHandTotal;
    int fifthHandTotal;
    int thirdHitCard = hitCard();
    int forthHitCard = hitCard();

    boolean wouldYouLikeToHit = false;
    public void start(){
        System.out.println("Welcome to Frank and Akshay's BlackJack Game!!");


        System.out.println("You get a "+ playerCard1 + " and a "+ playerCard2 + System.lineSeparator());
        System.out.println("Your total is " + firstHandTotal);
        System.out.println("The dealer has a "+ dealerCard1+ " showing, and a hidden card");
        System.out.println("Would you like to stay or hit?");
        userInput = s.nextLine().toLowerCase();

        if(userInput.equals("hit")) {
            hitMe();
            hitOrStay();
            userInput = s.nextLine();
            if(wouldYouLikeToHit == true && userInput.equals("hit")){
                secondHitMe();
                hitOrStay();
                userInput = s.nextLine();
                if(wouldYouLikeToHit == true && userInput.equals("hit")){
                    thirdHitMe();
                    hitOrStay();
                    userInput = s.nextLine();
                    if(wouldYouLikeToHit == true && userInput.equals("hit")){
                        forthHitMe();
                        hitOrStay();
                        userInput = s.nextLine();
                    }else{
                        System.out.println("Store player total and do dealer logic after player hits third time");
                    }
                }else{
                    System.out.println("Store player total and do dealer logic after player hits second time");
                }
            }else{
                System.out.println("Store player total and do dealer logic after player first hit");
            }
            System.out.println("Player total is "+ fifthHandTotal +" and do dealer logic after player forth hit");
        }else{
            System.out.println("player logic");
        }

        if(userInput.equals("stay") && wouldYouLikeToHit == false){
            System.out.println("Okay, dealer's turn.");
            System.out.println("His hidden card was " + dealerCard2 + " his original was " + dealerCard1);
            System.out.println("His total was " + dealerCardTotal );

            if(dealerCardTotal <= 17){
                System.out.println("The dealer decides to hit");
                int showDealerCard = hitCard();
                dealerCardTotal += showDealerCard;
                System.out.println("The hit card was " + showDealerCard);
                System.out.println("His total is " + dealerCardTotal);
                if(dealerCardTotal <= 17){
                    System.out.println("the dealer decides to hit again");
                    showDealerCard = hitCard();
                    dealerCardTotal += hitCard();
                    System.out.println("His hit card was " + showDealerCard);
                    System.out.println("His total is " + dealerCardTotal);
                }
            }
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
        thirdHandTotal = secondHitCard +secondHandTotal;
        wouldYouLikeToHit = false;
    }
    public void thirdHitMe(){
        System.out.println("you drew a " + thirdHitCard);
        System.out.println("your total is " + (thirdHitCard + thirdHandTotal));
        forthHandTotal = thirdHitCard + thirdHandTotal;
        wouldYouLikeToHit = false;
    }

    public void forthHitMe(){
        System.out.println("you drew a " + forthHitCard);
        System.out.println("your total is " + (forthHitCard + forthHandTotal));
        fifthHandTotal = forthHitCard + forthHandTotal;
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
