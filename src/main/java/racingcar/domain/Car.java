package racingcar.domain;

public class Car {

    private final int STANDARD_NUMBER = 4;

    private final Name name;
    private final Score score;

    public Car(String name) {
        this.name = new Name(name);
        this.score = new Score();
    }

    public void move(int randomNumber) {
        if(randomNumber >= STANDARD_NUMBER){
            score.addScore();
            score.maxScoreCompare();
        }
    }

    public int getScore() {
        return score.getScore();
    }

    public String getName() {
        return name.getName();
    }
}
