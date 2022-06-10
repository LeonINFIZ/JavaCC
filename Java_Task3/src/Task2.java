public class Task2 {


    public static void main(String[]args)
    {
        String text = "I    am  learning    Java   Core», we have to get the \"I'm learning Java Core";
        text = text.replaceAll("( )+", " ");

        System.out.println(text);

    }
}
