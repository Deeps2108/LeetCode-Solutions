import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if (ch == ')' && c != '(') return false;
                if (ch == '}' && c != '{') return false;
                if (ch == ']' && c != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}