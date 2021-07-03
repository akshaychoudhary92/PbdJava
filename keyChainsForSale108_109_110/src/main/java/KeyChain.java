import java.util.Scanner;

public class KeyChain {
    int totalKeychains = 0;
    double keychainPriceTotal= 0;
    int keychainprice = 10;
    double salesTax = 8.25;
    double shippingCost = 5.00;
    double perKeychainShippingCost = 1.00;
    Scanner s = new Scanner(System.in);
    String choice;
    boolean playAgain;

    public void introStatement(){
        System.out.println("Ye Olde Keychain Shoppe" + System.lineSeparator());
    }

    public void start(){



        boolean shouldBreak = true;



        System.out.println("1. Add Keychains to Order\n" +
            "2. Remove Keychains from Order\n" +
            "3. View Current Order\n" +
            "4. Checkout");

    System.out.println("");

        System.out.println("Please enter your choice(choose 1 - 4 only): " + System.lineSeparator());
        choice = s.nextLine();



        switch(choice){
            case "1" :
                System.out.println("You have " + totalKeychains + " keychains. How many to add?\n" );
                int addkeychain = Integer.parseInt(s.nextLine());
                add_keychains(addkeychain);

                break;
            case "2":
                System.out.println("you have " + totalKeychains + ". How many to remove?\n");
                int removeKeychain = Integer.parseInt(s.nextLine());
                    remove_keychains(removeKeychain);

                    break;

            case "3" :
                view_order(totalKeychains, keychainPriceTotal, salesTax, shippingCost, perKeychainShippingCost);

                break;
            case "4":
                checkout(totalKeychains, keychainPriceTotal, salesTax, shippingCost, perKeychainShippingCost);
                shouldBreak = false;

                break;
            default:
                System.out.println("Please choose one of the 4 choices thank you!");
        }




    }

    public Integer add_keychains(int addkeychain){
        totalKeychains += addkeychain;
        if(totalKeychains < 0){
            totalKeychains -= addkeychain;
            System.out.println("Your keychain total is less then 0 please try again.\n");
        }else {
            System.out.println("You now have " + totalKeychains + " keychains!\n");
        }
        wouldyouliketoplayagain();
        return totalKeychains;
    }

    public Integer remove_keychains(int removeKeychain){
        totalKeychains -= removeKeychain;
        if(totalKeychains < 0){
            totalKeychains += removeKeychain;
            System.out.println("Your keychain total is less then 0 please try again.\n");
        }else {
            System.out.println("You now have " + totalKeychains + " keychains!\n");
        }
        wouldyouliketoplayagain();
            return totalKeychains;


    }
    public void view_order(int totalKeychains, double keychainPriceTotal, double salesTax, double shippingCost, double perKeychainShippingCost){
        keychainPriceTotal = totalKeychains * keychainprice + salesTax + shippingCost + (perKeychainShippingCost * totalKeychains);
        System.out.println("you have " + totalKeychains + " keychains.");
        System.out.println("keychains cost $" + keychainprice + " each.");
        System.out.println("the sales tax is $" + salesTax);
        System.out.println("the shipping cost is $" + shippingCost + " plus the cost per keychain shipping is $" + perKeychainShippingCost);
        System.out.println("total cost after factoring in sales tax and shipping costs is $" + keychainPriceTotal + ".\n");
        wouldyouliketoplayagain();
    }
    public void checkout(int totalKeychains, double keychainPriceTotal, double salesTax, double shippingCost, double perKeychainShippingCost){
        keychainPriceTotal = totalKeychains * keychainprice + salesTax + shippingCost + (perKeychainShippingCost * totalKeychains);
        System.out.println("what is you name?");
        String name = s.nextLine();
        System.out.println("you have " + totalKeychains + " keychains.");
        System.out.println("keychains cost $" + keychainprice + " each.");
        System.out.println("the sales tax is $" + salesTax);
        System.out.println("the shipping cost is $" + shippingCost + " plus the cost per keychain shipping is $" + perKeychainShippingCost);
        System.out.println("total cost after factoring in sales tax and shipping costs is $" + keychainPriceTotal + ".\n");
        System.out.println("Thank you for your order, " + name + "!");
        wouldyouliketoplayagain();
    }

    public void wouldyouliketoplayagain(){
        if(playAgain = true){
            start();
        }
    }
}
