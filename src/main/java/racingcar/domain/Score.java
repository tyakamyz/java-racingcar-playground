package racingcar.domain;

public class Score {

    private static int MAX_SCORE = 0;

    private int score;

    public Score() {
        this.score = 0;
    }

    public int getScore() {
        return this.score;
    }

    public void addScore() {
        this.score++;
    }

    public void maxScoreCompare() {
        if (MAX_SCORE < this.score) {
            MAX_SCORE = this.score;
        }
    }

    public static int getMaxScore(){
        return MAX_SCORE;
    }
}
