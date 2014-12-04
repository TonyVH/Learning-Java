/*
    Try This 3-2

    An improved Help system that uses a
    do-while to process a menu selection.
*/
class Help2 {
    public static void main(String args[])
        throws java.io.IOException {

        char choice, ignore;
        for(;;) {
            do {
                System.out.println("Help on:");
                System.out.println("  1. if");
                System.out.println("  2. switch");
                System.out.println("  3. for");
                System.out.println("  4. while");
                System.out.println("  5. do-while");
                System.out.println("  6. break");
                System.out.println("  7. continue\n");
                System.out.print("Choose one (q to quit): ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while(choice < '1' | choice > '7' & choice != 'q');

            if(choice == 'q') {
                break;
            }

            System.out.println("\n");

            switch(choice) {
                case '1':
                    System.out.println("The if:\n");
                    System.out.println("if(condition) {");
                    System.out.println("    statement;\n}");
                    System.out.println("else {");
                    System.out.println("    statement;\n}");
                    break;
                case '2':
                    System.out.println("The switch:\n");
                    System.out.println("switch(expression) {");
                    System.out.println("    case constant:");
                    System.out.println("        statement sequence");
                    System.out.println("        break;");
                    System.out.println("    // ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("The for:\n");
                    System.out.println("for(init; condition; iteration) {");
                    System.out.println("    statement;");
                    System.out.println("}");
                    break;
                case '4':
                    System.out.println("The while:\n");
                    System.out.println("while(condition) {");
                    System.out.println("    statement;");
                    System.out.println("}");
                    break;
                case '5':
                    System.out.println("The do-while:\n");
                    System.out.println("do {");
                    System.out.println("    statement;");
                    System.out.println("} while(condition);");
                    break;
                case '6':
                    System.out.println("The break:\n");
                    System.out.println("break; | break label;");
                    break;
                case '7':
                    System.out.println("The continue:\n");
                    System.out.println("continue; | continue labale;");
                    break;
            }
            System.out.println();
        }
    }    
}
