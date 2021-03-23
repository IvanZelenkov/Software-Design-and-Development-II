package Lab4;

public class StringUtility {

    public static String reverse(String sentence) {
        String[] words = sentence.replaceAll(" +", " ").toLowerCase().split(" ");
        String s = "";

        for (int i = words.length - 1; i >= 0; i--) {
            s += words[i] + " ";
        }
        return s.trim();
    }

    public static char maxOccuringCharacter(String sentence) throws IllegalArgumentException {
        if (sentence.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int character = 0;
        char[] characters = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        int[] cells = new int[256];
        for (char c : characters)
            cells[c]++;

        int max = -1;

        for (int i = 0; i < cells.length; i++) {
            if (cells[i] > max) {
                max = cells[i];
                character = i;
            }
        }

        return (char) character;
    }

    public static boolean isPalindrome(String input){
        return input.equals((new StringBuilder(input)).reverse().toString());
    }
}
