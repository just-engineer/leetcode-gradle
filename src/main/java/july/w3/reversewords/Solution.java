package july.w3.reversewords;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseWords(String s) {

        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                word.append(c);

            } else {
                if (word.length() != 0) {
                    words.add(word.toString());
                    word = new StringBuilder();
                }
            }
        }
        if (word.length() != 0) {
            words.add(word.toString());
        }
        StringBuilder result = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {

            result.append(words.get(i));
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
