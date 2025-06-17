package Striver_Basics.V_BasicString;

public class rotateStringOptimal {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String ans = s + s;
        if(ans.contains(goal)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        rotateStringOptimal sol = new rotateStringOptimal();
        System.out.println(sol.rotateString("abcde", "cdeab"));
        System.out.println(sol.rotateString("abcde", "abced"));
    }
}
