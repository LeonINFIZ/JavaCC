public class Task3 {

    public static void main(String [] args){

        int []arr = new int[]{-1,3,-5,2,6};

        System.out.print("arr = {  ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"["+i+"]  ");
        }
        System.out.println("}");

        int secondPositive = -1;
        int numOfPositive = -1;
        boolean fistPositive = false;
        for(int i=0; i<arr.length; i++)
        {
            if(fistPositive == false && arr[i]>0)
            {
                fistPositive = true;
                continue;
            }

            if(fistPositive == true && arr[i]>0)
            {
                secondPositive = arr[i];
                numOfPositive = i;
                break;
            }
        }

        System.out.println("Второе положительное число = "+secondPositive+"["+numOfPositive+"]");

        int min = arr[0];
        int numOfMin = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
                numOfMin = i;
            }
        }

        System.out.print("Минимальное число:    "+min+"["+numOfMin+"]");



    }

}
