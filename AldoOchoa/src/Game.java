/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.HashMap;

/**
 *
 * @author HP VICTUS
 */
public class Game {

    public static String winner(String[] deckSteve, String[] deckJosh) {
        HashMap<String, Integer> cards = createCardsMap();
        int s = 0;
        int j = 0;
        
        for (int i = 0; i < deckSteve.length; i++) {
            int steveCardValue = getCardValue(cards, deckSteve[i]);
            int joshCardValue = getCardValue(cards, deckJosh[i]);
            
            if (steveCardValue > joshCardValue) {
                s++;
            } else if (steveCardValue < joshCardValue) {
                j++;
            }
        }
        
        if (s == j) {
            return "Tie";
        } else if (s > j) {
            return "Steve wins " + s + " to " + j;
        } else {
            return "Josh wins " + j + " to " + s;
        }
    }
    
    private static HashMap<String, Integer> createCardsMap() {
        HashMap<String, Integer> cards = new HashMap<>();
        cards.put("2", 2);
        cards.put("3", 3);
        cards.put("4", 4);
        cards.put("5", 5);
        cards.put("6", 6);
        cards.put("7", 7);
        cards.put("8", 8);
        cards.put("9", 9);
        cards.put("T", 10);
        cards.put("J", 11);
        cards.put("Q", 12);
        cards.put("K", 13);
        cards.put("A", 14);
        return cards;
    }
    
    private static int getCardValue(HashMap<String, Integer> cards, String card) {
        return cards.get(card);
    }
}

