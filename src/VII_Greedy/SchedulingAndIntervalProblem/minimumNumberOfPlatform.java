package VII_Greedy.SchedulingAndIntervalProblem;

import java.util.Arrays;

public class minimumNumberOfPlatform {
    public int findPlatform(int[] Arrival, int[] Departure) {
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        int n = Arrival.length;
        int m = Departure.length;
        int max = Integer.MIN_VALUE;
        int count = 0;

        int left = 0;
        int right = 0;

        while(left < n && right < m){
            if(Arrival[left] <= Departure[right]){
                count++;
                max = Math.max(count, max);
                left++;
            }
            else{
                count --;
                right++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {900, 945, 955, 1100, 1500, 1800};
        int[] dep = {920, 1200, 1130, 1150, 1900, 2000};

        // Creating an instance of Solution class
        minimumNumberOfPlatform sol = new minimumNumberOfPlatform();

        // Function call to find minimum number of platforms required
        int ans = sol.findPlatform(arr, dep);

        System.out.println("Minimum number of Platforms required: " + ans);
    }
}