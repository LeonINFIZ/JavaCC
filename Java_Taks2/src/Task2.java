public class Task2 {

    public static void main(String [] args)
    {
        int[] arr1 = new int[]{1, 6, 1, 2, 4, 5, 6, 7, 8, 3};
        int[] arr2 = new int[]{1, 6, -1, 2, 4, 5, 6, 7, 8, 3};

        boolean okFirst = true;
        for(int i=0; i<5; i++)
        {
            if(arr1[i]<0) {
                okFirst = false;
                break;
            }
        }

        if(okFirst==true)
        {
            int summ = 0;
            for(int i=0; i<5; i++)
            {
               summ+=arr1[i];
            }

            System.out.println("Сумма первых 5 чисел = "+summ);
        }


        okFirst = true;
        for(int i=0; i<5; i++)
        {
            if(arr2[i]<0) {
                okFirst = false;
                break;
            }
        }

        if(okFirst==false)
        {
            int prod = 1;
            for(int i=5; i<10; i++)
            {
                prod*=arr2[i];
            }

            System.out.println("Произведение 5-10 чисел = "+prod);
        }


    }
}
