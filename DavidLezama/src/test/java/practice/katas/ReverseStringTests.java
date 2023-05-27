package practice.katas;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class ReverseStringTests {
    
    
    // w o r l d
    @Test
    public void ShouldBeReturnDlrow(){
        String input = "world";
        String expected = "dlrow";
        
        String result = ReverseStringKata.execute(input);
        
        Assert.assertEquals(expected, result);
    }
    
    // t e s t 
    
    @Test
    public void ShouldBeReturnTset(){
        String input = "test";
        String expected = "tset";
        
        String result = ReverseStringKata.execute(input);
        
        Assert.assertEquals(expected, result);
    }
    
}
