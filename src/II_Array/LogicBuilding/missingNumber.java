import java.util.Arrays;

public class missingNumber {
    public void missing(int[] nums) {
        int n = nums.length;

    }

    public static void main(String[] args){
        int[] nums = {2,4,6,0,3,1,0};

        missingNumber solution = new missingNumber();
        solution.missing(nums);

        System.out.println("Answer: ");
        System.out.println(Arrays.toString(nums));
    }
}
