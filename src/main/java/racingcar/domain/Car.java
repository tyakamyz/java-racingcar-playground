package racingcar.domain;

public class Car {

    private final Name name;
    private final Score score;

    public Car(String name) {
        this.name = new Name(name);
        this.score = new Score();
    }

    public void move(int randomNumber) {


    }
}
