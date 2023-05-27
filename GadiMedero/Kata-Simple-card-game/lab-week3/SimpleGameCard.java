import java.util.HashMap;
import java.util.Map;

public class SimpleGameCard {
    private static Map<String, Integer> diccionario;

    public SimpleGameCard() {
        diccionario = new HashMap<>();
        diccionario.put("2", 1);
        diccionario.put("3", 2);
        diccionario.put("4", 3);
        diccionario.put("5", 4);
        diccionario.put("6", 5);
        diccionario.put("7", 6);
        diccionario.put("8", 7);
        diccionario.put("9", 8);
        diccionario.put("T", 9);
        diccionario.put("J", 10);
        diccionario.put("Q", 11);
        diccionario.put("K", 12);
        diccionario.put("A", 13);
    }

    public String winner(String[] deckSteve, String[] deckJosh) {
        int scoreSteve = 0;
        int scoreJosh = 0;

        for (int i = 0; i < deckSteve.length; i++) {
            String cardSteve = deckSteve[i];
            String cardJosh = deckJosh[i];

            int valueSteve = getValue(cardSteve);
            int valueJosh = getValue(cardJosh);

            if (valueSteve > valueJosh) {
                scoreSteve++;
            } else if (valueSteve < valueJosh) {
                scoreJosh++;
            }
        }

        if (scoreSteve > scoreJosh) {
            return "Steve wins " + scoreSteve + " to " + scoreJosh;
        } else if (scoreSteve < scoreJosh) {
            return "Josh wins " + scoreJosh + " to " + scoreSteve;
        } else {
            return "Tie";
        }
    }

    private int getValue(String card) {
        return diccionario.get(card);
    }

    public static void main(String[] args) {
        SimpleGameCard game = new SimpleGameCard();
        String[] deckSteve = {"A", "7", "8"};
        String[] deckJosh = {"K", "5", "9"};

        String result = game.winner(deckSteve, deckJosh);
        System.out.println(result);
    }
}