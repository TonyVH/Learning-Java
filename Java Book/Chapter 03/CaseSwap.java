/*
    Program that gets input from the keyborad,
    and then converts each letter to its opposite
    case. Program runs until a period is entered.
*/
class CaseSwap {
    public static void main(String args[])
        throws java.io.IOException {

        char ch;
        int swap_count = 0;

        System.out.println("Period to stop.");

        do {
            ch = (char) System.in.read();
            if(ch >= 'A' && ch <= 'Z') {
                ch += 32;
                swap_count++;
            }
            else if(ch >= 'a' && ch <= 'z') {
                ch -= 32;
                swap_count++;     
            }
            System.out.print(ch);
        } while(ch != '.');

        System.out.println();
        System.out.println("Number of case swaps: " + swap_count);
    }
}
