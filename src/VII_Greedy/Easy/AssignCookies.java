package VII_Greedy.Easy;

import java.util.Arrays;

public class AssignCookies {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        Arrays.sort(Student);
        Arrays.sort(Cookie);
        int m = Student.length, n = Cookie.length;
        int count = 0;  // There is no need to explicitely count, We can directly return the left counter
        int left = 0, right = 0;

        while(left < m && right < n){
            if(Student[left] <= Cookie[right]){
                count++;
                left++;
            }
            right++;
        }
        return count; // Here we can return the left as this is also equal to count and increases only when the condition is true simply as count;
    }

    public static void main(String[] args) {
        int[] Student = {2, 1};
        int[] Cookie = {1, 2, 3};

        AssignCookies solution = new AssignCookies();

        int result = solution.findMaximumCookieStudents(Student, Cookie);

        System.out.println("Number of students satisfied: " + result);
    }
}