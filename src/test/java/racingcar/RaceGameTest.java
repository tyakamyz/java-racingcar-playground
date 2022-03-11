package racingcar;

import racingcar.model.Racingcar;

import java.util.List;

public class RaceGameTest {

    public void raceProgress(){
        List<Racingcar> racingcars = Racingcar.inputStringToRacingcars("pobi,crong,honux");
        RacingGame racingGame = new RacingGame();

        racingGame.raceProgress(racingcars);
    }

}
