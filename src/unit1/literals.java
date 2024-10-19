
public class literals {
    public static void main(String[] args) {
        System.out.println("Hello World"); // sout (enter) is shortcut to write the full line.

        int a= 10_00_00_00_00;
        System.out.println(a);
        // here you can use underscore(_) as a invisible gap which is not shown in output.

        double b = 12342e12;
        System.out.println(b);
        //It gives the value on epsilon like if 12e10 is written it return 1.2E11 or 1223e12 = 1.223E15
        //it means that the number of decimals in output is presented as the sum in after e(epsilon) in given literal6

        char c = '@';
        c++;
        System.out.println(c);
        //here as java use unicode not ascii like other languages are used so the conversion of bytes is
        //different in unicode here is one of an example in which after increment of @ you will get output as A

    }

}

