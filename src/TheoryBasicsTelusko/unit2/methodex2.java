class calsi1 {

    public int Addition(int a, int b){
        int result = a + b;
        System.out.println("The addition is: "+result);
        return 0;
    }

    public int Subtraction(int a, int b){
        int result  = a - b;
        System.out.println("The subtraction is: "+result);
        return 0;
    }

    public int Multiplication(int a, int b){
        return a * b;
    }

    public int Division(int a, int b){
        return a / b;
    }

}


public class methodex2 {
    public static void main(String[] args)
    {
        calsi1 MyCal = new calsi1();
        // Here we are creating the new object using class 'calsi' the object name can be anything using this name
        // We can use any method in this class its like creating a product for an idea.

        MyCal.Addition(13, 2);
        MyCal.Subtraction(10, 2);
        // Here we are only passing the values and the operation and output will be given by the method we are calling

        int result1 = MyCal.Multiplication(13, 2);
        System.out.println("The Multiplication is: "+result1);

        int result2 = MyCal.Division(10, 2);
        System.out.println("The Division is: "+result2);

        // This is the another way we can directly do operation by creating a new variable and
        // This is used in main class where we only pass the value to the method
    }
}


