import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Time {

    private static LocalDateTime start;
    private static LocalDateTime end;
    public static double RESULT;

    private static void START()
    {
        start = LocalDateTime.now();
    }

    private static void STOP()
    {
        end = LocalDateTime.now();

        RESULT = ChronoUnit.MILLIS.between(start, end);
    }


    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        START();

        arrayList.add("1");

        STOP();
        System.out.println("\nArrayList = " +RESULT+" (ms)");

        START();

        linkedList.add("1");

        STOP();
        System.out.println("\nLinkedList = " +RESULT+" (ms)");

    }
}
