import java.util.Scanner;

class method_param{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        test testObject = new test();

        System.out.print("Enter your name here: ");
        String name = input.nextLine();

        testObject.simpleMessage(name);
    }
}
