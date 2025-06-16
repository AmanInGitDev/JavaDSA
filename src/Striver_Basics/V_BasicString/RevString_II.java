// We will be using the Collection vector and a method as Arrays.asList()
import java.util.Arrays;
import java.util.Vector;

// This is the classname
class RevString_II{

    //Similarly a static block of function;
    public static void reverse2(Vector<Character> ch){

        int start = 0;                        // Start is set two 0;
        int end = ch.size() -1;               // End is set to size() - 1 because.......;

        while (start<end){                    // Using two pointers
            char temp = ch.get(start);        // Set temp to store start: Here we use .get();
            ch.set(start, ch.get(end));       // Here we set the start value from end: Here we use .set(What to set,  from where)
            ch.set(end, temp);                // Here we set end from temp: .set(What to set, from where)
            start++;                          // Increase the pointer from start
            end--;                            // Decrease the pointer from end
        }
    }

    public static void main(String[] args){

        // Vector is used to store dynamic DS so here we will be using this
        Vector<Character> ch = new Vector<>(Arrays.asList('A','M','A','N'));
        reverse2(ch);
        System.out.println(ch);
    }
}


























//import java.util.Arrays;
//import java.util.Vector;
//
//public class RevString_II {
//
//    public static void Reverse1(Vector<Character> s){
//        int start = 0;
//        int end = s.size() - 1;
//
//        while(start < end){
//            char ch = s.get(start);
//            s.set(start, s.get(end));
//            s.set(end, ch);
//            start++;
//            end--;
//        }
//    }
//
//    public static void main(String[] args) {
//        Vector<Character> str = new Vector<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));
//
//        // call the static method directly
//        Reverse1(str);
//
//        for (char c : str) {
//            System.out.print(c);
//        }
//    }
//}