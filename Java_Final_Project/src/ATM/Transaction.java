package ATM;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Transaction {

    public static ArrayList<String> transaction = new ArrayList<>();

    public static Date time = new Date();
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    public static void putMoney(int SUMM){
        transaction.add(formatter.format(time)+"\t| +"+SUMM+" грн\t| Пополнение счёта");

    }
    public static void withdrawMoney(int SUMM){
        transaction.add(formatter.format(time)+"\t| -"+SUMM+" грн\t| Снятие наличных");

    }

    public static void putDeposit(int SUMM){
        transaction.add(formatter.format(time)+"\t| -"+SUMM+" грн\t| Пополнение депозита");

    }
    public static void setTransaction(int SUMM, int TO){
        transaction.add(formatter.format(time)+"\t| -"+SUMM+" грн\t| Перевод для: "+TO);

    }

}
