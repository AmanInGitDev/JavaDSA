class calsi2{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

}
//Method Overloading
public class methodex3 {
    public static void main(String[] args) {
        calsi2 MyCal2 = new calsi2();

        int result = MyCal2.add(1,2);
        System.out.println("The addition of Two number is: "+result);

        int result2 = MyCal2.add(1,2,22);
        System.out.println("The addition of three number is: "+result2);

    }
}
