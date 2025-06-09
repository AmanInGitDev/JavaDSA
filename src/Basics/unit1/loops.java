public class loops {
    public static void main(String[] args) {


   //WHILE LOOPS

        int i = 1;
        while (i < 5) {
            System.out.println("I am do loop "+i);
            // '+' Symbol also used to concatenate things.
            i++;
        }
        System.out.println("Bye " +i);
        // Here the o/p will be Bye 5 because whenever the condition get false this code will be executed.
        System.out.println();


        while (true){
            System.out.println("Hello World");
            break;
        }
        System.out.println();


        int a=1;
        while(a<=3){
            System.out.println("hii "+a);
            int b=1;
            while(b<=2){
                System.out.println("   buddy"+b);
                b++;
            }
            a++;
        }
        System.out.println();


    //DO WHILE LOOPS

        int c = 0;
        do{
            System.out.println("I am do-while loop "+c);
                c++;
        } while (c<=2);
        //Semicolon is necessary in do while loop after condition
        System.out.println();


    //FOR LOOPS

        for (int d=1; d<=3; d++){
            System.out.println("I am for loop "+d);
        }
        System.out.println();


        for (int x=1; x<=3; x++){
            System.out.println("Days "+x);
            for (int y=1; y<=6; y++){
                System.out.print("    Hour "+y + " - " +"Hour "+(y+1));
                System.out.println("");
            }
        }
        System.out.println();

        int z = 1;
        for (;z<=3;){
            System.out.println("I am different for loop and with number "+z);
            z++;
        }
        System.out.println();

    }
}
