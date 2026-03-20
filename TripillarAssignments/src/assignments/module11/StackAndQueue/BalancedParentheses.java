package assignments.module11.StackAndQueue;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "{[()]}";
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        if (st.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}