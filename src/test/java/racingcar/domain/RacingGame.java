package racingcar.domain;

public class RacingGame {
    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 0;

    public static int randomNumber(){
        return (int)(Math.random() * (MAX_NUMBER - MIN_NUMBER)) + MIN_NUMBER;
    }

}
