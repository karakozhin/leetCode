package test.leetCode.easy.validParentheses_20;

import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {

        String str = "[{}]";
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '('){
                stack.push(str.charAt(i));
            } else if(stack.isEmpty() ||
                    (str.charAt(i) == ')' && stack.peek() != '(') ||
                    (str.charAt(i) == '}' && stack.peek() != '{') ||
                    (str.charAt(i) == ']' && stack.peek() != '[') ) {
                System.out.println(false);
            } else {
                stack.pop();
            }
        }
        System.out.println(stack.empty());
    }
}

