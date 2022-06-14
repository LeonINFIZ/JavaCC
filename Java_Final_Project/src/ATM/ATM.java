package ATM;

import java.util.Scanner;

public class ATM {

    public static void showTransaction(){
        System.out.println("\n[БАНКОМАТ.ТРАНЗАКЦИИ]");

        Check.showTransactions();

        menuATM();
    }

    public static void withdrawMoney()
    {
        System.out.print("[БАНКОМАТ.СНЯТЬ ДЕНЬГИ]\n" +
                "\n" +
                "Балланс: "+Check.accountBalance+" грн\n");

        int summ; boolean goNext = false;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("\nКакую сумму снять? : ");
            summ = in.nextInt();

            if(summ == 0)
                goNext=true;
        }while(summ<0 || summ>Check.accountBalance && !goNext);

        if(!goNext)
        Check.withdrawMoney(summ);

        menuATM();
    }

    public static void putMoney()
    {
        System.out.print("[БАНКОМАТ.ПОЛОЖИТЬ ДЕНЬГИ НА СЧЁТ]\n" +
                "\n" +
                "Балланс: "+Check.accountBalance+" грн\n" +
                "\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Сколько денег положить на счёт? : ");
        int SUMM = in.nextInt();

        Check.putMoney(SUMM);

        menuATM();
    }

    public static void moneyTransfer()
    {
        System.out.print("[БАНКОМАТ.СДЕЛАТЬ ПЕРЕВОД]\n" +
                "\n" +
                "Балланс: "+Check.accountBalance+" грн\n" +
                "\n");


        Scanner in = new Scanner(System.in);
        int TO;
        System.out.print("Номер счёта для перевода: ");
        TO = in.nextInt();

        int SUMM; boolean goNext = false;
        do{
            System.out.print("\nКакую сумму перевести? : ");
            SUMM = in.nextInt();

            if(SUMM == 0)
                goNext=true;
        }while(SUMM<0 || SUMM>Check.accountBalance && !goNext);

        if(!goNext)
        Check.setTransaction(SUMM, TO);

        menuATM();
    }

    public static void putDeposit(){
        System.out.print("[БАНКОМАТ.ПОЛОЖИТЬ ДЕНЬГИ НА ДЕПОЗИТ]\n" +
                "\n" +
                "Балланс: "+Check.accountBalance+" грн\n");

        int summ; boolean goNext = false;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("\nКакую сумму положить на депозит? : ");
            summ = in.nextInt();

            if(summ == 0)
                goNext=true;
        }while(summ<0 || summ>Check.accountBalance && !goNext);

        if(!goNext)
            Check.putDeposit(summ);

        menuATM();
    }
    public static void showCheck()
    {
        System.out.println("\n[БАНКОМАТ.СЧЁТ]\n" +
                "Балланс: "+Check.accountBalance+" грн\n" +
                "Балланс депозита: "+Check.depositBalance+" грн");

        menuATM();
    }
    public static void menuATM(){
        System.out.print("\n[БАНКОМАТ]\n" +
                "\n" +
                "1. Транзакции\n" +
                "2. Депозит\n" +
                "3. Снять деньги\n" +
                "4. Положить деньги на счёт\n" +
                "5. Сделать перевод\n" +
                "6. Посмотреть счёт\n");

        int answer;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("\nВыбор: ");
            answer = in.nextInt();
        }while(answer<1 || answer>6);

        if(answer==1)
        {
            showTransaction();
        }else if(answer==2)
        {
            putDeposit();
        }else if(answer==3)
        {
            withdrawMoney();
        }else if(answer==4){
            putMoney();
        }else if(answer==5){
            moneyTransfer();
        }else{
            showCheck();
        }

    }
    public static void startATM() {

        int log, pass;

        System.out.println("\n[БАНКОМАТ]");
        System.out.print("Введите свой индетификатор: ");
        Scanner in = new Scanner(System.in);
        log = in.nextInt();
        System.out.print("Введите свой PIN-код: ");
        pass = in.nextInt();

        if (Bank.correctnessEnteredData(log, pass)) {
            Client.currentLog = log;
            Client.currentPass = pass;


            menuATM();

        } else
        {
            System.out.println("Неправильный индетификатор или пароль.\n");
            startATM();
        }
    }
}
