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

            if(ele > maxEle){
                maxEle = ele;
                maxFreq = freq;
            }
            else if(ele == maxEle){
                maxEle = Math.min(maxEle, ele);
            }
        }
        return maxEle;
    }

    public static void main(String[] args){
        int[] nums = {1,1,2,33,54,54};
        MostOccuOptimal Sol2 = new MostOccuOptimal();
        int answer2 = Sol2.solution2(nums);
        System.out.println(answer2);

    }





}