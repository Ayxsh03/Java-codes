package Stack;
import java.util.Stack;

public class infixprefixpostfix {
    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            // If the character is an operand (letters or digits)
            if ((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z') || (c[i] >= '0' && c[i] <= '9')) {
                ans += c[i];
            }
            // If the character is an opening bracket
            else if (c[i] == '(') {
                st.push(c[i]);
            }
            // If the character is a closing bracket
            else if (c[i] == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                st.pop(); // pop the opening bracket
            }
            // Operators
            else {
                while (!st.isEmpty() && 
                       ((prec(c[i]) < prec(st.peek())) || (prec(c[i]) == prec(st.peek()) && c[i] != '^'))) {
                    ans += st.pop();
                }
                st.push(c[i]);
            }
        }
        // Pop all the remaining operators in the stack
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        return ans;
    }


    public static String infixToPrefix(String s) {
        // Step 1: Reverse the infix expression
        String s2 = new StringBuilder(s).reverse().toString();
        Stack<Character> st = new Stack<>();
        String ans = "";
        // Step 2: Replace '(' with ')' and vice versa
        char[] c = s2.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                c[i] = ')';
            } else if (c[i] == ')') {
                c[i] = '(';
            }
        }
        for (int i = 0; i < c.length; i++) {
            // If the character is an operand (letters or digits)
            if ((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z') || (c[i] >= '0' && c[i] <= '9')) {
                ans += c[i];
            }
            // If the character is an opening bracket
            else if (c[i] == '(') {
                st.push(c[i]);
            }
            // If the character is a closing bracket
            else if (c[i] == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                st.pop(); // pop the opening bracket
            }
            // Operators
            else {
                while (!st.isEmpty() && (prec(c[i]) < prec(st.peek()) || 
                  (c[i] != '^' && prec(c[i]) == prec(st.peek())))) {
                ans+=st.pop();
            }
            st.push(c[i]);
            }
        }
        // Pop all the remaining operators in the stack
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        // Step 4: Reverse the postfix result to get the prefix expression
        return new StringBuilder(ans).reverse().toString();
    }

    public static int prec(char c) {
        if (c == '^') return 3;
        else if (c == '/' || c == '*') return 2;
        else if (c == '+' || c == '-') return 1;
        else return -1;
    }
}
