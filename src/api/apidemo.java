package api;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class apidemo

{
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12,20,35,44,55,68,75);

        System.out.println(values.stream()
                                 .filter(i -> i%5 == 0)
                                 .reduce(0,(c,e) -> c+e));
    }
}
