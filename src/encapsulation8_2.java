public class encapsulation8_2
{
    public static void main(String[] args)
    {
        Emp e1 = new Emp();
        e1.setEmpId(3);
        e1.setEmpName("Meet");
        Emp e2 = new Emp();
        e2.setEmpId(6);
        e2.setEmpName("Patel");
        Emp e3 = new Emp();
        System.out.println(e1.getEmpName());
    }
}
class Emp
{
    private int empId;
   private  String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
