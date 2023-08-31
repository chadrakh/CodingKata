package kata.BowlingGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    // X X X X X X X X X X X X (12 rolls: 12 strikes) = 10 frames * 30 points = 300
    // 9- 9- 9- 9- 9- 9- 9- 9- 9- 9- (20 rolls: 10 pairs of 9 and miss) = 10 frames * 9 points = 90
    // 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5 (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10 frames * 15 points = 150

    @Test
    public void checkPerfectGameScoresThreeHundred() {
        BowlingGame game = new BowlingGame("X X X X X X X X X X X X");

        int expected = 300;
        int result = game.calculateGameScore();

        assertEquals(expected, result);

    }

    @Test
    public void checkAllNinesAndMissesScoresNinety() {
        BowlingGame game = new BowlingGame("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-");

        int expected = 90;
        int result = game.calculateGameScore();

        assertEquals(expected, result);

    }

    @Test
    public void checkAllFivesAndSparesScoredOneHundredAndFifty() {
        BowlingGame game = new BowlingGame("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5");

        int expected = 150;
        int result = game.calculateGameScore();

        assertEquals(expected, result);

    }
}
