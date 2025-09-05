package VIII_SlidingWindowAndTwoPointer.ConstantWindow;

public class MaxPointFromCard {
    public int maxScore(int[] cardScore, int k) {
        int n = cardScore.length;
        int leftsum=0;
        for(int i=0;i<k;i++){
            leftsum+=cardScore[i];
        }
        int maxsum=leftsum;
        int rightindex=n-1;
        int rightsum=0;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-cardScore[i];
            rightsum=rightsum+cardScore[rightindex];
            rightindex--;
            maxsum=Math.max(maxsum,rightsum+leftsum);
        }
        return maxsum;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        
        // Create an instance of the Solution class
        MaxPointFromCard sol = new MaxPointFromCard();
        
        int result = sol.maxScore(nums, 3);
        
        // Output the maximum score
        System.out.println("The maximum score is:");
        System.out.println(result);
    }
}
