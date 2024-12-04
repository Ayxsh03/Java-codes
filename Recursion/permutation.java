package Recursion;
import java.util.ArrayList;
import java.util.List;

public class permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> initialProcessed = new ArrayList<>();
        generatePermutations(initialProcessed, nums, 0, result);
        return result;
    }

    private void generatePermutations(List<Integer> processed, int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(processed));
            return;
        }
        int current = nums[index];
        for (int i = 0; i <= processed.size(); i++) {
            List<Integer> newProcessed = new ArrayList<>(processed);
            newProcessed.add(i, current); // Insert the current element at position i
            generatePermutations(newProcessed, nums, index + 1, result); // Recursive call for the next element
        }
    }
}
