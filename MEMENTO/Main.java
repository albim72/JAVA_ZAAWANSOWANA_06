package marcin.com;

public class Main {

    private GameMission gameMission;
    private int copyOfCurrentCompletionProgress;
    private int getCopyOfPreviousCompletionProgress;

    public Main(GameMission gameMission) {
        this.gameMission = gameMission;
        this.copyOfCurrentCompletionProgress = gameMission.getPercentageCompleted();
        this.getCopyOfPreviousCompletionProgress = gameMission.previousPercentageCompleted;
    }

    public void resetMissionStatus(){
        gameMission.setPercentageCompleted(copyOfCurrentCompletionProgress);
        gameMission.previousPercentageCompleted = getCopyOfPreviousCompletionProgress;
    }

    public static void main(String[] args) {
        Main nmis = new Main(new GameMission());
        System.out.println(nmis.getCopyOfPreviousCompletionProgress);
        nmis.gameMission.setPercentageCompleted(45);
        System.out.println(nmis.gameMission.getPercentageCompleted());
        nmis.resetMissionStatus();
        System.out.println(nmis.gameMission.getPercentageCompleted());

    }
}
