import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


     Student student1 = new Student("Igor","Vasilich");
     Student student2 = new Student("Ivan","Vdad");
     Student student3 = new Student("Den","Milaenko");




     ArrayList<Student> myStudents = new ArrayList<Student>();
     myStudents.add(student1);
     myStudents.add(student2);
     myStudents.add(student3);


     StudentsGroup groupNumberOne = new StudentsGroup(student1, myStudents);
     System.out.println(groupNumberOne);
     System.out.println();

    }
}