package homework12;

import java.util.*;

public class PersonFactory {

    private static final String[] NAMES = {"Alex", "Ben", "Carl"};
    private static final String[] LAST_NAMES = {"Ivanov", "Petrov", "Sidorov"};
    private static final int[] AGE = {10, 15, 30};
    private static final double[] WEIGHT = {20, 40, 70};
    private static final int[] HEIGHT = {130, 150, 175};


    public static List<Person> createPersons() {
        Random random = new Random();
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int randomAge = AGE[random.nextInt(AGE.length)];
            double randomWeight = WEIGHT[random.nextInt(WEIGHT.length)];
            int randomHeight = HEIGHT[random.nextInt(HEIGHT.length)];
            String randomFirstName = NAMES[random.nextInt(NAMES.length)];
            String randomLastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            result.add(new Person(randomFirstName, randomLastName, randomAge, randomWeight, randomHeight));
            Set<Person> set = new HashSet<>(result);
            List<Person> list = new ArrayList<>(set);
        }
        return result;
    }
    public static List<Person> testSet() {
        Set<Person> set = new HashSet<>(createPersons());
        List<Person> list = new ArrayList<>(set);
        return list;
    }
}

