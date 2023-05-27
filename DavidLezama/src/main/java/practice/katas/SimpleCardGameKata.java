package practice.katas;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SimpleCardGameKata {

    private final Map <String, Integer> deck = new HashMap <String, Integer>() {{
        put("2", 20);
        put("3", 30);
        put("4", 40);
        put("5", 50);
        put("6", 60);
        put("7", 70);
        put("8", 80);
        put("9", 90);
        put("T", 100);
        put("J", 110);
        put("Q", 120);
        put("K", 130);
        put("A", 140);
    }};

    public String execute(String[] deckSteve, String[] deckJosh) {

        if (deckSteve.length != deckJosh.length) return "";

        int timesTie = 0;
        int timesWinnerSteve = 0;
        int timesWinnerJosh = 0;

        for (int i = 0; i < deckSteve.length; i++) {

            Integer valueSteve = deck.get(deckSteve[i]);
            Integer valueJosh = deck.get(deckJosh[i]);

            if (Objects.equals(valueSteve, valueJosh)) timesTie++;
            else if (valueSteve > valueJosh) timesWinnerSteve++;
            else timesWinnerJosh++;

        }

        if (timesWinnerSteve == timesWinnerJosh) return "Tie";
        if (timesWinnerSteve > timesWinnerJosh) return "Steve wins " + timesWinnerSteve + " to " + timesWinnerJosh;
        return "Josh wins " + timesWinnerJosh + " to " + timesWinnerSteve;


    }
}

