import java.util.Locale;
import java.util.Scanner;

public class stringoperation9_1
{
    public static void main(String[] args)
    {
        String s1, s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 2 string");
        s1 = sc.nextLine();
        s2= sc.nextLine();

        int l1 = s1.length();
        int l2 = s2.length();

        String s3 = s1 + s2;   //s1.concat(s2);
        System.out.println("Result of concatination is : " + s3);

        System.out.println("String 1 length is : " + l1);
        System.out.println("String 2 length is : " + l2);


        s1 = s1.toUpperCase();

        System.out.println("First string in upper case : " + s1);

        Student s = new Student(11, "Meet");
        System.out.println(s.rollno);
        System.out.println(s.sname);

    }
}
class Student
{
    int rollno;
    String sname;

    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }
}