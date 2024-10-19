package unit1;

public class conversion {
    public static void main(String[] args) {
        int a = 5;
        byte b = 111; // b=(byte)111;
        a = b;    // This is conversion
        System.out.println(a);

        int c = 10;
        byte d = 126;
        d = (byte) c;  // This is casting
        System.out.println(c);

        //a=b is possible as an  int it has more memory space than byte that's why it gives an output
        //but b=a directly not possible as it is as small as compare to the int so we have first
        //converted int as byte then assign to the value of byte b=(byte)a is possible.

        int x = (int) 5.7;
        System.out.println(x);
        //float 4 byte and int is of 4 byte it is another example of casting.
        // here you can lose decimal value of float bcoz int cannot provide you the decimal value
        //as float is like big container and int is small container in which you can put small container in big
        // but not vice versa.

        int e = 259;
        byte f = (byte) e;
        System.out.println(f);
        //It's like a container of 256 boxes where this there capacity if we exceed the capacity and tried to casting,
        // then it will perform modulus operation and if the value is 260 it will divide with 256 and give reminder as 4
        // and the final output will be 4

        byte k = 10;
        byte l = 40;
        int result = k * l;
        System.out.println(result);
        //type promotion, if the multiplication of byte is in the result of byte but here as the result
        //is in the type of integer that's why it promotes and give answer more than 256 which is peak value of byte

    }
}
