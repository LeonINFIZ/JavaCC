import java.util.Scanner;

public class Task1 {

    public static void main(String [] args)
    {
        int[] daysInMounth = new int[12];
        daysInMounth[0] = 31;
        daysInMounth[1] = 28;
        daysInMounth[2] = 31;
        daysInMounth[3] = 30;
        daysInMounth[4] = 31;
        daysInMounth[5] = 30;
        daysInMounth[6] = 31;
        daysInMounth[7] = 31;
        daysInMounth[8] = 30;
        daysInMounth[9] = 31;
        daysInMounth[10] = 30;
        daysInMounth[11] = 31;




        Scanner in = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        int countOfDays = in.nextInt();

        if(countOfDays<1 && countOfDays>12) {
            System.out.println("Ошибка! Такого месяца не существует");
            return;
        }

        System.out.println("Дней в этом месяце: "+daysInMounth[countOfDays-1]);


    }

}
