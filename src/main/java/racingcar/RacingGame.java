package racingcar;

import racingcar.model.Racingcar;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private static final int STANDARD_NUMBER = 4;
    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 0;

    public String raceProgressReturnScore(List<Racingcar> racingcars) {

        StringBuffer raceScore = new StringBuffer();

        for(Racingcar racingcar : racingcars){
            int randomNumber = getRandomNumber();
            if(randomNumber >= STANDARD_NUMBER){
                racingcar.addMove();
            }

            raceScoreWrite(raceScore, racingcar);
        }

        return raceScore.toString();
    }

    private void raceScoreWrite(StringBuffer raceScore, Racingcar racingcar) {
        raceScore.append(racingcar.getName());
        raceScore.append(" : ");

        for(int i = 0; i < racingcar.getMove(); i++){
            raceScore.append("-");
        }

        raceScore.append("\n");
    }

    public int getRandomNumber(){
        return (int)(Math.random() * (MAX_NUMBER - MIN_NUMBER)) + MIN_NUMBER;
    }

    public String getWinner(List<Racingcar> racingcars){

        racingcars = racingcars.stream().sorted(Comparator.comparing(Racingcar::getMove).reversed()).collect(Collectors.toList());

        int index = 0;
        StringBuilder winnerNames = new StringBuilder();
        String winnerName = racingcars.get(index).getName();
        int topScore = racingcars.get(index++).getMove();

        while (winnerName != null && index < racingcars.size()) {
            winnerNames.append(winnerName);
            winnerNames.append(", ");
            winnerName = compareScore(topScore, racingcars.get(index++));
        }

        /* 마지막 콤마 제거 */
        return winnerNames.substring(0, winnerNames.length() - 2);

    }

    private String compareScore(int topScore, Racingcar racingcar) {
        if(topScore == racingcar.getMove()){

            return racingcar.getName();
        }
        return null;
    }
}
