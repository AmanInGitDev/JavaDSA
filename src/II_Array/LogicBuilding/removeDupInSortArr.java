import java.util.Arrays;

public class removeDupInSortArr {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int index = 1;
        for (int i = 1; i < n; i++){
            if(nums[i] != nums[i-1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] nums = {2,4,4,5,6,77,77,92};

        removeDupInSortArr solution = new removeDupInSortArr();
        int answer =  solution.removeDuplicates(nums);
        System.out.println(answer);
    }
}
