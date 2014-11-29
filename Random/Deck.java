/*
    Class to create a deck of cards
    to be used in simple card games
*/
public class Deck {
    String deck[] = {"1C", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "11C", "12C", "13C",
                     "1D", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "11D", "12D", "13D",
                     "1H", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "11H", "12H", "13H",
                     "1S", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "11S", "12S", "13S"};

    String view_card(int card) {
        return deck[card];
    }
}

// Test methods
class main {
    public static void main(String args[]) {
        Deck deck = new Deck();
        System.out.println(deck.view_card(43));
    }
} 
