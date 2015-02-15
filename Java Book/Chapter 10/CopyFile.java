/*
   Copy a test file.
   To use this program, specify the name
   of the source file and the destination file.
   For example, to copy a file called FIRST.TXT
   to a file called SECOND.TXT, use the following
   command line:

   java CopyFile FIRST.TXT SECOND.TXT
*/

import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        if(args.length != 2) {
            System.out.println("Usage: CopyFile fromFile toFile");
            return;
        }

        try {
            fileIn = new FileInputStream(args[0]);
            fileOut = new FileOutputStream(args[1]);

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
        finally {
            try {
                if(fileIn != null) {
                    fileIn.close();
                }
            }
            catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }

            try {
                if(fileOut != null) {
                    fileOut.close();
                }
            }
            catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}
