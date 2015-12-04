import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Month {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
    ArrayList<TrainingDay> trainingMonth = new ArrayList<>();

    public void addNewTrainingDay() {
        System.out.println("Input date in format \"dd.MM.yyyy\"");
        try {
            String inputDate = reader.readLine();
            TrainingDay day = new TrainingDay(formatDate.parse(inputDate));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }
}
