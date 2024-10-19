public class variablebasic {
    public static void main(String[] args) {

        int x = 6;
        int y = 5;
        int z = x+y;
        System.out.println(z);

        float l = 2.63636f;  // F/f should at the end at it doesn't default datatype
        System.out.println(l);

        double a = 3.12312131213;
        double b = 123.123123123;
        float c = (float) (a+b);  // You need to add the " (datatype) " for output at its not default one
        System.out.println(c);

        char d = '=';
        System.out.println(d);
        //We can write anything as character, but it should only 1

        char q = '/'+'=';
        System.out.println(q);
        //Here this concept is not learnt, here char change this lateerls  (/) or (=) in binary code and then add,
        //According to the given condition, and then it check which character is equivalent to it and then give the output.


        byte f = 127;
        short g = 32767;
        System.out.println(f);
        System.out.println(g);

        long h = 9223372036854775807L;  // L/l should at the end at it doesn't default datatype
        System.out.println(h);

        boolean s = true;
        System.out.println(s);

    }
}
