// Use XOR to encode and decode a message.
class Encode {
    public static void main(String args[]) {
        String msg = "Secret message";
        String encmsg = "";
        String decmsg = "";
        int key = 80;

        System.out.print("Original message: ");
        System.out.println(msg);

        // Encode the message
        for(int i = 0; i < msg.length(); i++) {
            encmsg += (char) (msg.charAt(i) ^ key);
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // Decode the message
        for(int i = 0; i < msg.length(); i++) {
            decmsg += (char) (encmsg.charAt(i) ^ key);
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
