public class arrayex1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        System.out.println(arr1[2]);
        //if we want to create an element with array then we will use above syntax where we don't need to
        // specify the size of an array and that is called as static array.
        System.out.println(" ");

        int[] result = new int[100];
        result[0] = 10;
        result[1] = 20;
        System.out.println("The result of Roll no 1 is " + result[0]);
        System.out.println("The result of Roll no 2 is " + result[1]);
        //if we want to create an element with dynamic array then we will use the above syntax here we need
        //to specify the size, and then we have to calling by its index and update the array.
        System.out.println(" ");

        int[] arr2 = {1,25,45,55,64};
        for (int i = 0; i <=4; i++) {
            System.out.print(" "+arr2[i]);
        }
        System.out.println();
        System.out.println();
        //We use for loop in the above format to print array


        //Use of Length property

        int[][] arr3 = new int[4][4];

        arr3[0][0] = 1;
        arr3[0][1] = 2;
        arr3[0][2] = 3;
        arr3[0][3] = 4;
        arr3[1][0] = 5;
        arr3[1][1] = 6;
        arr3[1][2] = 7;
        arr3[1][3] = 8;
        arr3[2][0] = 9;
        arr3[2][1] = 10;
        arr3[2][2] = 11;
        arr3[2][3] = 12;
        arr3[3][0] = 13;
        arr3[3][1] = 14;
        arr3[3][2] = 15;
        arr3[3][3] = 16;

        for (int i=0;i<arr3.length;i++)
        // .length is a keyword used for check the length of the datatype
            // it is useful to utilize the length we want to print (doesn't give exception)
        {
            for(int j=0;j<arr3[i].length;j++)
            {
                System.out.print(" "+arr3[i][j]);
            }
            System.out.println();
        }
    }
}
