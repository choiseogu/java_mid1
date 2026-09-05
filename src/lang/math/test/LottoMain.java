package lang.math.test;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] nums = lottoGenerator.createNum();

        System.out.print("로또 번호: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
