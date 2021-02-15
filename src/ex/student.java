package ex;

public class student
{
    private int rollno;
    private String sname;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;


    }

    @Override
    public String toString() {
        return "student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                '}';
    }
}
