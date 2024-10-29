package Stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(4);
        st.pop();
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        st.push(5);
        System.out.println(st);
        System.out.println(st.size());
    }
}
