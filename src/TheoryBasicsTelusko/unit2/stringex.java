public class stringex {
    public static void main(String[] args) {

        String s1 = "Hello World";
        String ex1="knock knock";
        // This is a general method we use . It will directly create object so its more easy
        System.out.println(s1);

//______________________________________________________________________________________________________________________

        String ex = new String("My name is Aman");
        //This is structured way to store data
        System.out.println(ex);


        System.out.println("Hello " +ex);
        System.out.println(ex.charAt(0));
        // We have to print all String properties we can use with code

//______________________________________________________________________________________________________________________

        //String Constant Pool
        // or this concept is called string literals
        String s2 = "Aman";
        String s3="Aman";
        // If you are thinking the data will be stored on different location then you are wrong
        // In this if the String content is same then it will store to one single address rather than
        // creating the another heap memory location so that's how String constant pool works

        System.out.println( s2+ " "+ s3);

//______________________________________________________________________________________________________________________

        // Mutable String

        StringBuffer sb = new StringBuffer("Hello World");
        // We use this syntax (Buffer Method) to make a mutable string.

        System.out.println(sb.capacity());
        //capacity is already have size 16 byte memory in by default, meaning once it is created,its content cannot change
        //therefore the memory allocated for a string is exactly the size of the characters it contains.

        System.out.println(sb.length());
        // This (.length) gives the length of the string as we know

        System.out.println(sb.append(" good morning"));
        //append is use for to append(add) the character in string(sting buffer or string builder)
        //they are almost same but StringBuffer is thread safe and StringBuilder is not)

//______________________________________________________________________________________________________________________

        // HomeWork - Deal with diffrent string operation.

    }
}
