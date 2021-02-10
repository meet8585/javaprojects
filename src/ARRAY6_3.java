public class ARRAY6_3 {
    public static void main(String[] args)
    {
        int a[] = new int [5];
        a[0] =2;
        a[1] =6;
        a[2] =8;
        a[3] =4;
        a[4] =1;
        for (int i = 0; i <5; i++)
        System.out.println(a[i]);

        int b[] = new int [5];
        for (int i=0; i<b.length; i++)
        {
            b[i]= i+1;
        }
        for (int i : b) //enhanced for loop
            System.out.println(i);
    }
}
