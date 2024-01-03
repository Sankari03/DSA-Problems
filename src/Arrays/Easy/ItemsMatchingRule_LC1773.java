//https://leetcode.com/problems/count-items-matching-a-rule/description/
//Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],
// ["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//Output: 1
//Explanation: There is only one item matching the given rule, which is
// ["computer","silver","lenovo"].

package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemsMatchingRule_LC1773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> items = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            items.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                items.get(i).add(sc.next());
            }
        }
        String ruleKey = sc.next(), ruleValue = sc.next();
        int count = 0;
        switch (ruleKey) {
            case "color" -> {
                for (int i = 0; i < 3; i++) {
                    if (items.get(i).get(1).equals(ruleValue)) {
                        count++;
                    }
                }
            }
            case "type" -> {
                for (int i = 0; i < 3; i++) {
                    if (items.get(i).get(0).equals(ruleValue)) {
                        count++;
                    }
                }
            }
            case "name" -> {
                for (int i = 0; i < 3; i++) {
                    if (items.get(i).get(2).equals(ruleValue)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}


//LC
//class Solution {
//    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int count = 0;
//        switch (ruleKey) {
//            case "type" -> {
//                for (int i = 0; i < items.size(); i++) {
//                    if (items.get(i).get(0).equals(ruleValue)) {
//                        count++;
//                    }
//                }
//            }
//            case "color" -> {
//                for (int i = 0; i < items.size(); i++) {
//                    if (items.get(i).get(1).equals(ruleValue)) {
//                        count++;
//                    }
//                }
//            }
//            case "name" -> {
//                for (int i = 0; i < items.size(); i++) {
//                    if (items.get(i).get(2).equals(ruleValue)) {
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
//    }
//}