/*
N meetings in one room
    Given one meeting room and N meetings represented by two arrays, start and end, where start[i] represents the start time of the ith meeting and end[i] represents the end time of the ith meeting, determine the maximum number of
    meetings that can be accommodated in the meeting room if only one meeting can be held at a time.

    Examples:
    Input : Start = [1, 3, 0, 5, 8, 5] , End = [2, 4, 6, 7, 9, 9]
    Output : 4
    Explanation : The meetings that can be accommodated in meeting room are (1,2) , (3,4) , (5,7) , (8,9).
 */

package VII_Greedy.SchedulingAndIntervalProblem;

import java.util.*;

public class nMeetingInOneRoom {

   public int maxMeetings(int[] start, int[] end) {
        int n = start.length;
        // [1, 3, 0, 5, 8, 5] , End = [2, 4, 6, 7, 9, 9]
        List<int[]> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meetings.add(new int[]{start[i], end[i]});
        }
        //[{1,2}, {3,4}, {0,6}, {5,7}, {8,9}, {5,9}]
        Collections.sort(meetings, (a, b) -> Integer.compare(a[1], b[1]));

        int limit = meetings.get(0)[1];
        int count = 1;

        for(int i = 1; i < n; i++){
            if(meetings.get(i)[0] > limit) {
                limit = meetings.get(i)[1];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        nMeetingInOneRoom obj = new nMeetingInOneRoom();
        // Start and end times of the meetings
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        // Get the maximum number of meetings that can be held
        int maxMeetings = obj.maxMeetings(start, end);
        // Output the maximum number of meetings
        System.out.println("Maximum number of meetings: " + maxMeetings);
    }
}