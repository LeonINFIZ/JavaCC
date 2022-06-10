import java.util.Scanner;

public class Person {

    public String name;
    public int birthYear;
    public int age;

    public String getName()  { return name; }
    public int getBirthYear()  { return birthYear; }

    public Person()
    {
        age = -1;
        name = "Name";
        birthYear = 2000;
    }

    public Person(String name, int birthYear)
    {
        age = -1;
        this.name = name;
        this.birthYear = birthYear;
    }

    public void age(){age = 2022-birthYear;}
    public void input()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        name = in.nextLine();

        System.out.print("The birthday year: ");
        birthYear = in.nextInt();

    }
    public void output()
    {
        System.out.println("\nInfo:\nName: "+name+"\nThe birthday year: "+birthYear);
        if(age!=-1)
            System.out.println("Age: "+age+"\n");
    }

    public void changeName(String newName)
    {
        name = newName;
    }

    public static void main(String [] args)
    {
        Person person1 = new Person();
        person1.input();
        person1.age();
        person1.changeName("["+person1.name+"]");
        person1.output();

        Person person2 = new Person("Second Person", 1992);
        person2.age();
        person2.changeName("["+person2.name+"]");
        person2.output();

        Person person3 = new Person();
        person3.input();
        person3.age();
        person3.changeName("["+person3.name+"]");
        person3.output();

    }

}
