public class telusko
 {
     public static void main(String [] args)
     {
         int i, j, k;
         i=1;
         j=6;
         k= i +j;
         System.out.println("The addition is: " +i + "and" +j + "is" + k);
         System.out.printf("The addition of %d and %d is %d", i,j,k);


         //POST AND PRE INCREMENT
         int a = 5;
         a = a+1;
         System.out.println(a);

         //bitwise operator

         int num1= 25;             // 1 1 0 0 1
         int num2 =15;             // 0 1 1 1 1
                                   // 1 1 1 1 1 -> 31
                                   // 0 1 0 0 1 -> 9

         int num3 = num1 & num2;
         System.out.println(num3);

         int num4= 25;
         int num5 =15;
         // 1 1 1 1 1 -> 31
         // 0 1 0 0 1 -> 9

         int num6 = num4 | num5;
         System.out.println(num6);


         // left and right shift operators

         int ab = 8;       // 1 0 0 0
         int cd =  ab << 2; // 1 0 0 0 0 0 --> 32
         System.out.println(cd);

     }

 }
