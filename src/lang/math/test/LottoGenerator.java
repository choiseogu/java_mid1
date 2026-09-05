package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private Random random = new Random();
    private int[] nums = new int[6];

    public int[] createNum() {
        int count = 0;
        while (count < 6) {
            int randomNum = random.nextInt(45) + 1;
            if (numDupl(randomNum, nums)) {
                nums[count] = randomNum;
                count++;
            }
        }
        return nums;
    }

    private boolean numDupl(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                return false;
            }
        }
        return true;
    }
}
