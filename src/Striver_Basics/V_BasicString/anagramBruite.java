import java.util.Arrays;

public class anagramBruite {
    public boolean validAnagram(String s, String t){
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args){
        String str1 = "aman";
        String str2 =  "adad";
        anagramBruite solution = new anagramBruite();
        boolean ans = solution.validAnagram(str1, str2);
        System.out.println(ans);
    }
}

