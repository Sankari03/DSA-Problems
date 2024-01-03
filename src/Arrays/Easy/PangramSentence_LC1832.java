//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
package Arrays.Easy;

import java.util.ArrayList;

public class PangramSentence_LC1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog".toLowerCase();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (!list.contains(sentence.charAt(i))) {
                list.add(sentence.charAt(i));
            }
        }
        if (list.size() == 26) {
            System.out.println("True");
        } else System.out.println("False");
    }
}

//LC
//class Solution {
//    public boolean checkIfPangram(String sentence) {
//        sentence = sentence.toLowerCase();
//        ArrayList<Character> list = new ArrayList<>();
//        for (int i = 0; i < sentence.length(); i++) {
//            if (!list.contains(sentence.charAt(i))) {
//                list.add(sentence.charAt(i));
//            }
//        }
//        return list.size() == 26;
//    }
//}