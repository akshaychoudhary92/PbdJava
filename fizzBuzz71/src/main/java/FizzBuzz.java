public class FizzBuzz {

    
    public void start()
    {
        fizzBuzzOutput();
    }









    public String fizzBuzzOutput(){
        String output = "";
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");

            }else if(i % 5 == 0){
                System.out.println("buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
        return output;
    }
}
