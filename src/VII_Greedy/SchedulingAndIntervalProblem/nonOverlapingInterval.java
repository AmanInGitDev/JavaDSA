package VII_Greedy.SchedulingAndIntervalProblem;

import java.util.Arrays;

public class nonOverlapingInterval {
    public int MaximumNonOverlappingIntervals(int[][] Intervals) {
        //[[1, 3], [1, 4], [3, 5], [3, 4], [4, 5]]
        int n = Intervals.length;
        Arrays.sort(Intervals, (a, b) -> a[1] - b[1]);
        //[[1, 3], [1, 4], [3, 4], [3, 5], [4, 5]]
        System.out.println(Intervals);

        int count = 1;
        int IntervalsLim = Intervals[0][1];
        for(int i = 1; i < n ; i++){
            if(IntervalsLim <= Intervals[i][0]){
                count++;
            }
            IntervalsLim = Intervals[i][1];
        }
        return n-count;
    }

    public static void main(String[] args) {
        nonOverlapingInterval obj = new nonOverlapingInterval();
        int[][] intervals = {{0, 5}, {3, 4}, {1, 2}, {5, 9}, {7, 9}};

        for (int i = 0; i < intervals.length; i++) {
            System.out.println("Interval " + (i + 1) + " Start: " + intervals[i][0] + " End: " + intervals[i][1]);
        }

        int ans = obj.MaximumNonOverlappingIntervals(intervals);
        System.out.println("Maximum Non-Overlapping Intervals: " + ans);
    }
}