package V_Recursion.ImplementationProblem;

import java.util.ArrayList;

public class leadersInArrayBruite {

    public ArrayList<Integer> leader(int[] nums){
        int n = nums.length;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++){
            boolean isFound = true;
            for (int j = i + 1; j < n; j++){
                if(nums[i] < nums[j]){
                    isFound = false;
                    break;
                }
            }
            if(isFound){
                answer.add(nums[i]);
            }
        }
        return answer;
    }


    public static void main(String[] args){
        int[] nums = {1,5,6,3,58,83,44,11};

        leadersInArrayBruite solution = new leadersInArrayBruite();
        ArrayList<Integer> answer = solution.leader(nums);

        for (int num : answer){
            System.out.print(num+" ");
        }
    }
}
