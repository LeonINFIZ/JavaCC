package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void newClient()
    {
       int log; int pass;

       System.out.println("[БАНКОМАТ.НОВЫЙ КЛИЕНТ]\n");
       System.out.print("Введите ваш новый индитификатор: ");

       Scanner in = new Scanner(System.in);
       log = in.nextInt();

       System.out.print("Введите ваш новый PIN-код: ");

       pass = in.nextInt();

       Bank.setNewClient(log,pass);
    }

    public static int currentLog = -1;
    public static int currentPass = -1;

    public static void main(String[]args)
    {
        newClient();
        ATM.startATM();
    }
}
