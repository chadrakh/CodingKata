package kata.BowlingGame;

public class BowlingGame {
    private final String ROLLS;

    public BowlingGame(String rolls) {
        this.ROLLS = rolls;
    }

    private int calculateFrameScore() {
        // initialised frameIndex
        // initialise frameScore as int
        // separate rolls into character array for checking, e.g. 'X', 'X', 'X' or '9', '-', '9', '-'

        // iterate over array (each item in array is a roll)
        // if roll equals 'X'
            // score is 10 plus pins knocked down in next two frames
        // else if roll equals '/'
            // score is 10 plus pins knocked in next frame
        // else
            // score is pins knocked down (indicating missed pins)

        // if frameIndex equals 10
            // check if roll equals 'X' or last frame equals '/'
                // call calculateBonusRoll, pass in roll
                // return frameScore

        return 0;
    }

    private int calculateBonusScore(String roll) {
        // initialise bonusScore as int

        // if roll equals 'X'
            // handle two bonus rolls
        // else
            // handle one bonus roll

        return 0;
    }

    public int calculateGameScore() {
        // call calculateFrameScore by passing in rolls (final variable declared in class)
        return 0;
    }
}
