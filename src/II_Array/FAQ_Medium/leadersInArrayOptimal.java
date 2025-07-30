package II_Array.FAQ_Medium;

import java.util.ArrayList;
import java.util.Collections;

public class leadersInArrayOptimal {

    public ArrayList<Integer> leader(int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();
        int n = nums.length;
        if (n == 0){
            return answer;
        }

        int max = nums[n-1];
        answer.add(max);
        int start = 0;
        for (int i  = n - 2; i >= 0; i--){
            if (nums[i] < max){
                start++;
            }
            else{
                answer.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(answer);
        return answer;
    }


    public static void main(String[] args){
        int[] nums = {1,5,222,6,3,58,83,44,11};

        leadersInArrayOptimal solution = new leadersInArrayOptimal();
        ArrayList<Integer> answer = solution.leader(nums);

        for (int num : answer){
            System.out.print(num+" ");
        }
    }
}
