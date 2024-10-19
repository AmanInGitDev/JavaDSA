// Every object has property and behavior


class calculator{
    public int add(int num1, int num2){     //Why parameterized method?
        int r = num1+num2;
        System.out.print("Addition is ");
        return r;
    }
}
// here we can see the actual use of class and the use of it
// As we have to perform a specific operations so we created a class named as calculator
// In this we have taken a method which consist parameter in (Parameterized Constructor)
//Then we performed the operation and returned the result as 'r'.

public class classex {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        calculator calc = new calculator();
        int result = calc.add(num1,num2);
        System.out.print(result);
    }
}
//This is the main class where we are creating an object to use calculator class
//Where we can pass values by taking variables also pushing the values into () also


