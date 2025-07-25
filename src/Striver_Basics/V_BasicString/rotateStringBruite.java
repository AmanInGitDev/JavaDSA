public class rotateStringBruite {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        rotateStringBruite sol = new rotateStringBruite();
        System.out.println(sol.rotateString("abcde", "cdeab"));
        System.out.println(sol.rotateString("abcde", "abced"));
    }
}
