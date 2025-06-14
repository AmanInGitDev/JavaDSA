import java.util.HashMap;
import java.util.Map;

class SecMostOccuOptimal {

    public int solution2(int[] nums){
        int n = nums.length;
        int maxEle = -1, secmaxEle = -1;
        int maxFreq = 0, secmaxFreq = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i=0; i<n; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }

        for (Map.Entry<Integer, Integer> let: mpp.entrySet()){
            int ele = let.getKey();
            int freq = let.getValue();

            if(freq > maxFreq){
                secmaxFreq = maxFreq;
                maxFreq = freq;

                secmaxEle = maxEle;
                maxEle = ele;
            }
            else if(freq == maxFreq){
                maxEle = Math.min(maxEle, ele);
            }
            else if(freq>secmaxFreq){
                secmaxFreq = freq;
                secmaxEle = ele;
            }
            else if(freq == secmaxFreq){
                secmaxEle = Math.min(secmaxEle, ele);
            }
        }
        return secmaxEle;
    }

    public static void main(String[] args){
        int[] nums = {4, 4, 5, 5, 6, 7};
        SecMostOccuOptimal Sol2 = new SecMostOccuOptimal();
        int answer2 = Sol2.solution2(nums);
        System.out.println(answer2);

    }
}