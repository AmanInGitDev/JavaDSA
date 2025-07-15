package IV_Binary_Search.LogicBuilding;
/*  Given a sorted array nums and an integer x. Find the floor and ceil of x in nums. The floor of x is the largest element in the array which is smaller than or equal to x.
    The ceiling of x is the smallest element in the array greater than or equal to x. If no floor or ceil exists, output -1.
    
    Examples: Input : nums =[3, 4, 4, 7, 8, 10], x= 5
    Output: 4 7
    
    Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.
*/

public class floorAndSeilInArrOpti {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int left = 0, right = n-1;
        int floor = -1, ceil = -1;
        
        int[] answer = new int[2];
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if(nums[mid] <= x){
                floor = nums[mid];
                left = mid + 1;
            }
            
            if (nums[mid] >= x){
                ceil = nums[mid];
                right = mid - 1;
            }
        }
        answer[0] = floor;
        answer[1] = ceil;
        return answer;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 5;
        floorAndSeilInArrOpti sol = new floorAndSeilInArrOpti();
        int[] res = sol.getFloorAndCeil(nums, x);
        System.out.println(res[0] + " " + res[1]);
    }
}
