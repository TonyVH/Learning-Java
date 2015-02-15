/*
   This version of the ShowFile program uses a try-with-resources
   statement to automatically close a file when it is no longer needed.
*/

import java.io.*;

class ShowFile3 {
    public static void main(String[] args) {
        int i;

        if(args.length != 1) {
            System.out.println("Usage: ShowFile3 fileName");
            return;
        }

        // The following code uses try-with-resources to open a file
        // and then automatically close it when the try block is left.
        try(FileInputStream fileIn = new FileInputStream(args[0])) {
            
            do {
                i = fileIn.read();
                if(i != -1) {
                    System.out.print((char) i);
                }
            } while(i != -1);
        }
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
