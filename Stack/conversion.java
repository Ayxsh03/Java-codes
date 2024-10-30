package Stack;

import java.util.Stack;

public class conversion {

    public static String infixToPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Pop the opening bracket
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Convert Infix to Prefix
    public static String infixToPrefix(String expression) {
        // Step 1: Reverse the infix expression
        String reversed = new StringBuilder(expression).reverse().toString();

        // Step 2: Replace '(' with ')' and vice versa
        char[] chars = reversed.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                chars[i] = ')';
            } else if (chars[i] == ')') {
                chars[i] = '(';
            }
        }

        // Step 3: Convert to postfix
        String postfix = infixToPostfix(new String(chars));

        // Step 4: Reverse the postfix result to get the prefix expression
        return new StringBuilder(postfix).reverse().toString();
    }

    // Convert Prefix to Infix
    public static String prefixToInfix(String expression) {
        Stack<String> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
        }

        return stack.pop();
    }

    // Convert Prefix to Postfix
    public static String prefixToPostfix(String expression) {
        Stack<String> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = op1 + op2 + c;
                stack.push(temp);
            }
        }

        return stack.pop();
    }

    // Convert Postfix to Prefix
    public static String postfixToPrefix(String expression) {
        Stack<String> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String temp = c + op1 + op2;
                stack.push(temp);
            }
        }

        return stack.pop();
    }

    // Convert Postfix to Infix
    public static String postfixToInfix(String expression) {
        Stack<String> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
        }

        return stack.pop();
    }
    public static int precedence(char c){
        if (c == '^') return 3;
        else if (c == '/' || c == '*') return 2;
        else if (c == '+' || c == '-') return 1;
        else return -1;
    }

}
