// Use XOR to encode and decode a message.
class Encode2 {
    public static void main(String args[]) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "password";
        int j;

        System.out.print("Original message: ");
        System.out.println(msg);

        // Encode the message
        j = 0;
        for(int i = 0; i < msg.length(); i++) {
            encmsg += (char) (msg.charAt(i) ^ key.charAt(j++));
            if(j == 8) {
                j = 0;
            }
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // Decode the message
        j = 0;
        for(int i = 0; i < msg.length(); i++) {
            decmsg += (char) (encmsg.charAt(i) ^ key.charAt(j++));
            if(j == 8) {
                j = 0;
            }
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
