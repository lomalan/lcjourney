package arraysandhashing;

import java.util.ArrayList;
import java.util.List;

public class StringEncodeDecode {
    private static final Character DELIMITER = '£';

    public String encode(List<String> strs) {
        var stringBuilder = new StringBuilder();
        for (String word: strs) {
            var length = word.length();
            stringBuilder.append(length).append(DELIMITER).append(word);
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedWords = new ArrayList<>();
        int index = 0;
        while (index < str.length()) {
            //Phase 1. find the length of the current word
            int numLastIndex = index;
            while (str.charAt(numLastIndex) != DELIMITER) {
                numLastIndex++;
            }
            //Phase 2. Cut the word from the actual string
            var wordLen = Integer.parseInt(str.substring(index, numLastIndex));
            var wordStart = numLastIndex + 1;
            decodedWords.add(str.substring(wordStart, wordStart + wordLen));
            index = wordLen + wordStart;
        }
        return decodedWords;
    }
}
