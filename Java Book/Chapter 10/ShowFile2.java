/* 
   This variation wraps the code that opens and
   accesses the file within a single try block.
   The file is closed by the finally block.
*/

import java.io.*;

class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fileIn = null;

        if(args.length != 1) {
            System.out.println("Usage: ShowFile2 File");
            return;
        }

        // The following code opens a file, reads characters until EOF
        // is encountered, and then closes the file via a finally block.
        try {
            fileIn = new FileInputStream(args[0]);

            do {
                i = fileIn.read();
                if(i != -1) {
                    System.out.print((char) i);
                }
            } while(i != -1);
        }
        catch(FileNotFoundException exc) {
            System.out.println("File Not Found");
        }
        catch(IOException exc) {
            System.out.println("An I/O Error Occurred");
        }
        finally {
            try {
                if(fileIn != null) {
                    fileIn.close();
                }
            }
            catch(IOException exc) {
                System.out.println("Error Closing File");
            }
        }
    }
}
