import java.util.ArrayList;

public class Task3 {
    public static void main(String[]args)
    {
        String str = "1000 hryvnias will be equal to $33.83 dollars, and 500 hryvnias will be equal to $16.92.";

        ArrayList<Integer> indexOfOccurrence = new ArrayList<Integer>();

        boolean weHaveDot = false;
        boolean goPrint = false;
        int numEnd = 0;
        for(int i=0; i< str.length(); i++)
        {

            if(i>numEnd && weHaveDot)
            {
                goPrint = false;
                weHaveDot = false;
                System.out.println();
            }

            if(goPrint && !Character.isDigit(str.charAt(i)) && str.charAt(i) != '.')
            {
                goPrint = false;
                System.out.println();
            }

            if(goPrint && str.charAt(i) == '.')
            {
                weHaveDot = true;
                numEnd = i+2;

                if(!Character.isDigit(str.charAt(i+1)))
                {
                    goPrint = false;
                    weHaveDot = false;
                    numEnd = 0;
                    System.out.println();
                }
            }

            if(str.charAt(i) == '$' || goPrint)
            {
                System.out.print(str.charAt(i));
                goPrint = true;
            }

        }
    }
}
