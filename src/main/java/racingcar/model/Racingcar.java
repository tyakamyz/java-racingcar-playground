package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Racingcar {

    static final int NAME_SIZE = 5;

    private final String name;

    public Racingcar(String name) {
        this.name = name;
    }

    public static List<Racingcar> inputStringToRacingcars(String inputString) {

        List<String> inputStringList = Arrays.stream(inputString.split(",")).collect(Collectors.toList());

        /* 유효성 체크 */
        racingcarsNameValidateCheck(inputStringList);

        return inputStringListToRacingcars(inputStringList);

    }

    private static List<Racingcar> inputStringListToRacingcars(List<String> inputStringList) {
        List<Racingcar> racingcarList = new ArrayList<>();

        for (String carName : inputStringList) {
            racingcarList.add(new Racingcar(carName));
        }

        return racingcarList;
    }

    private static void racingcarsNameValidateCheck(List<String> inputStringList) {
        /* 자동차 이름은 5자를 초과할 수 없다 */
        for(String carName : inputStringList){
            isCarNameSizeCheck(carName);
        }
    }

    private static void isCarNameSizeCheck(String carName) {
        if(carName.length() > NAME_SIZE){
            throw new IllegalArgumentException();
        }

    }
}
