import java.util.ArrayList;

public class StudentsGroup {

    private Student starosta;
    private ArrayList<String> tasks = new ArrayList<String>();

    private ArrayList<Student> listOfStudents = new ArrayList<Student>();

    public StudentsGroup(Student starosta, ArrayList<Student> listOfStudents) {
        this.starosta = starosta;
        this.listOfStudents = listOfStudents;
    }

    public Student getStarosta() {
        return starosta;
    }

    public void setStarosta(Student starosta) {
        this.starosta = starosta;
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public void addtask(String task) {
        tasks.add(task);
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
    }

    public void deleteStudent(Student student) {
        listOfStudents.remove(student);
    }

}
