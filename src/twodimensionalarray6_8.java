public class twodimensionalarray6_8 {
    public static void main(String[] args)
    {
        int a[] = {5,6,7,8};
        int b[] = {6, 7, 8, 9};
        int c[] = {3,5,6,7};

        int p[][] =
                {
                        {5,6,7,8},
                        {6,7,8,9},
                        {3,5,6,7}

                };
        //enhanced loop in 2d array
        for(int i[] : p)
        {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        /*
            for (int i=0; i<4; i++)
            {
                for(int j=0; j<4;j++) {
                    System.out.print(p[i][j] + " ");
                }
                System.out.println("");
            }

         */

    }
}
