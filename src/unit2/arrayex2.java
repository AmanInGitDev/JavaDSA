public class arrayex2
    {
        public static void main(String[] args)
        {
            // Multi Dimentional Array
//______________________________________________________________________________________________________________________

            int multidim1[][] = new int[3][3];

            multidim1 [0][0] = 1;
            multidim1 [0][1] = 2;
            multidim1 [0][2] = 3;
            multidim1 [1][0] = 4;
            multidim1 [1][1] = 5;
            multidim1 [1][2] = 6;
            multidim1 [2][0] = 7;
            multidim1 [2][1] = 8;
            multidim1 [2][2] = 9;

            // Here we are dealing with number we want to print so after declaring the array we have to right
            // the value which we want to put by using above syntax

            for(int i = 0; i < 3; i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(multidim1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            // Here We are using two loops as we know this is 2D array and as we want to make it formal we need to
            // add newline sout so we can visualiize better
//______________________________________________________________________________________________________________________

            //Another Method by using random function

            int multidim2[][] = new int[3][3]; // here in int we have to limit the size of the array

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    multidim2[i][j] = (int) (Math.random() * 100);
                    System.out.print(multidim2[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println();

            //Math.random is use for to print random number we are using this for printing the random number
            // also this function prints the value in (0.something) so we are multiplying into 100 so we can get real
            // value suitable for illustrating example.

//______________________________________________________________________________________________________________________
            
            //Another Method use for to print 2-D array in a better way by using For each loop

            for(int n[] : multidim1)//use ':' for assign the n as  array here n is a n individual 1-d array
            {
                for(int m:n)
                {
                    System.out.print(m+" ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }