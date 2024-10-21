package BitManipulation;

public class singlenumber3 {
    public static int[] singlenum3(int []nums){
        int xor = 0;
        for (int i : nums) {
            xor=xor^i;
        }
        int diffBit = (xor & xor-1)^xor;
        int x = 0, y = 0;
        for (int num : nums) {
            if ((num & diffBit) != 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }
        return new int[]{x,y};
    }
}
