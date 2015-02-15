/*
   A version of CopyFile that uses try-with-resources.
   It demonstrates two resources (in this case files)
   being managed by a single try statement.
*/

import java.io.*;

class CopyFile2 {
    public static void main(String[] args) throws IOException {
        int i;

        if(args.length != 2) {
            System.out.println("Usage: CopyFile2 fromFile toFile");
            return;
        }

        try(FileInputStream fileIn = new FileInputStream(args[0]);
            FileOutputStream fileOut = new FileOutputStream(args[1])) {
                
            do {
                i = fileIn.read();
                if(i != -1) {
                    fileOut.write(i);
                }
            } while(i != -1);
        }
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
