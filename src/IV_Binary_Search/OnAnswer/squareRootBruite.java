
public class squareRootBruite {
    
    public long floorSqrt(long n) {
        long ans=0;
        for(long i=1;i<=n;i++){
            if(i*i<=n){
                ans=i;
            }
            else{
                break;
            }
        }
        return  ans;
    }
    
    public static void main(String[] args) {
        
        int n = 28;
        
        squareRootBruite sol = new squareRootBruite();
        
        long ans = sol.floorSqrt(n);
        
        // Print the result
        System.out.println("The floor of square root of " + n
                                   + " is: " + ans);
    }
}
