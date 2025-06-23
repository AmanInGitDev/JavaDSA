public class LinearSearch {

    public int ls(int[] arr, int taget){
        int n = arr.length;;
        for (int i = 0; i < n; i++){
            if (arr[i] == taget)
                return i;
        }
        return -1;
    }

    public static void main (String[] args){
        int[] arr = {2,3,5,9,5,2,45};
        int target = 9;

        LinearSearch solution = new LinearSearch();
        int answer = solution.ls(arr,target);

        System.out.println(answer);
    }
}
