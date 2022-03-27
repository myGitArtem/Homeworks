package homework10;


import java.util.Arrays;

public class homeworkTen {
    public static void main(String[] args) {
        String test = "asdf";

        for (int i = 0; i < test.length(); i++) {
            System.out.println(test.charAt(i) + "");
        }

        String testTwo = "Qwerty asdfg zxcvb";
        System.out.println(testTwo.contains("zxcvb"));

        String testThree = "google";
        testThree = testThree + ".com";
        if (!testThree.endsWith(".com")) {
            testThree = ".com" + testThree;
        }
        if (!testThree.startsWith("http//")) {
            testThree = "http//" + testThree;
        }
        System.out.println(testThree);

        String name = "Artem";
        String name2 = "Artem";
        System.out.println(name.equals(name2));

        String age = "28";
        String age2 = "28";
        System.out.println(age.equalsIgnoreCase(age2));

        String test2 = "My name is %s, my age is %s";
        test2 = String.format(test2, name, age);
        System.out.println(test2);
        System.out.println(test2.indexOf("name"));

        String test3 = "";
        if (test3.isEmpty()) {
            System.out.println("Используется при валидации");
        }

        String test4 = "My name is Kolya";
        test4 = test4.replace("Kolya", "Artem");
        System.out.println(test4);

        String s = test4.substring(3, 7);
        System.out.println(s);
        System.out.println(test4.toUpperCase());
        System.out.println(test4.toLowerCase());

        String test5 = "   Kolya   ";
        System.out.println(test5.trim());

        String test6 = "My name is Artem";
        String[] arr = test6.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(test6.length());

        System.out.println(max(10, 30, 40, 20));
    }

    public static int max(int... values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}








