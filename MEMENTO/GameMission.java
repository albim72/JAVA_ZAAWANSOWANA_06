package marcin.com;

public class GameMission {
    private int percentageCompleted;
    int previousPercentageCompleted;

    public GameMission() {
        this.percentageCompleted = 0;
        this.previousPercentageCompleted = 0;
    }

    public int getPercentageCompleted() {
        return percentageCompleted;
    }

    public void setPercentageCompleted(int percentage) {
        previousPercentageCompleted = percentageCompleted;
        percentageCompleted = percentage;
    }
}
