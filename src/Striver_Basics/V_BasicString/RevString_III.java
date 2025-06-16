import java.util.*;

public class RevString_III {

    public static void reverse3(Vector<Character> s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s) {
            stack.push(c);
        }

        for (int i = 0; i < s.size(); ++i) {
            s.set(i, stack.pop());
        }
        return;
    }

    public static void main(String[] args) {
        Vector<Character> str =
                new Vector<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));

        RevString_III sol = new RevString_III();
        sol.reverse3(str);

        for (char c : str) {
            System.out.print(c);
        }
    }
}

