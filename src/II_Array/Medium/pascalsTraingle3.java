import java.util.ArrayList;
import java.util.List;

public class pascalsTraingle3 {

    public List<List<Integer>> pascalTraingle (int n){
        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= n; row++){
            ans.add(rowGenerator(row));
        }
        return ans;
    }

    private List<Integer> rowGenerator (int row){
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);     // The first element is always 1

        int value = 1;
        for (int col = 1; col < row; col++){
            value = value * (row - col);
            value = value / col;
            ansRow.add((int)value);
        }
        return ansRow;
    }


    public static void main(String[] args) {
        int n = 5;
        pascalsTraingle3 sol = new pascalsTraingle3();
        List<List<Integer>> pascalTriangle = sol.pascalTraingle(n);

        for (List<Integer> row : pascalTriangle) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
