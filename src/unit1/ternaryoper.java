public class ternaryoper {
    public static void main(String[] args) {

        //first approach
        int a = 4;
        int result = 0;

        if (a%2==0)
            result = 10;
        else
            result = 5;
        System.out.println(result);
        

        //second approach
        int b = 5;

        result = b%2 == 0 ? 20 : 5;
        System.out.println(result);
        // here ?: used for query means you are asking with computer to what will be the value in boolean
        // true : flase like that it gives the ans according to the given condition.



    }
}
