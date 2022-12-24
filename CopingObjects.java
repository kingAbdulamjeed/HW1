import java.util.Arrays;

/**
 * Created by Lab on 24/12/2022.
 */
public class CopingObjects {
    public static void main(String[] args) {
        Student s1[]=new Student[2];
        s1[0]=new Student(10,"A");
        s1[1]=new Student(20,"B");
        Student s2[]=s1.clone();
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        System.out.println("after apdating s[0]");
        s1[0].id=33;
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));



    }
}
