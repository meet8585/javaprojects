package Innerclass15;

public class lambda
{
    public static void main(String[] args) {

        B obj1 = () -> {
            System.out.println("Hello");
        };
        obj1.show();




    }
}
@FunctionalInterface
interface  B  //sam - single abstract method interface till 1.7
{
    void show();

}