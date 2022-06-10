import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

    public static void main(String [] args) {

        ArrayList<Integer> array = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int num = 0;

        do {
            System.out.print("Число = ");
            num = in.nextInt();
            if(num >= 0)
            array.add(num);
        } while(num >= 0);


        int prod = 1;
        for(int i=0; i<array.size(); i++)
        {
            prod *= array.get(i);
        }
        System.out.print("Произведение всех чисел = "+prod);


    }

}
