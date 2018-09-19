/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carddeckapp;

/**
 *
 * @author jeffrey.herold
 */
public class CardDeckApp {

    /**
     * @param args the command line arguments
     */
    private static String[] suits = {"H", "D", "C", "S"};
    private static String[] cards = new String[52];
    private static String[][] hands = new String[4][5];       
    
    public static void main(String[] args) 
    {
        loadCardArray();
        printCardArray();
        shuffleCards();
        printCardArray();
        dealCards();
        showCards();
    }
    private static void loadCardArray()
    {
        int i = 0;
        for(String suit : suits)
        {
            for (int j = 1; j < 14; j++)
            {
                cards[i] = suit + j;
                i++;
            }
        }
    }
    private static void printCardArray()
    {
        int index = 0;
        
        for (int j = 0; j < 4; j++)
        {
            for (int k = 0; k < 13; k++)
            {
                System.out.print(cards[index] + " ");
                index++;
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void shuffleCards()
    {
        for (int i = 0; i < 100; i++)
        {
            String savedCard = "";
            int variant = ((int)(Math.random() * 50 )) + 1;
            
            for (int j = 0; j < cards.length; j++)
            {
                if (j + variant < cards.length)
                {
                    savedCard = cards[j];
                    cards[j] = cards[j + variant];
                    cards[j + variant] = savedCard;
                }
            }
        }
    }
    private static void dealCards()
    {
        int i = 0;
        
        for (int k = 0; k < 5; k++)
        {
            for (int j = 0; j < 4; j++)
            {
                hands[j][k] = cards[i];
                i++;
            }
        }
    }
    private static void showCards()
    {
        for (int i = 0; i < hands.length; i ++)
        {
            for (int j = 0; j < hands[i].length; j++)
            {
                System.out.print(hands[i][j] = " ");
            }
            System.out.println();
        }
    }
}
