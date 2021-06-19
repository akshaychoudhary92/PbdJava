import java.util.Scanner;

public class KeyChain {
    public void start(){
        Scanner s = new Scanner(System.in);
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
                add_keychains();
                break;
            case "2":
                remove_keychains();
                break;
            case "3" :
                view_order();
                break;
            case "4":
                checkout();
                shouldBreak = false;
                break;
            default:
                System.out.println("Please choose one of the 4 choices thank you!");
        }
    }while(shouldBreak);



    }

    public void add_keychains(){
        System.out.println("ADD KEYCHAINS");
        System.out.println("");
    }
    public void remove_keychains(){
        System.out.println("REMOVE KEYCHAINS");
        System.out.println("");
    }
    public void view_order(){
        System.out.println("VIEW ORDER");
        System.out.println("");
    }
    public void checkout(){
        System.out.println("CHECKOUT");
        System.out.println("");

    }
}
