package racingcar.domain;

public class Point {

    private int point;

    public Point() {
        this.point = 0;
    }

    public void addPoint() {
        this.point++;
    }

    public String moveStatusByPoints() {
        StringBuilder moveStatus = new StringBuilder();

        for(int i = 0; i < this.point; i++){
            moveStatus.append("-");
        }

        return moveStatus.toString();
    }

    public int getPoint() {
        return this.point;
    }
}
