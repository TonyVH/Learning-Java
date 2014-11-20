import java.util.Scanner;

class main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        test testObject = new test();
        System.out.print("Enter name of first girlfriend here: ");
        String temp = input.nextLine();
        testObject.setName(temp);
        testObject.saying();
    }
}
