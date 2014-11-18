import java.util.Scanner;

class calc{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double fnum, snum, answer;

        System.out.print("Enter first number: ");
        fnum = input.nextDouble();
        System.out.print("Enter second number: ");
        snum = input.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}
