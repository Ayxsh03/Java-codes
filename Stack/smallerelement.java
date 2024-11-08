package Stack;

import java.util.Stack;

public class smallerelement {
    public static int[] previousSmallerElementLeft(int[] nums) {
        int n = nums.length;
        int[] pse = new int[n];  
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i<n; i++) {
            while (!st.isEmpty() && st.peek() >= nums[i]) st.pop();
            if (st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek(); 
            st.push(nums[i]);
        }
        return pse;
    }
    public static int[] previousSmallerEqualElementLeft(int[] nums) {
        int n = nums.length;
        int[] pse = new int[n];  
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i<n; i++) {
            while (!st.isEmpty() && st.peek() > nums[i]) st.pop();
            if (st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek(); 
            st.push(nums[i]);
        }
        return pse;
    }
    public static int[] nextSmallerElementRight(int[] nums) {
        int n = nums.length;
        int[] nse = new int[n];  
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i>=0; i--) {
            while (!st.isEmpty() && st.peek() >= nums[i]) st.pop();
            if (st.isEmpty()) nse[i] = -1;
            else nse[i] = st.peek(); 
            st.push(nums[i]);
        }
        return nse;
    }
}
