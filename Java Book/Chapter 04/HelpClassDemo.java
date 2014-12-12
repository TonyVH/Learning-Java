// Try This 4-1 

class Help {
    void helpOn(int what) {
        switch(what) {
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

    void showMenu() {
        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("  3. for");
        System.out.println("  4. while");
        System.out.println("  5. do-while");
        System.out.println("  6. break");
        System.out.println("  7. continue\n");
        System.out.print("Choose one (q to quit): ");
    }

    boolean isValid(int ch) {
        if(ch < '1' | ch > '7' & ch != 'q') {
            return false;
        }
        else {
            return true;
        }
    }
}

class HelpClassDemo {
    public static void main(String args[])
        throws java.io.IOException {
        char choice, ignore;
        Help helpObj = new Help();

        for(;;) {
            do {
                helpObj.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');

            } while(!helpObj.isValid(choice));

            if(choice == 'q') {
                break;
            }

            System.out.println("\n");

            helpObj.helpOn(choice);
        }
    }
}
