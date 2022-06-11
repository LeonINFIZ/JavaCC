public class Student extends Person{

    String group;
    int[]marks=new int[5];

    Student(){
        surname = "";
        name = "";
        patronymic = "";
        age = 0;
    }
    Student(String _surname, String _name, String _patronymic, int _age, int[]_marks)
    {
        surname = _surname;
        name = _name;
        patronymic = _patronymic;
        age = _age;


        for(int i=0; i<_marks.length;i++)
        {
            marks[i]=_marks[i];
        }

    }

    public int getMarksAverage(){
        int markAvegae = 0;

        for(int i=0; i<marks.length; i++)
        {
            markAvegae+=marks[i];
        }

        return markAvegae;
    }

    public boolean isExcellentStudent()
    {
         return getMarksAverage()>=23;
    }

    static Student getBetterStudentByAverage(Student st1,Student st2,Student st3)
    {
        int bestStudent = 1;
        int max = st1.getMarksAverage();
        if(st2.getMarksAverage()>max) {
            max = st2.getMarksAverage();
            bestStudent = 2;
        }
        if(st3.getMarksAverage()>max){
            max = st3.getMarksAverage();
            bestStudent = 3;
        }

        if(bestStudent == 1)
            return st1;
        else if(bestStudent == 2)
            return st2;
        else return st3;
    }

    public void showMarks(){
        System.out.print(name+" marks: ");
        for(int i=0; i<marks.length; i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[]args)
    {
        Student man1 = new Student();
        man1.surname="Topalov";
        man1.name="Artem";
        man1.patronymic="Volodymyrovych";
        man1.age = 20;

        for(int i=0; i< man1.marks.length; i++)
        {
            int rand;
            do{rand = (int) (Math.random()*5);}while(rand<3);
            man1.marks[i] = rand;
        }

        Student man2 = new Student();
        man2.surname="Sorochynsʹkyy";
        man2.name="Denys";
        man2.patronymic="Ihorovych";
        man2.age = 20;

        for(int i=0; i< man2.marks.length; i++)
        {
            int rand;
            do{rand = (int) (Math.random()*5);}while(rand<3);
            man2.marks[i] = rand;
        }

        Student man3 = new Student();
        man3.surname="Krasovsʹkyy";
        man3.name="Dmytro";
        man3.patronymic="Olehovych";
        man3.age = 20;

        for(int i=0; i< man3.marks.length; i++)
        {
            int rand;
            do{rand = (int) (Math.random()*5);}while(rand<3);
            man3.marks[i] = rand;
        }


        System.out.println(man1.getFullName());

        if(isAdult(man1))
        {
            System.out.println(man1.name+" - is adult");
        }

        System.out.println("Average student grade "+man1.name+": "+man1.getMarksAverage());
        System.out.print("Is student "+man1.name+" an excellent student? - ");
        if(man1.isExcellentStudent())
            System.out.println("Yes");
        else System.out.println("No");

        man2.showMarks();

        System.out.println("Best student is - "+getBetterStudentByAverage(man1,man2,man3).name);

    }
}
