import java.util.ArrayList;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> lastNames = new ArrayList<>();

        lastNames.add(0, "Johnson");
        lastNames.add(1, "Smith");
        lastNames.add(2, "Ferguson");
        lastNames.add(3, "Jameson");

        lastNames.stream()
                .filter(i -> i.startsWith("J"))
                .forEach(s -> System.out.println(s));
    }

    }
