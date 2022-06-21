package com.tlglearning.playingcards;


import java.util.LinkedList;
import java.util.Random;

private Deque<Card> blackPile
private Deque<Card> redPile





    private Deque<Card>
        public class CardTrick() {
    blackPile =new LinkedList<>();
    redPile =new LinkedList<>();
}
    public static void main(String[] args) {
    Deck deck = new Deck();
    deck.shuffle();

    CradTrick trick = new CardTrick();
    trick.splitDeck;
        // TODO Create an instance of Deck and shuffle it (or not).
        // TODO Draw cards from the deck, according to the instructions, placing every other card into red deque and a
        //  black deque.

        // TODO (Optional: Shuffle the red deque and black deque.)
        // TODO Generate a random integer between 0 and the smaller of the two deque sizes, and swap that number of
        //  cards between the two.
        // TODO Count the red cards in the red deque and th eblack cards in the black deque, and compare them. THEY MUST
        //  BE EQUAL.
        //  Sort each deque by color, suit, and rank, and print them out, along with the counts from the previous
        //  steps.

    }




    public void splitDeck(Deck deck) {
    while (deck.getRemaining() > 0) {
        Card indicator = deck.draw();
        Card next = deck.draw();
        if (indicator.getSuit().getColor() == Suit.Color.BLACK) {
            blackPile.add(next);
        } else {
            redPile.add(next);
        }
    }
}

public void swapCards() {
    Random rng = new Random();
    int swapSize = rng.nextInt(1 + Math.min(blackPile.size(), redPile.size()));
    for (int 1 = 0; 1 < swapSize; i++) {
        redPile.add(blackPile.remove());
        blackPile.add(redPile.remove())
    }
}
    public void tally() {
        int redCount = 0;
        int blackCount = 0;
        for (Card card : blackPile) {
            if (card.getSuit().getColor() == Suit.Color.BLACK) {
                blackCount++;
            }
        }
        for (Card : redPile) {
            if (card.getSuit().getColor() == Suit.Color.RED) {
                redCount++;
            }
            System.out.println("Black: count=%d, cards=%s%n", blackCount, blackPile);
        }
    }
}
