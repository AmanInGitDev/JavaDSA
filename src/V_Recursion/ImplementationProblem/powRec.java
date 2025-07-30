public class powRec {
    public double myPow(double x, int n) {
        if(n==0){
            return  1;
        }
        if(n==1){
            return x;
        }
        
        if(n%2==0){
            return myPow(x*x,n/2);
            
        }
        if(n<0){
            return 1/myPow(x,-n);
            
        }
        
        return x*myPow(x,n-1);
        
    }
    
    public static void main(String[] args) {
        powRec sol = new powRec();
        // Output: 1024.0000
        System.out.printf("%.4f\n", sol.myPow(2.0000, 10));
        // Output: 0.2500
        System.out.printf("%.4f\n", sol.myPow(2.0000, -2));
    }
}
