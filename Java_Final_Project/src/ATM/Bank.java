package ATM;

import java.util.ArrayList;

public class Bank {


    private static ArrayList <String> login;
    private static ArrayList <String> password;

    public static void setNewClient(String log, String pass)
    {
        login.add(log);
        password.add(pass);
    }

    public static boolean correctnessEnteredData(String log, String pass){

        boolean logIsTrue = false;
        for (String LOGIN : login)
        {
            if(log.equals(LOGIN))
            {
                logIsTrue = true;
                break;
            }
        }

        if(logIsTrue)
        {
            for (String PASS : password)
            {
                if(pass.equals(PASS))
                {
                    return true;
                }
            }
        }

        return false;
    }

}
