import java.util.Arrays;

/**
 * Created by Lab on 24/12/2022.
 */
public class Coping {
    public static void main(String[] args) {
        int[]x={11,12,13,14,15};
        int[]y=x.clone();
        x[0]=100;
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

    }
}
