import java.util.Arrays;

class longCommPrefix{
    public String longestCommonPrefix(String[] s){
        StringBuilder ans = new StringBuilder();
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length - 1];

        for (int i = 0; i < Math.min(first.length(),last.length()); i++){
            if (first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }



    public static void main(String[] args){
        longCommPrefix solution = new longCommPrefix();
        String[] str = {"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(str);
        System.out.println("Longest Common Prefix: " + result); // Output: "fl"
    }
}












































//import java.util.Arrays;
//
//public class longCommPrefix {
//
//    public String longestCommonPrefix(String[] s){
//        StringBuilder ans = new StringBuilder();
//        Arrays.sort(s);
//        String start = s[0];
//        String end = s[s.length - 1];
//
//        for(int i = 0; i < Math.min(start.length(), end.length()); i++){
//            if(start.charAt(i) != end.charAt(i)){
//                return ans.toString();
//            }
//            ans.append(start.charAt(i));
//        }
//        return ans.toString();
//    }
//    public static void main(String[] args) {
//        longCommPrefix solution = new longCommPrefix();
//        String[] str = {"flower", "flow", "flight"};
//        String result = solution.longestCommonPrefix(str);
//        System.out.println("Longest Common Prefix: " + result); // Output: "fl"
//    }
//}
