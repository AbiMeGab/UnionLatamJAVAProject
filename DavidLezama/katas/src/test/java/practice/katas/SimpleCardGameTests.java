package practice.katas;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class SimpleCardGameTests {
    
    
    @Test
    public void WinnerSteve() {

        SimpleCardGameKata simpleCardGameKata = new SimpleCardGameKata();
        
        String[] deckSteve = {"A", "7", "8"};
        String[] deckJosh = {"K", "5", "9"};
        
        String result = simpleCardGameKata.execute(deckSteve, deckJosh);
        
        Assert.assertEquals("Steve wins 2 to 1", result);
        
    }
    
    @Test
    public void WinnerJosh(){
        SimpleCardGameKata simpleCardGameKata = new SimpleCardGameKata();
        
        String[] deckSteve = {"T", "5", "9"};
        String[] deckJosh = {"K", "Q", "J"};
        
        String result = simpleCardGameKata.execute(deckSteve, deckJosh);
        
        Assert.assertEquals("Josh wins 2 to 1", result);
    }
    
    
}
