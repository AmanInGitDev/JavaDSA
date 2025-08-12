package VII_Greedy.SchedulingAndIntervalProblem;

import java.util.Arrays;

public class ShortestJobFirst {
    public long solve(int[] bt) {
        int n = bt.length;
        Arrays.sort(bt);
        int waitTime = 0;
        int total = 0;
        for(int i = 0; i < n; i++){
            waitTime = total + waitTime;
            total = bt[i] + total;
        }
        int answer = waitTime/n;
        return answer;
    }

    // 4 1 3 7 2
    // 1 2 3 4 7
    // 0 1 3 6 10
    // 20/5
    // 4(answer)

    public static void main(String[] args) {
        int[] jobs = {4, 1, 3, 7, 2};

        System.out.print("Array Representing Job Durations: ");
        for (int job : jobs) {
            System.out.print(job + " ");
        }
        System.out.println();

        ShortestJobFirst solution = new ShortestJobFirst();
        long ans = solution.solve(jobs);
        System.out.println("Total waiting time: " + ans);
    }
}