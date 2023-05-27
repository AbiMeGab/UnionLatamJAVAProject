import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    private Clases.Game game = new Clases.Game();

    @Test
    public void testGame() {
        assertEquals(
                "small deck",
                "Steve wins 2 to 1",
                game.winner(new String[]{"A", "7", "8"}, new String[]{"K", "5", "9"})
        );

        assertEquals(
                "small deck",
                "Tie",
                game.winner(new String[]{"T"}, new String[]{"T"})
        );
    }

}