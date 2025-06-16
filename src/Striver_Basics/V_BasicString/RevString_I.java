import java.util.Scanner;

// This is the Classname.
public class RevString_I {

    // We will be using the static method for test while we can also create other class for this.
    // But if we create two classes, then we have created the instance of them, so for small practices it's lengthy;
    public static void reverse1(char[] s){

        int start = 0;                  // Set Start
        int end = s.length - 1;         // Set end (-1 because-of-array, 0-based indexing)

        while(start<end){               // Taking two pointers
            char temp = s[start];       // Swapping
            s[start] = s[end];
            s[end] = temp;
            start++;                    // After swap increment start;
            end--;                      // and decrement the end
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();      // char does not have the nextChar() so use sc.next().toCharArray();
                                                  // if you need multiline input the use sc.nextLine().toCharArray;
        reverse1(ch);

        for (char ans : ch){                      //Enhanced for loop for traversing each element
            System.out.print(ans);
        }
    }
}