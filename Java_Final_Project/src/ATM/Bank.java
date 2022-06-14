package ATM;

import java.util.ArrayList;

public class Bank {


    public static ArrayList <Integer> login = new ArrayList<>();
    public static ArrayList <Integer> password = new ArrayList<>();

    public static void setNewClient(int log, int pass)
    {
        login.add(log);
        password.add(pass);
    }

    public static boolean correctnessEnteredData(int log, int pass){

        boolean logIsTrue = false;
        for (int LOGIN : login)
        {
            if(log==LOGIN)
            {
                logIsTrue = true;
                break;
            }
        }

        if(logIsTrue)
        {
            for (int PASS : password)
            {
                if(pass == PASS)
                {
                    return true;
                }
            }
        }

        return false;
    }

}
