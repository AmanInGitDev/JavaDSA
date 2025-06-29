import java.util.Set;
import java.util.TreeSet;

public class unionOfSortArr2 {
    public int[] unionArray (int[] a, int[] b){
        Set<Integer> set = new TreeSet<>();

        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }

        int[] union = new int[set.size()];
        int index = 0;
        for (int num : set) {
            union[index++] = num;
        }
        return union;
    }

    public static void main(String[] args){
        int[] a = {2,4,6,0,3,1,0};
        int[] b = {4,13,5,8};

        unionOfSortArr2 solution = new unionOfSortArr2();
        int[] answer = solution.unionArray(a,b);

        System.out.print("Union of a and b is: ");
        for (int val : answer) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
