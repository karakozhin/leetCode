package test.leetCode.easy.validParentheses_20;

import java.util.HashMap;

public class ValidParentheses20 {
    public static void main(String[] args) {
        class Solution {
            public boolean isValid(String s) {
                HashMap<String, Integer> character = new HashMap<>();
                character.put("()", 1);
                character.put("{}", 2);
                character.put("[]", 3);

                StringBuilder appendText = new StringBuilder();

                for (int i = 0; i < s.length() - 1; i++) {
                    appendText.append(s.charAt(i)).append(s.charAt(i + 1));

                    if(character.containsKey(appendText.toString())){
                        i++;
                        appendText = new StringBuilder();
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
        }



    }
}

