/*
    Check if String is Palindrome or Not
    Given a string s, return true if the string is palindrome, otherwise false.
    A string is called palindrome if it reads the same forward and backward.
    
    
    Examples:
        Input : s = "hannah"
        Output : true
        Explanation : The string when reversed is --> "hannah", which is same as original string , so we return true.
    
        Input : s = "aabbaaa"
        Output : false
        Explanation : The string when reversed is --> "aaabbaa", which is not same as original string, So we return false.

*/

public class palidromeUsingRec {
    public boolean palindromeCheck(String s) {
    return false;
    }
    

    public static void main(String[] args) {
        palidromeUsingRec solution = new palidromeUsingRec();
        System.out.println(solution.palindromeCheck("hannah")); // Output: true
        System.out.println(solution.palindromeCheck("aabbaaa")); // Output: false
        System.out.println(solution.palindromeCheck("aba")); // Output: true
    }
}
