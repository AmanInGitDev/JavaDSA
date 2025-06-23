public class MaxElement {

    public int ls(int[] arr){
        int n = arr.length;;
        int max = arr[0];  // I made a mistake here placing as 0, but it will fail for a negative number.

        for (int i = 0; i < n; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main (String[] args){
        int[] arr = {2,3,5,9,5,2,45};

        MaxElement solution = new MaxElement();
        int answer = solution.ls(arr);

        System.out.println(answer);
    }
}

