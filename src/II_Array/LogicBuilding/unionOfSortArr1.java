import java.util.Arrays;

public class unionOfSortArr1 {
    public int[] unionArray (int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;

        int[] temp = new int[n1+n2];
        int index = 0;
        for (int num : a) temp[index++] = num;
        for (int num : b) temp[index++] = num;
        Arrays.sort(temp);

        int[] union = new int[temp.length];
        union[0] = temp[0];
        int unionIndex = 1;

        for(int i = 1; i < temp.length; i++){
            if (temp[i] != temp[i-1]){
                union[unionIndex++] = temp[i];
            }
        }
        return Arrays.copyOf(union, unionIndex);
    }

    public static void main(String[] args){
        int[] a = {2,4,6,0,3,1,0};
        int[] b = {4,13,5,8};

        unionOfSortArr1 solution = new unionOfSortArr1();
        int[] answer = solution.unionArray(a,b);

        System.out.print("Union of a and b is: ");
        for (int val : answer) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
