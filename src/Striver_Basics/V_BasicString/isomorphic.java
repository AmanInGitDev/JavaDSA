package Striver_Basics.V_BasicString;

public class isomorphic {
    public boolean isomorphicString(String s, String t){
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        int n = s.length();

        for ( int i = 0; i < n; i++){
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) return false;
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        isomorphic solution = new isomorphic();
        String s = "egg";
        String t = "add";
        if (solution.isomorphicString(s, t)) {
            System.out.println("Strings are isomorphic.");
        } else {
            System.out.println("Strings are not isomorphic.");
        }
    }
}
