package VII_Greedy.SchedulingAndIntervalProblem;
import java.util.Arrays;

public class jobSequnProblem {
    public int[] JobScheduling(int[][] jobs) {
        Arrays.sort(jobs,(a, b)->b[2]-a[2]);

        int totalprofitotal=0;
        int jobcount=0;

        int maxdeadline=-1;
        for(int[] curr:jobs){
            maxdeadline=Math.max(maxdeadline,curr[1]);
        }

        int[] hArr = new int [maxdeadline+1];
        Arrays.fill(hArr, -1);

        for (int i = 0; i < jobs.length; i++){
            for (int j = jobs[i][1]; j > 0; j--){
                if (hArr[j] == -1) {
                    jobcount++;
                    hArr[j] = jobs[i][0];
                    totalprofitotal += jobs[i][2];
                    break;
                }
            }
        }
        return new int[] {jobcount,totalprofitotal};
    }
    public static void main(String[] args) {
        int[][] jobs = {{1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}};

        jobSequnProblem solution = new jobSequnProblem();
        int[] result = solution.JobScheduling(jobs);

        // Output the result
        System.out.println("Number of Jobs: " + result[0]);
        System.out.println("Maximum Profit: " + result[1]);
    }
}