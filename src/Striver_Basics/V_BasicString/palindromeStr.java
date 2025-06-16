class palindrome{
    public boolean palindromeCheck(String ch){
        int start = 0;
        int end = ch.length() - 1;

        while (start<end){
            if (ch.charAt(start) != ch.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class palindromeStr {

    public static void main(String[] args) {
        palindrome sol = new palindrome();
        String str = "ARARA";
        if (sol.palindromeCheck(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

