import java.util.Random;

public class enhancedloop6_10 {
    public static void main(String[] args)
    {
        int [] nums = new int [10];
        Random r = new Random ();
        for(int i =0 ; i <10 ;i++)
        {
            nums[i]=r.nextInt(50);

        }
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
