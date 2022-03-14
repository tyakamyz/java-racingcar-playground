package racingcar.util;

public class RandomNumber {

    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 0;

    public static int create(){
        return (int)(Math.random() * (MAX_NUMBER - MIN_NUMBER)) + MIN_NUMBER;
    }

}
