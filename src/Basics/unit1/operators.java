public class operators {
    public static void main(String[] args) {

        // ASSIGNMENT OPERATORS

        int a = 5;
        int b = 8;
        int result1 = a/b;
        System.out.println(result1);
        // The '/' operator only gives quotient where the '%' operator only gives reminder.

        int c = 29;
        int result2 = ++c;  // Pre-increment works here not post-increment
        System.out.println(result2);
        // as ++c and c++ both are increment operator, and they work when they are in individual statement.
        // but when we call it during new line it works differently.


        // RELATIONAL OPERATOR - <,>,==,!,!=,<=,>= are some operators in this

        int d = 12;
        int e = 11;
        boolean f = e < d;
        System.out.println(f);

        // LOGICAL OPERATORS -

        int g = 18;
        int h = 17;
        int i = 38;
        boolean j = g>h && h<i;
        System.out.println(j);
        System.out.println(!j);





    }
}
