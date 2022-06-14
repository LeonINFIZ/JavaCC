package ATM;

import java.util.ArrayList;

public class Check {

    public static int accountBalance;
    public static int depositBalance;

    public static void putDeposit(int SUMM)
    {
        accountBalance-=SUMM;
        depositBalance+=SUMM;
        Transaction.putDeposit(SUMM);
    }
    public static void putMoney(int SUMM)
    {
        accountBalance+=SUMM;
        Transaction.putMoney(SUMM);
    }
    public static void withdrawMoney(int SUMM)
    {
        accountBalance-=SUMM;
        Transaction.withdrawMoney(SUMM);
    }
    public static void setTransaction(int SUMM, int TO){
        accountBalance-=SUMM;
        Transaction.setTransaction(SUMM, TO);
    }
    public static void showTransactions(){
        for(int i=0; i<Transaction.transaction.size(); i++)
        {
            System.out.println(Transaction.transaction.get(i));
        }
    }

}
