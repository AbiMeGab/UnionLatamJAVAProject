import java.util.HashMap;
import java.util.Map;
public class Game {

    public String winner(String[] deckSteve, String[] deckJosh) {
        Map<String, Integer> cardValues = new HashMap<String, Integer>();
        cardValues.put("2", 1);
        cardValues.put("3", 2);
        cardValues.put("4", 3);
        cardValues.put("5", 4);
        cardValues.put("6", 5);
        cardValues.put("7", 6);
        cardValues.put("8", 7);
        cardValues.put("9", 8);
        cardValues.put("T", 9);
        cardValues.put("J", 10);
        cardValues.put("Q", 11);
        cardValues.put("K", 12);
        cardValues.put("A", 13);
        String result = "";
        int scoreSteve = 0, scoreJosh = 0;
        int valueSteve = 0, valueJosh = 0;
        for (int i = 0 ; i < deckSteve.length ; i ++) {
            for(Map.Entry<String, Integer> cardEntry : cardValues.entrySet()) {
                if (cardEntry.getKey().equals(deckSteve[i])) {
                    valueSteve = cardEntry.getValue();
                }
                if (cardEntry.getKey().equals(deckJosh[i])) {
                    valueJosh = cardEntry.getValue();
                }
            }
            if (valueSteve > valueJosh) {
                scoreSteve++;
            } else if (valueJosh > valueSteve) {
                scoreJosh++;
            }
        }
        if (scoreSteve > scoreJosh) {
            result = "Steve wins " + scoreSteve + " to " + scoreJosh;
        } else if (scoreJosh > scoreSteve) {
            result = "Josh wins " + scoreJosh + " to " + scoreSteve;
        } else {
            result = "Tie";
        }
        return result;
    }
}