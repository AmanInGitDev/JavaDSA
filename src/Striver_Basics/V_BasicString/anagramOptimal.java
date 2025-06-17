import java.util.Arrays;

public class anagramOptimal {
    public boolean validAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        int[] count = new int[26];

        for (char ch : s.toCharArray()){
            count[ch - 'a'] ++;
        }

        for (char ch : t.toCharArray()){
            count[ch - 'a'] --;
        }

        for (int i : count){
            if (i!=0)  return false;
        }
        return true;
    }

    public static void main(String[] args){
        String str1 = "aman";
        String str2 =  "nama";
        anagramOptimal solution = new anagramOptimal();
        boolean ans = solution.validAnagram(str1, str2);
        System.out.println(ans);
    }
}

