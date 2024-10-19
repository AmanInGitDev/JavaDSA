class Student{
    String name;
    int rollno;
    double marks;
}

public class arrayex4 {
    public static void main(String[] args) {

        Student std1 = new Student();
        std1.name = "Aman";
        std1.rollno = 101;
        std1.marks = 93.14;

        Student std2 = new Student();
        std2.name = "Vipul";
        std2.rollno = 102;
        std2.marks = 95.67;

        Student std3 = new Student();
        std3.name = "Thanga";
        std3.rollno = 103;
        std3.marks = 32.67;

        Student std[] = new Student[3];
        std[0] = std1;
        std[1] = std2;
        std[2] = std3;

        for (int i = 0; i <std.length; i++) {
            System.out.println(std[i].name + " : " + std[i].rollno + " : " + std[i].marks);
        }
        System.out.println();
    }
}
