import java.util.*;

class insertInterval{
    public int[][] insertNewInterval(int[][] intervals, int[] newInterval) {
        //intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
        int n = intervals.length;
        List<int[]> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(intervals[i][1] < newInterval[0]){
                ans.add(intervals[i]);
            }
            else if(intervals[i][0] > newInterval[1]){
                ans.add(newInterval);
                newInterval = intervals[i];
            }
            else{
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }
        ans.add(newInterval);

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        insertInterval sol = new insertInterval();
        int[][] intervals = {{1, 2}, {3, 4}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {5, 8};

        System.out.print("Intervals Array: ");
        for (int[] interval : intervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "], ");
        }
        System.out.println();

        System.out.print("New Interval to be Inserted: ");
        System.out.println("[" + newInterval[0] + ", " + newInterval[1] + "]");

        int[][] result = sol.insertNewInterval(intervals, newInterval);
        System.out.print("Resulting Intervals after Insertion: ");
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "], ");
        }
        System.out.println();
    }
}