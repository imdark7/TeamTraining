import java.util.Date;

public class TrainingDay {
    boolean dayIsTrainable = true;
    Date trainingDayDate;
    int numberOfPlayers = 0;

    public TrainingDay(Date trainingDayDate) {
        this.trainingDayDate = trainingDayDate;
    }

    public void makeDayUntrainable() {
        dayIsTrainable = false;
    }
}
