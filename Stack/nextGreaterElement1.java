/*
The next greater element of some element x in an array is the first greater element that is to 
the right of x in the same array.You are given two distinct 0-indexed integer arrays nums1 and nums2, 
where nums1 is a subset of nums2.For each 0 <= i < nums1.length, find the index j such that 
nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no 
next greater element, then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 */
package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElement1 {
    
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];  
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) st.pop();
            if (st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek(); 
            st.push(nums[i]);
        }
        return nge;
    }

    public static int[] previousGreaterElementLeft(int[] nums) {
        int n = nums.length;
        int[] pge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) st.pop();
            if (st.isEmpty()) pge[i] = -1;
            else pge[i] = st.peek(); 
            st.push(nums[i]);
        }
        return pge;
    }

    public int[] nextGreaterElementI(int[] nums1, int[] nums2) {
        if (nums2.length == 0 || nums1.length == 0)
            return new int[0];
        Map<Integer, Integer> numberNGE = new HashMap<>();
        Stack<Integer> numStack = new Stack<>();

        numStack.push(nums2[nums2.length - 1]);
        numberNGE.put(nums2[nums2.length - 1], -1);

        for (int i = nums2.length - 2; i >= 0; i--) {
            if (nums2[i] < numStack.peek()) {
                numberNGE.put(nums2[i], numStack.peek());
                numStack.push(nums2[i]);
                continue;
            }

            while (!numStack.isEmpty() && numStack.peek() < nums2[i])
                numStack.pop();

            if (numStack.isEmpty()) {
                numStack.push(nums2[i]);
                numberNGE.put(nums2[i], -1);
            } else {
                numberNGE.put(nums2[i], numStack.peek());
                numStack.push(nums2[i]);
            }
        }
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = numberNGE.get(nums1[i]);
        return nums1;
    }

    public static int[] nextGreaterElementsII(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack < Integer > st = new Stack < > ();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return nge;
    }

}
