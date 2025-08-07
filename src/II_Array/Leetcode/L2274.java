package II_Array.Leetcode;

public class L2274 {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int answer = 0;
        int count = 0;
        for(int i = bottom; i < top; i++){
            
            for(int j = 0; j < special.length; j++){
                if(i == j)
                    break;
                count++;
                answer =  Math.max(count, answer);
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        L2274 sol = new L2274();
        int bottom = 2;
        int top = 9;
        int[] special = {4, 6};
        int result = sol.maxConsecutive(bottom, top, special);
        System.out.println(result);
    }
}
