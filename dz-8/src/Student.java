public class Student {

    static int defaultId = 0;
    private int id;
    private String name;
   private String secondName;

    public Student() {
        defaultId++;
        this.id = defaultId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Student(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }
}
