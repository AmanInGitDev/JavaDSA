import java.util.HashMap;
import java.util.Map;

class MostOccuOptimal{

    public int solution2(int[] nums){
        int n = nums.length;
        int maxEle = -1;
        int maxFreq = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i=0; i<n; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }

        for (Map.Entry<Integer, Integer> let: mpp.entrySet()){
            int ele = let.getKey();
            int freq = let.getValue();

            if(freq > maxFreq){
                maxEle = ele;
                maxFreq = freq;
            }
            else if(freq == maxFreq){
                maxEle = Math.min(maxEle, ele);
            }
        }
        return maxEle;
    }

    public static void main(String[] args){
        int[] nums = {4, 4, 5, 5, 6};
        MostOccuOptimal Sol2 = new MostOccuOptimal();
        int answer2 = Sol2.solution2(nums);
        System.out.println(answer2);

    }





}