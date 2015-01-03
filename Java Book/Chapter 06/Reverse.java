// Reverse the contents of a string through recursion.
class Reverse {
    public static void main(String args[]) {
        int i;
        String s = args[0];
        for(i = 1; i <= s.length(); i++) {
            System.out.print(s.charAt(s.length()-i));
        }
        System.out.println();
    }
}
