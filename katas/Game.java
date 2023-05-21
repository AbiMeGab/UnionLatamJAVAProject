import java.util.HashMap;

public class Game {
    public static String winner(String[] deckSteve, String[] deckJosh) {
        HashMap<String, Integer> cards = new HashMap<String, Integer>();
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
        int s = 0;
        int j = 0;
        int[] deckSteveInt = new int[deckSteve.length];
        int[] deckJoshInt = new int[deckJosh.length];
        for (int i = 0; i < deckSteve.length; i++) {
            deckSteveInt[i] = cards.get(deckSteve[i]);
            deckJoshInt[i] = cards.get(deckJosh[i]);
        }
        for (int i = 0; i < deckSteveInt.length; i++) {
            if (deckSteveInt[i] > deckJoshInt[i]) {
                s++;
            } else if (deckSteveInt[i] < deckJoshInt[i]) {
                j++;
            }
        }
        if (s == j) {
            return "Tie";
        }
        return s > j ? "Steve wins " + s + " to " + j : "Josh wins " + j + " to " + s;
    }
}
