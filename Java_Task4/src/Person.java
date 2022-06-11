public class Person {
    String surname;
    String name;
    String patronymic;
    int age;


    public static boolean isAdult(Person p)
    {
        return p.age >= 18;
    }

    public String getFullName()  {

        String FullName = "";

        if(surname.equals("") || name.equals("") || patronymic.equals("")) {
            System.out.print("Поле ФИО не заполнено полностью.");
            return "";
        }
        else   FullName = surname + " " + name + " " + patronymic;

        return FullName;
    }

}
