package homework13;

public class Test {
    public static void main(String[] args) {
        System.out.println(reverseOrderOfWords("man has dog"));
    }
    public static String reverseOrderOfWords(String string) {
        String[] words = string.split("\\s");
        StringBuilder reverseString = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]).append(" ");
        }
        return upFirstLetter(reverseString.toString());
    }
    public static String upFirstLetter(String string) {
        String[] words = string.split("\\s");
        StringBuilder change = new StringBuilder();
        for (String word : words) {
            String first = word.substring(0, 1);
            String afterFirst = word.substring(1);
            change.append(first.toUpperCase()).append(afterFirst).append(" ");
        }
        return change.toString().trim();
    }
}
