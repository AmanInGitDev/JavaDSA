package Striver_Basics.IV_BasicHash;

import java.util.*;

class SumHighAndLowFrqOpti {
    public int solution3(int[] nums) {
        int n=nums.length;
        int sfreq=Integer.MAX_VALUE;
        int mfreq=Integer.MIN_VALUE;
        int freq=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> ans:map.entrySet()){
            int element=ans.getKey();
                freq=ans.getValue();
                
                if(freq>mfreq){
                    mfreq=freq;
                }
                else if (freq<mfreq) {
                    sfreq=freq;
                }
        }
        
        return mfreq+sfreq;
    }

    public static void main(String[] args){
        int[] nums = {4, 4, 4, 5, 5, 6, 7};
        SumHighAndLowFrqOpti sol3 = new SumHighAndLowFrqOpti();
        int answer3 = sol3.solution3(nums);
        System.out.println(answer3);
    
    }
}


