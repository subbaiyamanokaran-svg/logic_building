import java.util.*;

public class Main {

    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static String reverseWithCase(String word) {

        String reversed = reverseWord(word);
        char[] result = reversed.toCharArray();

        for (int i = 0; i < word.length(); i++) {

            char original = word.charAt(i);

            if (Character.isLetter(original)) {

                if (Character.isUpperCase(original))
                    result[i] = Character.toUpperCase(result[i]);
                else
                    result[i] = Character.toLowerCase(result[i]);
            }
        }

        return new String(result);
    }

    public static String processSentence(String sentence, int caseOption) {

        String[] words = sentence.split(" ");
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            if (caseOption == 0)
                answer.append(reverseWord(words[i]));
            else
                answer.append(reverseWithCase(words[i]));

            if (i != words.length - 1)
                answer.append(" ");
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        int caseOption = sc.nextInt();

        System.out.println(processSentence(sentence, caseOption));
    }
}