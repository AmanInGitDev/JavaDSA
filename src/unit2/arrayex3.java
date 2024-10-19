public class arrayex3
{
    public static void main(String[] args)
    {
        // Jagged Array
        System.out.println();
//______________________________________________________________________________________________________________________

        int jagged[][]=new int[3][];
        jagged[0]=new int[5];
        jagged[1]=new int[2];
        jagged[2]=new int[3];

        for ( int i =0; i<jagged.length;i++){
            for ( int j=0; j<jagged[i].length;j++){
                jagged [i][j] = (int) (Math.random()*100);
                System.out.print(jagged[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
//______________________________________________________________________________________________________________________

    //Enhanced For Loops OR For-Each loop

        int jagged2[][]=new int[3][];
        jagged2[0]=new int[3];
        jagged2[1]=new int[2];
        jagged2[2]=new int[4];

        for ( int i =0; i<jagged2.length;i++){
            for ( int j=0; j<jagged2 [i].length;j++){
                jagged2 [i][j] = (int) (Math.random()*100);
            }
        }
// remember the syntax which is regular use in array

        for(int n[]: jagged2)
        {
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        System.out.println();
//______________________________________________________________________________________________________________________
    }
}
