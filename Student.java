/**
 * Created by Lab on 24/12/2022.
 */
public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "(" + id + "," + name + ')';
    }
}
