/*
    Program that reads characters from the keyboard
    until a period is reached. Counts the number spaces
    typed before a period is reached.
*/
class period {
    public static void main(String args[])
        throws java.io.IOException {
        char ch;
        int count = 0;

        do {
            ch = (char) System.in.read();
            if(ch == ' ') {
                count++;
            }
        } while(ch != '.');

        System.out.println("Number of spaces: " + count);
    }
}
