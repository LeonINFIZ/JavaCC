import java.util.Scanner;

public class Task1 {

    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 5 words separated by a space: ");

        String[]line = new String[5];

        line[0] = in.next();
        line[1] = in.next();
        line[2] = in.next();
        line[3] = in.next();
        line[4] = in.next();

        int size = line[0].length();

        int indexMaxLenght = -1;

        for(int i=0; i<5; i++)
        {
            if(line[i].length()>size) {
                size = line[i].length();
                indexMaxLenght = i;
            }
        }

        System.out.println("Самое длинное слово: "+line[indexMaxLenght]+", его длина = "+line[indexMaxLenght].length()+" символов.");

        System.out.print("Второе слово ("+line[1]+"), задом на перед = ");

        line[1] = new StringBuilder(line[1]).reverse().toString();

        System.out.print(line[1]);


    }
}
