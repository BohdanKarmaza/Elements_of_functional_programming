import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i ++){
            randomNumbers.add((int) Math.round((Math.random() * 20)));
        }

        randomNumbers.stream()
                .map(t -> t * t)
                .reduce(Integer::sum);


    }
}
