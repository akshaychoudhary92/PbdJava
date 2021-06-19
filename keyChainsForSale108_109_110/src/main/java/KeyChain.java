import java.util.Scanner;

public class KeyChain {
    int totalKeychains = 0;
    int keychainPriceTotal= 0;
    int keychainprice = 10;
    Scanner s = new Scanner(System.in);
    public void start(){

        String choice;

        boolean shouldBreak = true;
        System.out.println("Ye Olde Keychain Shoppe");
        System.out.println("");
do{
        System.out.println("1. Add Keychains to Order\n" +
                "2. Remove Keychains from Order\n" +
                "3. View Current Order\n" +
                "4. Checkout");

    System.out.println("");

        System.out.println("Please enter your choice(choose 1 - 4 only): ");
        choice = s.nextLine();
        System.out.println("");


        switch(choice){
            case "1" :
                System.out.println("You have " + totalKeychains + " keychains. How many to add?\n" );
                int addkeychain = Integer.parseInt(s.nextLine());
                add_keychains(addkeychain);
                break;
            case "2":
                System.out.println("you have " + totalKeychains + ". How many to remove?\n");
                int removeKeychain = Integer.parseInt(s.nextLine());;
                remove_keychains(removeKeychain);
                break;
            case "3" :
                view_order(totalKeychains, keychainPriceTotal);
                break;
            case "4":
                checkout(totalKeychains, keychainPriceTotal);
                shouldBreak = false;
                break;
            default:
                System.out.println("Please choose one of the 4 choices thank you!");
        }
    }while(shouldBreak);



    }

    public Integer add_keychains(int addkeychain){

        totalKeychains += addkeychain;
        System.out.println("You now have " + totalKeychains + " keychains!\n");
        return totalKeychains;
    }

    public Integer remove_keychains(int removeKeychain){
        totalKeychains -= removeKeychain;
        System.out.println("You now have " + totalKeychains + " keychains!\n");
        return totalKeychains;

    }
    public void view_order(int totalKeychains, int keychainPriceTotal){
        keychainPriceTotal = totalKeychains * keychainprice;
        System.out.println("you have " + totalKeychains + " keychains.");
        System.out.println("keychains cost $" + keychainprice + " each.");
        System.out.println("total cost is $" + keychainPriceTotal + ".\n");
    }
    public void checkout(int totalKeychains, int keychainPriceTotal){
        keychainPriceTotal = totalKeychains * keychainprice;
        System.out.println("what is you name?");
        String name = s.nextLine();
        System.out.println("you have " + totalKeychains + " keychains.");
        System.out.println("keychains cost $" + keychainprice + " each.");
        System.out.println("total cost is $" + keychainPriceTotal + ".\n");
        System.out.println("thank you for your order, " + name + "!");

    }
}
